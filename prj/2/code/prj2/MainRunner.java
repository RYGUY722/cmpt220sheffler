package prj2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainRunner {
	static Player player;
	static Enemy enemy;
	static int enemynum=0;
	static Scanner userin=new Scanner(System.in);
	public static void main(String[] args) {
		startGame(); //Start game
			//Load/Start new
			//Initialize player and enemy values
		
		mainTurn(); //MAIN LOOP
			//Conduct turn
	}
	
	
	private static void startGame() { //Initialize the game. Allow either a new game to start or load one from a save file.
		//Scanner userin=new Scanner(System.in);
		System.out.println("Would you like to start a new game or load one? (\"start\" or \"load\")"); 
		boolean complete=false;
		while(!complete) {
			String choice=userin.nextLine().toLowerCase();
			if(choice.equals("start")) {
				System.out.print("Enter player name: ");
				player=new Player(userin.nextLine());
				complete=true;
			}
			else if(choice.equals("load")) {
				try {
					load();
				} catch (FileNotFoundException e) {
					System.out.println("wow something didn't work, huh.");
					e.printStackTrace();
				}
				complete=true;
			}
			else {
				System.out.println("Please enter either \"start\" or \"load\"");
			}
		}
		enemy=new Enemy(enemynum);
		//userin.close();
		System.out.println("A "+enemy.getName()+" approaches!");
	}
	
	//Battle
	
	private static void mainTurn() {
		while(true) {
			//Determine who goes first
			deathCheck();
			playerStatus();
			boolean playfirst=player.getSpeed()>=enemy.getSpeed();
			if(!playfirst) {
				System.out.println("The enemy has the advantage!");
			}
			else {
				System.out.println("You're faster than the enemy! ");
			}
			String act=playerDecision(); //Determine player action
			//Carry out actions in order
				//Resolve damage
				//Add effects
			if(playfirst) { //Player goes first
				playerTurn(act);
				deathCheck();
				enemyTurn();
			}
			else { //Player goes second
				enemyTurn();
				deathCheck();
				playerTurn(act);
			}
		}
	}
	
	private static void deathCheck() {
		if(player.getHP()<=0) {
			System.out.println("You died.");
			startGame();
		}
		else if(enemy.getHP()<=0) {
			System.out.println(enemy.getName()+" dissolved into dust and disappeared.");
			player.levelUp();
			enemynum++;
			try {
				save();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			enemy=new Enemy(enemynum);
			System.out.println("A "+enemy.getName()+" approaches!");
		}
	}
	
	private static void playerStatus() {
		System.out.println("-------------");
		System.out.printf("|%11s|\n", player.getName());
		System.out.printf("|Lv. %7d|\n", player.level);
		System.out.println("-------------");
		System.out.printf("|HP: %3d/%3d|\n", player.getHP(), player.getMaxHP());
		System.out.printf("|MP: %3d/%3d|\n", player.getMP(), player.getMaxMP());
		System.out.println("-------------");
	}
	
	
	private static String playerDecision() { //Takes in the player's input, checks that it is a valid ability, then return it.
		//Scanner userin=new Scanner(System.in);
		boolean isComplete=false;
		String act="";
		while(!isComplete) {
			System.out.println("What do you do? (\"Help\" for available commands) ");
			act=userin.nextLine().toLowerCase();
			if(act.equals("help")) { //If the selected action is help
				System.out.println("Your current abilities are:");
				System.out.println("Attack, Describe Enemy, Describe Abilities"+player.listSpells());
			}
			else if(act.equals("describe enemy")) {
				enemy.describe();
			}
			else if(act.equals("describe abilities")) {
				System.out.println("Attack:");
				System.out.println("	A simple attack with your sword. Doesn't expend too much energy, but it can critically strike.");
				player.describeSpells();
			}
			else if(act.equals("attack")) {
				isComplete=true;
			}
			else if(player.checkSpellValid(act)) {
				isComplete=true;
			}
			else { //If the selected action is not valid
				System.out.println("That action is not valid.");
			}
		}
		//userin.close();
		return act;
	}
	
	
	private static void playerTurn(String act) { //Executes the player's desired action
		if(act.equals("attack")) { //Player basic attacks
			boolean crit=(Math.random()*300)<player.getPrecision();
			if(crit)
				System.out.println("You feel power coursing through you!");
			System.out.println("You take a swing at the enemy...");
				if((Math.random()*(player.getPrecision()+(100/(100+player.getPrecision()))))<=player.getPrecision()) //If the attack hits
					enemy.takeDamage(player.calcDamage(false, crit), "physical");
				else
					System.out.println("But you missed!");
		}
		else { //If not attacking (and input is valid), it must be a spell
			int spellnum=player.getSpellNumber(act);
			System.out.println("You charge up, and cast "+player.getSpellName(spellnum)+"!");
			if((Math.random()*(player.getPrecision()+(100/(100+player.getPrecision()))))<=(1.5*player.getPrecision())) //If the spell hits (spells are more likely to hit)
				enemy.takeDamage(player.calcSpellDamage(spellnum), player.getSpellElement(spellnum));
			else
				System.out.println("But you missed!");
		}
	}
	
	
	private static void enemyTurn() { //Actions are handled in the Enemy class. Damage is dealt with here.
		int act=enemy.generateAction();
		//Actions may be physical, magic, or healing
		if(enemy.getActType(act).equals("physical")) { //The action is physical
			System.out.println("The enemy is attacking you...");
			if((Math.random()*(enemy.getPrecision()+(100/(100+enemy.getPrecision()))))<=enemy.getPrecision()) //If the attack hits
				player.takeDamage(enemy.act(act), false);
			else
				System.out.println("But they missed!");
		}
		else if(enemy.getActType(act).equals("magic")) { //The action is a magic spell
			System.out.println("The enemy is casting magic...");
			if((Math.random()*(enemy.getPrecision()+(100/(100+enemy.getPrecision()))))<=enemy.getPrecision()) //If the attack hits
				player.takeDamage(enemy.act(act), true);
			else
				System.out.println("But it fizzled out!");
		}
		else { //The action is a healing move
			enemy.takeDamage(-enemy.act(act), "physical"); //Take negative damage to add health
		}
	}
	
	//Save/Load
	
	private static void save() throws FileNotFoundException {
		File savefile=new File("../data/saves/"+player.getName()+".txt");
		try {
			savefile.createNewFile();
		} catch (IOException e) {
			System.out.println("Something just died. It was me. I died inside.");
			e.printStackTrace();
		}
		PrintWriter saver=new PrintWriter(savefile);
		saver.println(player.getMaxHP());
		saver.println(player.getMaxMP());
		saver.println(player.getAttack());
		saver.println(player.getDefense());
		saver.println(player.getMental());
		saver.println(player.getSpeed());
		saver.println(player.getPrecision());
		saver.println(enemynum+1);
		saver.close();
		System.out.println("Your game has been saved. It is safe to close the game, if you wish.");
	}
	private static void load() throws FileNotFoundException{
		boolean hasLoaded=false;
		while(!hasLoaded) {
			System.out.println("Enter player name: ");
			String name=userin.nextLine();
			File savefile=new File("../data/saves/"+name+".txt");
			if(savefile.exists()) {
				Scanner filein=new Scanner(savefile);
				int hp=filein.nextInt();
				filein.nextLine();
				int mp=filein.nextInt();
				filein.nextLine();
				int at=filein.nextInt();
				filein.nextLine();
				int def=filein.nextInt();
				filein.nextLine();
				int men=filein.nextInt();
				filein.nextLine();
				int sp=filein.nextInt();
				filein.nextLine();
				int pr=filein.nextInt();
				filein.nextLine();
				int lv=filein.nextInt();
				enemynum=lv-1;
				filein.close();
				player=new Player(name,lv,hp,mp,at,def,men,sp,pr);
				hasLoaded=true;
			}
			else {
				System.out.println("File not found. Please try again.");
			}
		}
	}

}
