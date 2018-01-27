
public class prb14 {
	public static void main(String[] args) {
		System.out.println("a     a^2   a^3"); //Table headers
		for(int x=1;x<=4;x++) {
			System.out.println(x+"     "+(x*x)+"     "+(int)Math.pow(x, 3)); //Table numbers
		}
	}

}
