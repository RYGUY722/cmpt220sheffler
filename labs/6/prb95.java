import java.util.GregorianCalendar;

public class prb95 {
	public static void main(String[] args) {
		GregorianCalendar newcal=new GregorianCalendar();
		System.out.println(newcal.get(GregorianCalendar.YEAR)+"-"+newcal.get(GregorianCalendar.MONTH)+"-"+newcal.get(GregorianCalendar.DAY_OF_MONTH));
		newcal.setTimeInMillis(1234567898765L);
		System.out.println(newcal.get(GregorianCalendar.YEAR)+"-"+newcal.get(GregorianCalendar.MONTH)+"-"+newcal.get(GregorianCalendar.DAY_OF_MONTH));
	}

}
