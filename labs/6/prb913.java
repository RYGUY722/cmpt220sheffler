import java.util.Scanner;

public class prb913 {

	public static void main(String[] args) {
		Scanner arrin=new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array: ");
		int rows=arrin.nextInt();
		int cols=arrin.nextInt();
		double arr[][]=new double[rows][cols];
		System.out.println("Enter the array: ");
		for(int x=0;x<rows;x++) {
			for(int y=0;y<cols;y++) {
				arr[x][y]=arrin.nextDouble();
			}
		}
		Location loc=locateLargest(arr);
		System.out.println("The location of the largest element is "+loc.toString());
	}
	public static Location locateLargest(double[][] a) {

		double max = a[0][0];
		int r = 0;
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
					r = i;
					c = j;
				}
			}
		}
		return new Location(max, r, c);
	}

}
