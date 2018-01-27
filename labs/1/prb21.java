import java.util.Scanner;

public class prb21 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius: ");
		double cel = inp.nextDouble();
		double fahr	= (9.0/5.0)*cel+32; //Calculate Fahrenheit
		System.out.println(cel+" Celsius is "+fahr+" Fahrenheit");
	}

}
