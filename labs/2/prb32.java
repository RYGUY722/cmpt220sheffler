import java.util.Scanner;

public class prb32 {
	public static void main(String[] args) {
		int num1= (int)(Math.random()*9); //Generate numbers
		int num2= (int)(Math.random()*9);
		int num3= (int)(Math.random()*9);
		Scanner inp = new Scanner(System.in);
		System.out.println("What is "+num1+"+"+num2+"+"+num3+"?"); //Prompt input
		if(inp.nextInt()==(num1+num2+num3)) { //Test number
			System.out.println("Correct!");
		}
		else { System.out.println("Incorrect.");}
	}

}
