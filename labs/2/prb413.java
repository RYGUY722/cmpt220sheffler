import java.util.Scanner;

public class prb413 {
	public static void main(String[] args) {
		Scanner charin=new Scanner(System.in); //Get letter
		System.out.print("Enter a letter: ");
		String letter=charin.next();
		char letuse=letter.toUpperCase().charAt(0);
		String result="";
		if((int)letuse<=90&&(int)letuse>=65) { //Make sure that the character is a letter based on ASCII value. If it is, test for a vowel
			result=" is a consonant";
			if(((int)letuse==65)||((int)letuse==69)||((int)letuse==73)||((int)letuse==79)||((int)letuse==85)) {
				result=" is a vowel";
			}
		}
		else { //If it isn't a letter, set the output to say it's invalid
			result=" is an invalid input";
		}
		System.out.println(letter+result);
	}

}
