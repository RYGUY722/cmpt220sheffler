import java.util.Scanner;

public class prb111 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 3 sides of a triangle: ");
		Triangle mytri=new Triangle(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.print("Enter a color for the triangle: ");
		mytri.setColor(sc.next());
		System.out.print("Is the triangle filled?(Y/N) ");
		if(sc.next().equals("Y")) {
			mytri.setFilled(true);
		}
		else {
			mytri.setFilled(false);
		}
		System.out.print(mytri.toString());
		System.out.print(" area="+mytri.getArea()+" perimeter="+mytri.getPerimeter()+" color="+mytri.getColor()+" filled="+mytri.isFilled());
	}

}
