import java.util.Scanner;

public class prb811 {
	public static void main(String[] args) {
		Scanner numin=new Scanner(System.in);
		System.out.print("Enter a number between 0 and 511: "); //Prompt input
		int orignum=numin.nextInt();
		String num=Integer.toBinaryString(orignum); //Convert to binary
		while(num.length()<9) { //Make sure the string is 9 characters
			num="0"+num;
		}
		for(int x=0;x<3;x++) {
			for(int y=0;y<3;y++) {
				if(num.charAt((x*3)+y)=='0') { //If we've got a 0 print an H for heads
					System.out.print("H ");
				}
				else { //If it's not, print a T for tails
					System.out.print("T ");
				}
			}
			System.out.println();
		}
	}

}
