import java.util.Scanner;

public class prb911 {
	public static void main(String[] args) {
		Scanner eqin=new Scanner(System.in);
		System.out.print("Enter 6 numbers: ");
		LinearEquation lineq=new LinearEquation(eqin.nextDouble(),eqin.nextDouble(),eqin.nextDouble(),eqin.nextDouble(),eqin.nextDouble(),eqin.nextDouble());
		if(lineq.isSolvable()) {
			System.out.println("x="+lineq.getX()+"\ny="+lineq.getY());
		}
		else {
			System.out.println("The equation has no solution.");
		}
	}

}
