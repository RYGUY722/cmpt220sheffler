import java.util.Scanner;

public class prb49 {
	public static void main(String[] args) {
		Scanner charin=new Scanner(System.in);
		System.out.print("Enter a character: ");
		String a=charin.next();
		char b=a.charAt(0);
		System.out.println("The Unicode for the character is "+Integer.toHexString(b | 0x10000).substring(1));
	}

}
