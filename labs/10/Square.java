
public class Square extends GeometricObject implements Colorable{
	double side;
	Square(){
		side=0;
	}
	Square(double side){
		this.side=side;
	}
	//Accessors
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side=side;
	}
	//Other
	public double getPerimeter() {
		return 4*side;
	}
	public double getArea() {
		return Math.pow(side, 2);
	}
	@Override
	public void howToColor() {
		System.out.println("Color all four sides");
	}
}
