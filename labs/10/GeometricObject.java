
public class GeometricObject {
	String color;
	boolean filled;
	java.util.Date dateCreated;
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	public boolean isFilled() {
		return filled;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
}
