import java.util.Scanner;

public class prb29 {
	public static void main(String[] args) {
		Scanner phyin = new Scanner(System.in);
		System.out.print("Enter v0, v1, and t: ");
		double v0 = phyin.nextDouble(); //Variable collection
		double v1 = phyin.nextDouble();
		double t = phyin.nextDouble();
		double a = (v1-v0)/t; //Calculate acceleration
		System.out.println("The average acceleration is "+a);
	}

}
