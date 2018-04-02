import java.util.Scanner;

public class prb113 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 3 numbers: ");
		Account myacc1=new Account(sc.nextInt(),sc.nextDouble(),sc.nextInt());
		System.out.print("Enter 4 numbers: ");
		CheckingAccount myacc2=new CheckingAccount(sc.nextInt(),sc.nextDouble(),sc.nextInt(),sc.nextDouble());
		System.out.print("Enter 3 numbers: ");
		SavingsAccount myacc3=new SavingsAccount(sc.nextInt(),sc.nextDouble(),sc.nextInt());
		System.out.println(myacc1.toString());
		System.out.println(myacc2.toString());
		System.out.println(myacc3.toString());
	}

}
