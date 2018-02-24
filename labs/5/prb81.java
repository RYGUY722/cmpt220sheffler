import java.util.Scanner;

public class prb81 {
	public static void main(String[] args) {
		Scanner matin=new Scanner(System.in);
		System.out.println("Enter a 3-by-4 matrix row by row:"); //Prompt input
		double[][] mat=new double[3][4];
		for(int x=0;x<3;x++) { //Save input
			for(int y=0;y<4;y++) {
				mat[x][y]=matin.nextDouble();
			}
		}
		for(int z=0;z<4;z++) {
			System.out.println("Sum of the elements at column "+z+" is "+sumColumn(mat,z)); //Output all rows
		}
	}
	public static double sumColumn(double[][] m, int columnIndex) { //Outputs the sum of all rows of column z
		double res=0;
		for(int x=0;x<3;x++) {
			res+=m[x][columnIndex];
		}
		return res;
	}

}
