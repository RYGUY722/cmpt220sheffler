import java.util.Scanner;

public class prb423 {
	public static void main(String[] args) {
		Scanner infoin=new Scanner(System.in); //Gather info
		System.out.print("Enter employee's name: ");
		String name = infoin.nextLine();
		System.out.print("Enter number of hours worked in a week: ");
		int hours = infoin.nextInt();
		System.out.print("Enter hourly pay rate: ");
		double wage = infoin.nextDouble();
		System.out.print("Enter federal tax witholding rate: ");
		double fedrate = infoin.nextDouble();
		System.out.print("Enter state tax witholding rate: ");
		double staterate = infoin.nextDouble();
		double fullpay = hours*wage; //Calculate pay and deductions
		double feddeduc = (int)(fullpay*fedrate*100); //According to the example, neither deduction rounds normally
		feddeduc /= 100;
		double statededuc = (int)(fullpay*staterate*100);
		statededuc /= 100;
		System.out.println((Math.round((feddeduc+statededuc)*100.0)/100.0));
		double finalpay = fullpay-(Math.round(((fullpay*fedrate)+(fullpay*staterate))*100.0)/100.0); //However, they do round normally here
		System.out.println(); //Print out the values
		System.out.println("Employee Name: "+name);
		System.out.println("Hours Worked: "+hours);
		System.out.println("Pay Rate: $"+wage);
		System.out.println("Gross Pay: $"+fullpay);
		System.out.println("Deductions:");
		System.out.println("	Federal Withholding("+fedrate*100+"%): $"+feddeduc); 
		System.out.println("	State Withholding("+staterate*100+"%): $"+statededuc);
		System.out.println("	Total Deduction: $"+(feddeduc+statededuc));
		System.out.println("Net Pay: $"+finalpay);
	}

}
