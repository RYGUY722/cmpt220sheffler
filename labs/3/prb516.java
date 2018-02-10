import java.util.Scanner;

public class prb516 {
	public static void main(String[] args) {
		Scanner numin=new Scanner(System.in);
		System.out.print("Enter a number: "); //Prompt input
		int num=numin.nextInt();
		int factors[]=new int[99999]; //idk how many slots I need
		factors[0]=-1;
		int y=0;
		for(int x=2;x<=num;x++) {
			if(num%x==0) { //if x is a factor of num
				factors[y]=x; //add x to factors
				y++; 
				num/=x;
				System.out.println(x);
				x=1; //continue the loop
			}
		}
		for(int x=0;x<y;x++) { //Print the factors
			System.out.print(factors[x]+" ");
		}
	}

}
