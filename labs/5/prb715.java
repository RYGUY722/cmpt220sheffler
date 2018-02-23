import java.util.Scanner;

public class prb715 {
	public static void main(String[] args) {
		Scanner numin=new Scanner(System.in);
		System.out.print("Enter 10 numbers: "); //Prompt input
		int nums[]=new int[10]; //Create an array of size 10
		for(int x=0;x<10;x++) { //Read in the numbers
			nums[x]=numin.nextInt();
		}
		int newnums[]=eliminateDuplicates(nums).clone();
		System.out.print("The distinct numbers are: "); //Print distinct numbers
		for (int x=0;x<newnums.length;x++) {
			if (newnums[x]!=0)
				System.out.print(newnums[x]+" ");
		}
	}
	
	public static int[] eliminateDuplicates(int[] list) {
		int newlist[]=new int[10];
		int count=0;
		for(int x=0;x<10;x++) { //Read in the numbers
			int num=list[x];
			if (isNew(newlist, num)) { // Test if num is a new number
					newlist[count] = num;
					count++;	// Increment count
			}
		}
		return newlist;
	}

	public static boolean isNew(int[] x, int num) {
		for (int y=0;y<x.length;y++) {
			if (num == x[y]) 
				return false;
		}
		return true;
	}

}