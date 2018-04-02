import java.util.ArrayList;
import java.util.Scanner;

public class prb1111 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 5 numbers: ");
		ArrayList firstlist=new ArrayList();
		for(int x=0;x<5;x++) firstlist.add(sc.nextInt());
		sort(firstlist);
		System.out.println(firstlist.toString());
	}
	public static void sort(ArrayList<Integer> list) {
		list.sort(null);
	}

}
