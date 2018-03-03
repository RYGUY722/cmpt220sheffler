import java.util.Date;

public class prb93 {
	public static void main(String[] args) {
		Date mydate=new Date();
		mydate.setTime(10000);
		System.out.println(mydate.toString());
		mydate.setTime(100000);
		System.out.println(mydate.toString());
		mydate.setTime(1000000);
		System.out.println(mydate.toString());
		mydate.setTime(10000000);
		System.out.println(mydate.toString());
		mydate.setTime(100000000);
		System.out.println(mydate.toString());
		mydate.setTime(1000000000);
		System.out.println(mydate.toString());
//		mydate.setTime(10000000000);
//		System.out.println(mydate.toString());
//		mydate.setTime(100000000000);
//		System.out.println(mydate.toString());
	}

}
