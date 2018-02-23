import java.util.Scanner;

public class prb711 {
	public static void main(String[] args) {
		Scanner dubin=new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		double nums[]=new double[10]; //Create an array of size 10
		for(int x=0;x<10;x++) { //Read in the numbers
			nums[x]=dubin.nextDouble();
		}
		System.out.println("The mean is "+mean(nums));
		System.out.println("The standard deviation is "+deviation(nums));
	}
	public static double deviation(double[] x) { //Method for calculating standard deviation
		double total=0.0;
		for(int y=0;y<x.length;y++) { //total up (x-mean)^2
			total+=Math.pow((x[y]-mean(x)),2);
		}
		return Math.sqrt(total/(x.length-1));
	}
	public static double mean(double[] x) { //Method for calculating mean
		double total=0.0;
		for(int y=0;y<x.length;y++) { //total up the array
			total+=x[y];
		}
		return total/x.length; //return total/n
	}

}
