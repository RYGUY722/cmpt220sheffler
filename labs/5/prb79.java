import java.util.Arrays;
import java.util.Scanner;

public class prb79 {
	public static void main(String[] args) {
		Scanner numin=new Scanner(System.in);
		System.out.print("Enter 10 numbers: "); //Prompt input
		double nums[]=new double[10]; //Create an array of size 10
		for(int x=0;x<10;x++) { //Read in the numbers
			nums[x]=numin.nextDouble();
		}
		System.out.println("The minimum number is "+min(nums)); //Bodacious output bro (it's like 4 am let me have my fun)
	}
	public static double min(double array[]) {
		Arrays.sort(array); //Sort the array numerically
		return array[0]; //Return the lowest number
	}

}




//https://youtu.be/68JQtxTzjqc