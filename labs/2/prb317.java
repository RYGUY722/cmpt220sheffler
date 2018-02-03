import java.util.Scanner;

public class prb317 {
	public static void main(String[] args) {
		Scanner rpsin=new Scanner(System.in); //Get values for player and computer and set up variables
		System.out.print("scissor (0), rock (1), paper (2): ");
		int playerrps=rpsin.nextInt();
		int comprps=(int) (Math.random()*2);
		String player="";
		String comp="";
		switch (playerrps) { //Determine what the player is
		case 0:
			player="scissor";
			break;
		case 1:
			player="rock";
			break;
		case 2:
			player="paper";
			break;
		}
		switch (comprps) { //Determine what the computer is
		case 0:
			comp="scissor";
			break;
		case 1:
			comp="rock";
			break;
		case 2:
			comp="paper";
			break;
		}
		if((playerrps+1)%3==comprps) { //Determine who wins
			System.out.println("The computer is "+comp+". You are "+player+". You lost");
		}
		else if((comprps+1)%3==playerrps) {
			System.out.println("The computer is "+comp+". You are "+player+". You won");
		}
		else{
			System.out.println("The computer is "+comp+". You are "+player+". It is a draw");
		}
	}

}
