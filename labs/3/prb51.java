import java.util.Scanner;

public class prb51 {
	public static void main(String[] args) {
		Scanner numin=new Scanner(System.in);
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int n=numin.nextInt();
		double total;
		int length=1;
		int pos=0;
		int neg=0;
		if(n==0) { //If the first number is 0, drop everything
			System.out.println("No numbers are entered except 0");
		}
		else { //Otherwise, continue the program
			total=n;
			if(n>0) //Start counting positives and negatives
				pos++;
			else
				neg++;
			boolean cont=true;
			while(cont==true) {
				n=numin.nextInt();
				if(n!=0) { //If n isn't 0, add it to the total and check pos/neg
					total+=n;
					length++;
					if(n>0)
						pos++;
					else
						neg++;
					
				}
				else //If n=0, break the loop
					cont=false;
				System.out.println(n);
			}
			System.out.println("The number of positives is "+pos);
			System.out.println("The number of negatives is "+neg);
			System.out.println("The total is "+total);
			System.out.println("The average is "+(total/length));
		}
	}

}
