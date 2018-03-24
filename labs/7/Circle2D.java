
public class Circle2D {
	double x, y, radius;
	//Constructors
	Circle2D(){
		x=0;
		y=0;
		radius=1;
	}
	Circle2D(double newx, double newy, double newrad){
		x=newx;
		y=newy;
		radius=newrad;
	}
	//Getters/Setters
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	//Simple Methods
	public double getArea() {
		return (Math.PI*radius*radius);
	}
	public double getPerimeter() {
		return (Math.PI*2*radius);
	}
	//Complex Methods
	public boolean contains(double x, double y) {
		double dist=Math.sqrt(Math.pow(x-this.x, 2)+Math.pow(y-this.y, 2));
		if(dist<radius) return true;
		else return false;
	}
	public boolean contains(Circle2D circle) {
		double dist=Math.sqrt(Math.pow(circle.getX()-this.x, 2)+Math.pow(circle.getY()-this.y, 2));
		if(dist+circle.getRadius()<radius) return true;
		else return false;
	}
	public boolean overlaps(Circle2D circle) {
		double dist=Math.sqrt(Math.pow(circle.getX()-this.x, 2)+Math.pow(circle.getY()-this.y, 2));
		if(dist<radius+circle.getRadius()) return true;
		else return false;
	}
}
