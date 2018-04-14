
public class prb137 {
	public static void main(String[] args) {
		GeometricObject a[]=new GeometricObject[5];
		for(int x=0;x<5;x++) {
			a[x]=new Square(Math.random()*4000);
		}
		for(int x=0;x<5;x++) {
			System.out.println("Square "+x+": Area: "+((Square) a[x]).getArea()+" How to color: ");
			((Square)a[x]).howToColor();
		}
	}

}
