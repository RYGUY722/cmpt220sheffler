import java.util.Scanner;

public class prb311 {
	public static void main(String[] args) {
		Scanner monin=new Scanner(System.in); //Get input from the user
		System.out.print("Enter the number of the month (1-12): ");
		int month=monin.nextInt();
		System.out.print("Enter the year: ");
		int year=monin.nextInt();
		int days=0; //Create variables for output
		String monthname="";
		if(month==2&&(year%4==0)) { //If it's a leap year and February, do this
			monthname="February";
			days=29;
		}
		else {  //Otherwise, check for each month
			switch(month) {
			case 1:
				monthname="January";
				days=31;
				break;
			case 2:
				monthname="February";
				days=28;
				break;
			case 3:
				monthname="March";
				days=31;
				break;
			case 4:
				monthname="April";
				days=30;
				break;
			case 5:
				monthname="May";
				days=31;
				break;
			case 6:
				monthname="June";
				days=30;
				break;
			case 7:
				monthname="July";
				days=31;
				break;
			case 8:
				monthname="August";
				days=31;
				break;
			case 9:
				monthname="September";
				days=31;
				break;
			case 10:
				monthname="October";
				days=31;
				break;
			case 11:
				monthname="November";
				days=30;
				break;
			case 12:
				monthname="December";
				days=31;
				break;
			}
		}
		System.out.println(monthname+" "+year+" has "+days+" days."); //Print the results
	}

}
