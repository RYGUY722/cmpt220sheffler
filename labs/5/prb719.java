import java.util.Arrays;
import java.util.Scanner;

public class prb719 {
	public static void main(String[] args) {
		Scanner listin=new Scanner(System.in);
		System.out.print("Enter the size of the list: ");
		int size=listin.nextInt();
		int list[]=new int[size];
		System.out.print("Enter the contents of the list: ");
		for(int x=0;x<size;x++) {
			list[x]=listin.nextInt();
		}
		System.out.print("The list has "+size+" integers ");
		for(int x=0;x<size;x++) {
			System.out.print(list[x]+" ");
		}
		System.out.print("\n");
		if(isSorted(list)) {
			System.out.print("The list is already sorted");
		}
		else {
			System.out.print("The list is not sorted");
		}
	}
	
	public static boolean isSorted(int[] list) {
		int listsort[]=list.clone();
		Arrays.sort(listsort);
		for(int x=0; x<list.length;x++) {
			if(listsort[x]!=list[x]) {
				return false;
			}
		}
		return true;
	}

}
