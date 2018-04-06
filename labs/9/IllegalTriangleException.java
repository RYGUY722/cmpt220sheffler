
public class IllegalTriangleException extends Exception{

	public IllegalTriangleException(double side1, double side2, double side3) {
		super("Illegal sides: "+side1+", "+side2+", "+side3);
	}

}
