import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test2 {

	public static void main(String[] args) {
		
		
		/*
		 * Simpledateformat 은 date만 가지고 쓸 수 있다
		 * 그래서 calendar에 날짜를 입력해주고
		 * date에서 밀리초로 뽑아온다.
		 */
		
//		
//		Calendar ca = new GregorianCalendar(1994, 03, 26);
//		Date date = new Date(ca.getTimeInMillis());
//		
//		SimpleDateFormat si = new SimpleDateFormat("yyyy-MM-dd");
//		System.out.println(si.format(date));
		
		
//		Calendar ca = Calendar.getInstance();
//		ca.set(1994, 03, 26);
//		ca.set(Calendar.YEAR, 1994);
//		Date da = new Date(ca.getTimeInMillis());
//		SimpleDateFormat si = new SimpleDateFormat("yyyy 년 MM월 dd일");
//		System.out.println(si.format(da));
//		
//		
//		Calendar ca = new GregorianCalendar(1999,04,26);
//		Date d = new Date(ca.getTimeInMillis());
//		SimpleDateFormat sii = new SimpleDateFormat("dd");
//		System.out.println(sii.format(d));
//		
		Calendar ca = Calendar.getInstance();
		
		ca.set(1994, 04, 26);
		
		Date d = new Date(ca.getTimeInMillis());
		SimpleDateFormat si = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(si.format(d));
		

	}

}
