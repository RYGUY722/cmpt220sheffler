
public class prb1311 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon o=new Octagon(5);
		System.out.println(o.getArea());
		System.out.println(o.getPerimeter());
		Octagon p=(Octagon) o.clone();
		if(o.compareTo(p)==1) System.out.println("Octagon 2 is greater than 1");
		else if(o.compareTo(p)==-1) System.out.println("Octagon 1 is greater than 2");
		else System.out.println("The octagons are equal");
	}

}
