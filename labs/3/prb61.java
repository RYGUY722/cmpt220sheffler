
public class prb61 {
	public static void main(String[] args) {
		for(int n=1;n<=100;n+=10) { //Create a for loop governing the new line shifts
			for(int y=n;y<n+10;y++) { //Create a for loop that outputs the pentagonal numbers
				System.out.printf("%7d", getPentagonalNumber(y));
			}
			System.out.println();
		}
	}
	public static int getPentagonalNumber(int x) { //Method for getting pentagonal numbers using given formula
		return x*(3*x-1)/2;
	}
	

}
