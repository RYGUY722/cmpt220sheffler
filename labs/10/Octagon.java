
public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>{

	double side;
	//Constructors
	Octagon(){
		side=0;
	}
	Octagon(double side){
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
		return 8*side;
	}
	public double getArea() {
		return (2+4/Math.sqrt(2))+Math.pow(side, 2);
	}
	@Override
	public int compareTo(Octagon o) {
		if(o.getSide()>side) {
			return 1;
		}
		if(o.getSide()<side) {
			return -1;
		}
			return 0;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
