import java.util.Scanner;

public class prb85 {
	public static void main(String[] args) {
		Scanner matin=new Scanner(System.in);
		double[][] mat1=new double[3][3]; //matrix 1
		double[][] mat2=new double[3][3]; //matrix 2
		double[][] mat3=new double[3][3]; //matrix 1+2
		System.out.print("Enter matrix 1: "); //Collect matrix 1 and 2
		for(int x=0;x<3;x++) {
			for(int y=0;y<3;y++) {
				mat1[x][y]=matin.nextDouble();
			}
		}
		System.out.print("Enter matrix 2: ");
		for(int x=0;x<3;x++) {
			for(int y=0;y<3;y++) {
				mat2[x][y]=matin.nextDouble();
			}
		}
		mat3=addMatrix(mat1,mat2).clone(); //Get matrix 3
		for(int x=0;x<3;x++) { //Print them out
			if(x==1) {
				printRow(mat1,x,'+');
				printRow(mat2,x,'=');
				printRow(mat3,x,' ');
			}
			else {
				printRow(mat1,x,' ');
				printRow(mat2,x,' ');
				printRow(mat3,x,' ');
			}
			System.out.print("\n");
		}
	}
	public static double[][] addMatrix(double[][] m1, double[][] m2){ //Adds matrixes... duh
		double m3[][]= new double[3][3];
		for(int x=0;x<3;x++) {
			for(int y=0;y<3;y++) {
				m3[x][y]=m1[x][y]+m2[x][y];
			}
		}
		return m3;
	}
	public static void printRow(double[][] m,int row,char midchar) { //Prints output in the desired fashion
		for(int x=0;x<3;x++) {
			System.out.printf("%1.1f ", m[row][x]);
		}
		System.out.print("  "+midchar+"   ");
	}

}
