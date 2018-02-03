import java.util.Scanner;

public class prb421 {
	public static void main(String[] args) {
		Scanner ssin=new Scanner(System.in); //Get SSN as a string
		System.out.print("Enter a SSN: ");
		String SSN=ssin.nextLine();
		String result=" is a valid ";
		for(int x=0; x<=SSN.length()-1; x++) { //Check each number to make sure it's a number
			if((int)SSN.charAt(x)<48||(int)SSN.charAt(x)>57) {
				result=" is an invalid ";
			}
			if(x==2||x==5) { //If the next character should be a -, skip it
				x++;
			}
		}
		System.out.println(SSN+result+"social security number"); //Print the result
	}

}
