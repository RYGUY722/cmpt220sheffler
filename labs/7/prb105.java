import java.util.Scanner;

public class prb105 {
	public static void main(String[] args) {
		Scanner intin=new Scanner(System.in);
		StackOfIntegers s1=new StackOfIntegers();
		System.out.print("Enter a positive integer: ");
		int num=intin.nextInt();
		for(int x=2;x<=num;x++) {
			if(num%x==0) {
				num/=x;
				s1.addInteger(x);
				x--;
			}
		}
		s1.displayValues();
	}

}
