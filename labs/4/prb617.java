import java.util.Scanner;

public class prb617 {
	public static void main(String[] args) {
		Scanner nin=new Scanner(System.in);
		System.out.print("Enter a number: "); //Prompt input
		printMatrix(nin.nextInt()); //Pass input into printMatrix
	}
	public static void printMatrix(int n) {
		for(int x=0;x<n;x++) {
			for(int y=0;y<n;y++) {
				System.out.print(Math.round(Math.random())+" "); //Output 1 or 0 randomly in an n x n square
			}
			System.out.println(); //After every n, skip a line up to n times
		}
	}
	

}
