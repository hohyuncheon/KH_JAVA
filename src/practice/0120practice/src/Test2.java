import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test2 {

	public static void main(String[] args) {

		Calendar ca = new GregorianCalendar(1994,03,26);
		
		Date da = new Date(ca.getTimeInMillis());
		
		SimpleDateFormat si = new SimpleDateFormat("yyyy년MM월dd일");
		System.out.println(si.format(da));
		
	}
}
