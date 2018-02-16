import java.util.Arrays;
import java.util.Scanner;

public class prb73 {
	public static void main(String[] args) {
		Scanner countin=new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: "); //Prompt
		String fullnum=countin.nextLine(); //Create a string to hold all numbers
		String nums[]=fullnum.split(" "); //Create an array of the numbers as strings
		int numsints[]=new int[nums.length-1]; //This will contain all numbers, except the 0 at the end
		for(int x=0;x<nums.length-1;x++) {
			numsints[x]=Integer.parseInt(nums[x]);
		}
		Arrays.sort(numsints); //Sort my new array numerically
		int counts=0; //Create some variables for use soon
		int nxtint=0;
		for(int x=0;x<numsints.length;x++) {
			counts++; //Increment counts
			if(x+1<numsints.length) 
				nxtint=numsints[x+1]; //If there's another number get it
			else 
				nxtint=-1;
			if(numsints[x]!=nxtint&&counts>1) { //If the next number isn't the same, print the number and the counts
				System.out.println(numsints[x]+" occurs "+counts+" times");
				counts=0; //Then reset counts
			}
			else if(numsints[x]!=nxtint&&counts==1) { //If the next number isn't the same, print the number and the 1 count
				System.out.println(numsints[x]+" occurs "+counts+" time");
				counts=0; //Then reset counts
			}
		}
	}

}
