import java.util.Arrays;
import java.util.Scanner;

public class prb719 {
	public static void main(String[] args) {
		Scanner listin=new Scanner(System.in);
		System.out.print("Enter the size of the list: "); //Prompt
		int size=listin.nextInt();
		int list[]=new int[size];
		System.out.print("Enter the contents of the list: ");
		for(int x=0;x<size;x++) { //Save input
			list[x]=listin.nextInt();
		}
		System.out.print("The list has "+size+" integers "); //Give feedback on the input
		for(int x=0;x<size;x++) {
			System.out.print(list[x]+" ");
		}
		System.out.print("\n");
		if(isSorted(list)) { //Check if it's sorted and respond appropriately
			System.out.print("The list is already sorted");
		}
		else {
			System.out.print("The list is not sorted");
		}
	}
	
	public static boolean isSorted(int[] list) { //Check the list against a sorted list
		int listsort[]=list.clone();
		Arrays.sort(listsort);
		for(int x=0; x<list.length;x++) {
			if(listsort[x]!=list[x]) { //If it isn't the same, it isn't sorted
				return false;
			}
		}
		return true;
	}

}
