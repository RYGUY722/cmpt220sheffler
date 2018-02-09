import java.util.Arrays;
import java.util.Scanner;

public class prb65 {
	public static void main(String[] args) {
		Scanner numin=new Scanner(System.in);
		System.out.print("Input 3 numbers for sorting: "); //Prompt input
		displaySortedNumbers(numin.nextDouble(),numin.nextDouble(),numin.nextDouble()); //Collect inputs and feed them into method
	}
	public static void displaySortedNumbers(double number1, double number2, double number3) {
		double numbers[]= {number1, number2, number3}; //put given values in an array
		Arrays.sort(numbers); //Sort the array by value
		System.out.println(numbers[0]+", "+numbers[1]+" ,"+numbers[2]); //Output sorted values
	}

}
