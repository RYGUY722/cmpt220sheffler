// JA: No test class?
public class Circle extends GeometricObject implements Comparable<Circle>{
	private double radius;

	public Circle() {
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius, 
		String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	//Get/Set
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//Other
	public double getArea() {
		return radius * radius * Math.PI;
	}
	public double getDiameter() {
		return 2 * radius;
	}
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	@Override
	public boolean equals(Object o) {
		return this.compareTo((Circle)o) == 0;
	}
	@Override
	public int compareTo(Circle c) {
		if (this.radius > c.radius)
			return 1;
		else if (this.radius < c.radius)
			return -1;
		else
			return 0;
	}

}
