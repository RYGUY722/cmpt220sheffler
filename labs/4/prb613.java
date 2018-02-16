
public class prb613 {
	public static void main(String[] args) {
		System.out.println("i      m(i)"); //Table header
		System.out.println("____________________");
		for(int i=1;i<=20;i++) {
			System.out.printf("%-8d%7.4f\n", i, m(i)); //Display each value
		}
	}
	public static double m(int i) { //Returns the given calculation
		double res=0;
		for(int x=1;x<=i;x++) {
			res+=x/(x+1.0);
		}
		return res;
	}
}

