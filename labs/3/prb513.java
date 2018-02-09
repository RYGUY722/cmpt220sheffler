
public class prb513 {
	public static void main(String[] args) {
		int n=1;
		while(Math.pow(n+1,3)<12000) {
			n++;
		}
		System.out.println("The largest integer n can be is "+n);
	}

}
