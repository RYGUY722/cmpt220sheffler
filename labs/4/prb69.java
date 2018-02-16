
public class prb69 {
	public static void main(String[] args) {
		System.out.println("Feet      Meters  |  Meters      Feet"); //Table header
		System.out.println("_____________________________________");
		for(double x=1;x<11;x++) {
			System.out.printf("%-8.1f%7.3f   |  %-8.1f%8.3f\n", x, footToMeter(x), 15.0+(5*x), meterToFoot(15.0+(5*x))); //Display each value
		}
	}
	public static double footToMeter(double foot) { //Return meters based on feet
		return .305*foot;
	}
	public static double meterToFoot(double meter) { //Return feet based on meters
		return 3.279*meter;
	}
}
