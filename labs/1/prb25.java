import java.util.Scanner;

public class prb25 {
	public static void main(String[] args) {
		Scanner bill = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = bill.nextDouble();
		double gratuity = bill.nextDouble();
		gratuity=gratuity/100; //Make gratuity a percent
		System.out.println("The gratuity is $"+(gratuity*subtotal)+" and total is $"+(subtotal+(subtotal*gratuity)));
	}

}
