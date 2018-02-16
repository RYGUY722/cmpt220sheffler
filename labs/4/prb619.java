import java.util.Arrays;
import java.util.Scanner;

public class prb619 {
	public static void main(String[] args) {
		Scanner sidein=new Scanner(System.in);
		System.out.print("Please input side 1: "); //Prompt input and collect all 3 sides
		double side1=sidein.nextDouble();
		System.out.print("Please input side 2: ");
		double side2=sidein.nextDouble();
		System.out.print("Please input side 3: ");
		double side3=sidein.nextDouble();
		if(isValid(side1, side2, side3)) { //If it's valid, pass it into the area function and output it
			System.out.println(area(side1, side2, side3));
		}
		else { //Otherwise, tell the user it isn't valid
			System.out.println("That is not a valid triangle.");
		}
	}
	public static boolean isValid(double side1, double side2, double side3) { //Checks if the triangle is possible
		if((side1+side2)>side3) {
			return false;
		}
		if((side1+side3)>side2) {
			return false;
		}
		if((side3+side2)>side1) {
			return false;
		}
		return true;
	}
	public static double area(double side1, double side2, double side3) { //Returns the area of the triangle
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

}
