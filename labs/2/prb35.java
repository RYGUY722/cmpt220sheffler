import java.util.Scanner;

public class prb35 {
	public static void main(String args[]) {
		Scanner numin = new Scanner(System.in); //Create Scanner and get days
		System.out.print("Enter today's day: ");
		int currday=numin.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int days=currday+numin.nextInt();
		currday=currday%7; //Make sure days are below 7
		days=days%7;
		String day="";
		String today="";
		switch (currday) { //Determine the current day
		case 0: 
			today="Sunday";
			break;
		case 1: 
			today="Monday";
			break;
		case 2: 
			today="Tuesday";
			break;
		case 3: 
			today="Wednesday";
			break;
		case 4: 
			today="Thursday";
			break;
		case 5: 
			today="Friday";
			break;
		case 6: 
			today="Saturday";
			break;
		}
		switch (days) { //Determine the future day
		case 0: 
			day="Sunday";
			break;
		case 1: 
			day="Monday";
			break;
		case 2: 
			day="Tuesday";
			break;
		case 3: 
			day="Wednesday";
			break;
		case 4: 
			day="Thursday";
			break;
		case 5: 
			day="Friday";
			break;
		case 6: 
			day="Saturday";
			break;
		}
		System.out.println("Today is "+today+" and the future day is "+day); //Print day
	}

}
