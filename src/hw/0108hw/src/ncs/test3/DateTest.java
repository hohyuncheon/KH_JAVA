package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//GregorianCalendar 클래스를 사용하여, 현재 년도와 비교한 나이를 계산하고 생일의 요일을 출력
//한다. 출력시 SimpleDateFormat 을 사용하여 출력한다.

public class DateTest {

	public static void main(String[] args) {
		SimpleDateFormat sd = new SimpleDateFormat("생일 : yyyy년 M월 d일");
		Calendar cal = new GregorianCalendar();
		cal.set(1987, 05, 27);
		Calendar now = new GregorianCalendar();
		char[] c = {'일','월','화','수','목','금','토'}; 
		

		System.out.println("생일 : "+sd.format(new Date(cal.getTimeInMillis()))+" "+c[cal.DAY_OF_WEEK-1]);
		System.out.println("현재 : "+sd.format(new Date(now.getTimeInMillis())));
		
		
		long diff = now.getTimeInMillis()-cal.getTimeInMillis();
		System.out.println(diff/1000/60/60/24/365+" 세");
		
//        //현재요일구하기
//        String strWeek = null;
//        int nWeek = cal.get ( Calendar.DAY_OF_WEEK );
//        if ( nWeek == 1 ) strWeek="일요일";
//        else if ( nWeek == 2 ) strWeek="월요일";
//        else if ( nWeek == 3 ) strWeek="화요일";
//        else if ( nWeek == 4 ) strWeek="수요일";
//        else if ( nWeek == 5 ) strWeek="목요일";
//        else if ( nWeek == 6 ) strWeek="금요일";
//        else if ( nWeek == 7 ) strWeek="토요일";
//
//        System.out.println("현재요일 = " + strWeek);
//		
//		int year = cal.get(Calendar.YEAR);
//		int month = cal.get(Calendar.MONTH)+1;
//		int day = cal.get(Calendar.DAY_OF_MONTH);
//		
//		System.out.println("현재 : "+year + "년 " + month + "월 " + day + "일 ");

	}

}
