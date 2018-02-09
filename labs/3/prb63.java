import java.util.Scanner;

public class prb63 {
	public static void main(String[] args) {
		Scanner numin=new Scanner(System.in);
		System.out.print("Please input a number: "); //Prompt input
		int n=numin.nextInt(); //Collect input
		if(isPalindrome(n)) //Feed into method
			System.out.println(n+" is a palindrome."); //returns true
		else
			System.out.println(n+" is not a palindrome."); //returns false
	}
		public static int reverse(int number) { //Reverses the number and outputs it
			String norm=Integer.toString(number); //Convert to string
			String rev=""; int z=0;
			for(z=norm.length()-1; z>=0; z--) { //Reverse
				rev+=norm.charAt(z);
			}
			return Integer.parseInt(rev); //Output string as int
		}
		public static boolean isPalindrome(int number){ //Checks int is same backwards
			String input=Integer.toString(number); //Convert to string
			   for(int x=0;x<input.length()/2;x++){
			      if(!(input.charAt(x)==(Integer.toString(reverse(number)).charAt(x)))){
			         return false; //If the first char isn't the same as the last char, it isn't a palindrome
			      }
			   }
			   return true; //If it exits the for loop, it's a palindrome
		}


} //the required reverse method made this way more annoying than it needed to be.
