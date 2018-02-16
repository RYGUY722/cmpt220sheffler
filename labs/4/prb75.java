import java.util.Scanner;

public class prb75 {
	public static void main(String[] args) {
		Scanner numin=new Scanner(System.in);
		System.out.print("Enter 10 numbers: "); //Prompt input
		int nums[]=new int[10]; //Create an array of size 10
		int count=0;
		for(int x=0;x<10;x++) { //Read in the numbers
			int num=numin.nextInt();
			if (isNew(nums, num)) { // Test if num is a new number
					nums[count] = num;
					count++;	// Increment count
			}
		}
		System.out.println("The number of distinct numbers is " + count); //Output the number of unique numbers
		System.out.print("The distinct numbers are: "); //Print distinct numbers
		for (int x=0;x<nums.length;x++) {
			if (nums[x]!=0)
				System.out.print(nums[x]+" ");
		}
	}

	/** Method isDistinct returns true if number is not in array false otherwise */
	public static boolean isNew(int[] x, int num) {
		for (int y=0;y<x.length;y++) {
			if (num == x[y]) 
				return false;
		}
		return true;
	}

}
