package prj2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Enemy extends GameEntity{
	String element;
	String description;
	Object actions[][]=new Object[5][3];
	Enemy(){
		init(0);
	}
	Enemy(int enemynum){
		init(enemynum);
	}
	private void init(int enemynum) { //Fetches enemy stats
		try {
			Scanner enemyin=new Scanner(new File("../data/data/enemy.txt"));
			for(int x=0;x<=enemynum;x++) {
				name=enemyin.nextLine();
				description=enemyin.nextLine();
				maxhealth=enemyin.nextInt();
				health=maxhealth;
				attack=enemyin.nextInt();
				defense=enemyin.nextInt();
				mental=enemyin.nextInt();
				speed=enemyin.nextInt();
				precision=enemyin.nextInt();
				enemyin.nextLine();
				element=enemyin.nextLine();
				for(int y=0;y<5;y++) { //Fills the actions array with all possible actions
					actions[y][0]=enemyin.nextLine(); //Action text
					actions[y][1]=enemyin.nextLine(); //magic vs physical vs heal
					actions[y][2]=Integer.parseInt(enemyin.nextLine()); //Damage
				}
			}
			enemyin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "ERROR: CORE FILES NOT FOUND (enemy.txt)");
			System.exit(0);
		}	
	}
	public void describe() {
		System.out.println(name+":");
		System.out.println("	"+description);
	}
	
	//Battle
	
	public void takeDamage(int damage, String element) {
		if(element.equals("physical")) {
			health-=(damage*(100/(100+defense)));
			System.out.println(name+" took "+(damage*(100/(100+defense)))+" damage.");
		}
		else if(isWeak(element)) {
			health-=(damage*(100/(40+mental)));
			System.out.println(name+" was weak to "+element+"!");
			System.out.println(name+" took a boosted "+(damage*(100/(40+mental)))+" damage!");
		}
		else if(isStrong(element)) {
			health-=(damage*(100/(175+mental)));
			System.out.println(name+" was strong against "+element+"!");
			System.out.println(name+" only took a reduced "+(damage*(100/(175+mental)))+" damage.");
		}
		else {
			health-=(damage*(100/(100+mental)));
			System.out.println(name+" took "+(damage*(100/(100+mental)))+" damage.");
		}
	}
	
	public int generateAction() { //Randomly generates an action for the enemy to perform.
		//The first two actions will be the most common actions.
		//The last action is a desperation move (DM), happening rarely normally, but very often at low health.
		//Returns the number of the action performed
		int action=(int) (Math.random()*100);
		if((health<(.35*maxhealth))&&action<87){ //If health is low, 87% chance of using action 5 (DM)
			return 4;
		}
		if(action<30) { //30% chance of action 1
			return 0;
		}
		else if(action<60) { //30% chance of action 2
			return 1;
		}
		else if(action<77) { //17% chance of action 3
			return 2;
		}
		else if(action<95) { //18% chance of action 4
			return 3;
		}
		else{ //5% chance of action 5 (DM)
			return 4;
		}
	}
	
	public String getActType(int actnum) {
		return (String) actions[actnum][1];
	}
	public int act(int actnum) {
		System.out.println(actions[actnum][0]);
		return (int) actions[actnum][2];
	}
	
	
	
	/*ELEMENTS:
	 * Nothing is weak/strong against physical
	 * Fire is strong to electric, but weak to water
	 * Water is strong to fire, but weak to electric
	 * Electric is strong to water, but weak to fire
	 * Almighty is weak to itself
	 */
	
	public boolean isWeak(String element) { //Checks if the enemy is weak to the given element
		if(element.equals("almighty")&&this.element.equals("almighty"))
			return true;
		else if(element.equals("fire")&&this.element.equals("electric"))
			return true;
		else if(element.equals("water")&&this.element.equals("fire"))
			return true;
		else if(element.equals("electric")&&this.element.equals("water"))
			return true;
		else
			return false;
	}
	public boolean isStrong(String element) { //Checks if the enemy is strong against the given element
		if(element.equals("electric")&&this.element.equals("fire"))
			return true;
		else if(element.equals("fire")&&this.element.equals("water"))
			return true;
		else if(element.equals("water")&&this.element.equals("electric"))
			return true;
		else
			return false;
	}
	
}
