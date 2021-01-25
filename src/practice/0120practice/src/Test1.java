import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test1 {

	public static void main(String[] args) {
		
		Calendar ca = new GregorianCalendar(1994,04,26);
		
		Calendar now = Calendar.getInstance();
		
		long num = now.getTimeInMillis()-ca.getTimeInMillis();
		
		System.out.println(num/1000/60/60/24/365+"세");
		

	}

}
