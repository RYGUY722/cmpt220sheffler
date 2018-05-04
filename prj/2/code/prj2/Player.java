package prj2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Player extends GameEntity{
	int maxmp;
	int mp;
	int level;
	Object spells[][]=new Object[0][6]; //contains all known spells
	Object allspells[][]=new Object[0][6]; //contains all learnable spells
	
	Player(String name){
		this.name=name;
		level=1;
		maxhealth=(int) (Math.random()*20+30);
		health=maxhealth;
		maxmp=(int) (Math.random()*10+20);
		mp=maxmp;
		attack=(int) (Math.random()*20)+5;
		defense=(int) (Math.random()*20)+5;
		mental=(int) (Math.random()*20)+5;
		speed=(int) (Math.random()*20)+5;
		precision=(int) (Math.random()*20)+5;
		try {
			getSpells();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "ERROR: CORE FILES NOT FOUND (spells.txt)");
			System.exit(0);
		}
		System.out.println("You cautiously open the door to the dungeon and step inside...");
	}
	
	Player(String name, int level, int maxhealth, int maxmp, int attack, int defense, int mental, int speed, int precision){
		this.name=name;
		this.level=level;
		this.maxhealth=maxhealth;
		health=maxhealth;
		this.maxmp=maxmp;
		mp=maxmp;
		this.attack=attack;
		this.defense=defense;
		this.mental=mental;
		this.speed=speed;
		this.precision=precision;
		try {
			getSpells();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "ERROR: CORE FILES NOT FOUND (spells.txt)");
			System.exit(0);
		}
	}
	
	public void getSpells() throws FileNotFoundException {
		Scanner spellin=new Scanner(new File("../data/data/spells.txt"));
		while(spellin.hasNext()) {//Setup allspells
			Object[][] temp = new Object[allspells.length + 1][6];
            for(int x=0;x<allspells.length;x++) {
                for(int y=0;y<6;y++) {
                	temp[x][y]=allspells[x][y];
                }
            }
            allspells=temp.clone();
            for(int x=0;x<6;x++) {
            	if(x==1||x==2||x==4)
            		allspells[allspells.length-1][x] = Double.parseDouble(spellin.nextLine());
            	else
            		allspells[allspells.length-1][x] = (String)spellin.nextLine();
            	//System.out.println(allspells[allspells.length-1][x]+", "+x);
            }
		}
		spellin.close();
        for(int z=0;z<allspells.length;z++) { //Learn all learnable spells
        	if((((Double) allspells[z][1]).intValue())<=level) { //If you're the level or higher
        		Object[][] temp = new Object[spells.length + 1][6];
                for(int x=0;x<spells.length;x++) {
                    for(int y=0;y<6;y++) {
                    	temp[x][y]=spells[x][y];
                    }
                }
                spells=temp.clone();
                spells[z]=allspells[z];
        	}
        }
	}
	
	//Accessors
	
	public int getMaxMP() {
		return maxmp;
	}
	public int getMP() {
		return mp;
	}
	public String listSpells() {
		String spell="";
		for(int x=0;x<spells.length;x++) {
			spell+=", "+spells[x][0];
		}
		spell+=".";
		return spell;
	}
	public boolean checkSpellValid(String name) {
		if(spells.length==0)
			return false;
		for(int x=0;x<spells.length;x++) {
			if(name.equals(((String) spells[x][0]).toLowerCase())) {
				if(mp>=(((Double)(spells[x][2])).intValue())) {
					return true;
				}
				else {
					System.out.println("Not enough mana!");
					return false;
				}
			}
		}
		System.out.println("Not a valid spell!");
		return false;
	}
	public void describeSpells() {
		for(int x=0;x<spells.length;x++) {
			System.out.println(spells[x][0]+":");
			System.out.println("	"+spells[x][5]);
		}
	}
	public int getSpellNumber(String spellname) {
		int count=-1;
		while(true) {
			count++;
			if(spellname.equals(((String) spells[count][0]).toLowerCase()))
				return count;
		}
	}
	public String getSpellName(int spellnum) {
		return (String) spells[spellnum][0];
	}
	public String getSpellElement(int spellnum) {
		return (String) spells[spellnum][3];
	}
	
	//Battle
	public void takeDamage(int damage, boolean isMagic) {
		if(isMagic) {
			health-=Math.round(((double)damage*(100.0/(100.0+(double)mental))));
			System.out.println("You took "+Math.round(((double)damage*(100.0/(100.0+(double)mental))))+" damage!");
		}
		else {
			health-=Math.round(((double)damage*(100.0/(100.0+(double)defense))));
			System.out.println("You took "+Math.round(((double)damage*(100.0/(100.0+(double)defense))))+" damage!");
		}
	}
	
	public int calcSpellDamage(int spellnum) {
		mp-=(Double)spells[spellnum][2];
		if(spells[spellnum][3].equals("heal")) { //If it's a healing spell
			health+=(int) (mental*((Double)spells[spellnum][4]))/2;
			return 0;
		}
		else if(spells[spellnum][3].equals("physical")) { //If it's a physical skill
			return (int) (attack*((Double)spells[spellnum][4]));
		}
		else { //Other elemental magic
			return (int) (mental*((Double)spells[spellnum][4]));
		}
	}
	
	//Out of battle
	
	public void levelUp() {
		level++;
		maxhealth+=(int) (Math.random()*8+3); //Increase stats & reset health/mp
		health=maxhealth;
		maxmp+=(int) (Math.random()*2+2);
		mp=maxmp;
		attack+=(int) (Math.random()*5)+2;
		defense+=(int) (Math.random()*4)+2;
		mental+=(int) (Math.random()*4)+2;
		speed+=(int) (Math.random()*6)+2;
		precision+=(int) (Math.random()*4)+3;
		 for(int z=0;z<allspells.length;z++) { //Learn all learnable spells
	        	if((((Double) allspells[z][1]).intValue())<=level) { //If you're the level or higher
	        		Object[][] temp = new Object[spells.length + 1][6];
	                for(int x=0;x<spells.length;x++) {
	                    for(int y=0;y<6;y++) {
	                    	temp[x][y]=spells[x][y];
	                    }
	                }
	                spells=temp.clone();
	                spells[z]=allspells[z];
	        	}
	        }
	}
}
