
public class prb55 {
	public static void main(String[] args) {
		System.out.println("Kilograms      Pounds  |  Pounds      Kilograms"); //Table header
		int a=1; //Base values
		double b=2.2;
		int c=20;
		double d=9.09;
		while(a<200) {
			System.out.printf("%-8d    %8.1f   |  %-8d    %8.2f\n", a, b, c, d); //Display each value
			a+=2; //The amount each value increases each step
			b+=4.4;
			c+=5;
			d+=2.26796;
		}
	}

}
