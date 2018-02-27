import java.util.Scanner;

public class prj1 {
	public static void main(String[] args) {
		//First, collect info
		Scanner papin=new Scanner(System.in);
		int arrsize=papin.nextInt();
		int paper[]=new int[arrsize-1];
		for(int x=0;x<arrsize-1;x++) {
			paper[x]=papin.nextInt();
		}
		double tape=0;
		papin.close();
		
		//Time to combine the paper
		int need=2;
		for(int n=0;n<arrsize-1;n++) {
			tape+=(1.0*(need/2))*getLongSide(n+2);
			if(paper[n]>=need) {
				need=0;
				break;
			}
			else {
				need-=paper[n];
				need*=2;
			}
		}
		//tape+=quickCheck(paper);
//		for(int n=1;n<paper.length;n++) {
//			if(paper[0]>=2) break; //If there's enough paper to make an A1, leave the loop
//			if(paper[n]>=2) { //If there is more than 2 of a size, then...
//				paper[n-1]+=1; //Combine them
//				paper[n]-=2; //Remove the 2 that were used
//				tape+=getLongSide(n+2); //Add the long side of that size to the used/needed tape
//				if(paper[n-1]>=2) { //if i can combine the last size, then go back and combine those
//					n-=2;
//				}
//				else if(paper[n]>=2&&paper[n-1]==1) { //if there's 1 of the last size and enough to combine of this size, combine them
//					n--;
//				}
//			}
//		}
		
		//Now, the output
		tape/=1000.0; //First, take tape from millimeters to meters

		if(need==0) { //If there is at least 2 A2 papers, then output the needed tape in meters
			System.out.printf("%1.11f",tape);
		}
		else { //Otherwise, you can't make an A1 size paper
			System.out.println("impossible");
		}
	}
	
	public static double getLongSide(int n) {
		double height=0; //Create variable for height
		if(n%2==0) { //If the paper size is even, eg. A2, A4, A6, etc, then use this formula
			height=((1/(Math.pow(2, n/2.0)))*(1000*(Math.pow(2, .25))));
		}
		else { //Otherwise, use this formula instead
			height=((1/(Math.pow(2, (n-1)/2.0)))*(1000/(Math.pow(2, .25))));
		}
		//height=Math.pow(2, ((double)(-1 - n * 2)) / 4.0);
			return height; //The height will always be longer than the width
	}
	

}
