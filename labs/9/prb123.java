import java.util.Scanner;

public class prb123 {
	public static void main(String[] args) {
		int arr[]=new int[100];
		for(int x=0;x<100;x++) {
			arr[x]=(int) (Math.random()*1000);
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an index (0-99)");
		while(true) {
			try {
				System.out.println(arr[sc.nextInt()]);
			}
			catch(IndexOutOfBoundsException e) {
				System.err.println("Out of Bounds");
			}
		}
	}

}
