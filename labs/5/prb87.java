import java.util.Scanner;

public class prb87 {
	public static void main(String[] args) {
		Scanner pointin=new Scanner(System.in);
		System.out.print("Enter the number of points: "); //Collect number of points and the points to use
		int pointnum=pointin.nextInt();
		double points[][]=new double[pointnum][3];
		System.out.print("Enter "+pointnum+" points: ");
		for(int x=0;x<pointnum;x++) { //Save them in a matrix
			for(int y=0;y<3;y++) {
				points[x][y]=pointin.nextDouble();
			}
		}
		int p1=0; //Initalize these variables
		int p2=1;
		double shortest=compDistance(points[p1][0],points[p1][1],points[p1][2],points[p2][0],points[p2][1],points[p2][2]);
		for(int x=0;x<pointnum;x++) {
			for(int y=x+1;y<pointnum;y++) { //Check if a distance between 2 points is ever bigger than those 2 first ones
				if(shortest>compDistance(points[x][0],points[x][1],points[x][2],points[y][0],points[y][1],points[y][2])) {
					p1=x;
					p2=y;
					shortest=compDistance(points[p1][0],points[p1][1],points[p1][2],points[p2][0],points[p2][1],points[p2][2]);
				}
			}
		}
		System.out.println("The closest two points are ("+points[p1][0]+" ,"+points[p1][1]+", "+points[p1][2]+") and (" // Output the closest 2
				+ points[p2][0]+", "+points[p2][1]+", "+points[p2][2]+")");
	}
	public static double compDistance(double x1,double y1,double z1,double x2,double y2,double z2) { //Compute distance
		return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)+Math.pow((z2-z1),2));
	}

}
