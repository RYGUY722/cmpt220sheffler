import java.util.Scanner;

public class prb103 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number: ");
		MyInteger myint=new MyInteger(s.nextInt());
		System.out.println("value: "+myint.getValue());
		System.out.println("isEven(): "+myint.isEven());
		System.out.println("isEven(int): "+myint.isEven(myint.getValue()));
		System.out.println("isEven(MyInteger): "+myint.isEven(myint));
		System.out.println("isOdd(): "+myint.isOdd());
		System.out.println("isOdd(int): "+myint.isOdd(myint.getValue()));
		System.out.println("isOdd(MyInteger): "+myint.isOdd(myint));
		System.out.println("isPrime(): "+myint.isPrime());
		System.out.println("isPrime(int): "+myint.isPrime(myint.getValue()));
		System.out.println("isPrime(MyInteger): "+myint.isPrime(myint));
		System.out.print("Enter another number: ");
		System.out.println("equals(int): "+myint.equals(s.nextInt()));
		System.out.print("Enter a 5 digit number: ");
		String y=s.next();
		System.out.println("parseInt(String): "+myint.parseInt(y));
		char x[]= {y.charAt(0),y.charAt(1),y.charAt(2),y.charAt(3),y.charAt(4)};
		System.out.println("parseInt(char[]): "+myint.parseInt(x));
	}

}
