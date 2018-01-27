import java.util.Scanner;

public class prb27 {
	public static void main(String[] args) {
		Scanner time = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int min = time.nextInt();
		int min2 = min;
		int years=0;
		int days=0;
		while(min2>=(60*24)) { //While more than a day
			if(min2>=(60*24*365)) { //If more than a year, add one to years and subtract a year
				years++;
				min2-=(60*24*365);
			}
			else { //Otherwise, add one to days and subtract a day
				days++;
				min2-=(60*24);
			}
		}
		System.out.println(min+" minutes is approximately "+years+" years and "+days+" days");
	}

}
