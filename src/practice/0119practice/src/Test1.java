import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test1 {

	public static void main(String[] args) {
		
		Test1 t = new Test1();
		
		t.test1();//simpledate쓰는법
		t.test2();//나이구하기
	}
	//캘린더 객처를 만드는데 윤수형 생일 simpledate로 출력
	//1994.02.06
	
	public void test1() {
		
		Calendar ca = new GregorianCalendar(1994,01,06);
		
		Date da = new Date(ca.getTimeInMillis());
		
		//데이트를 넣어야함
		SimpleDateFormat si = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(si.format(da));
	}
	
	
	//형이 몇 밀리초를 살아왔는가
	
	public void test2() {
		
		//생일날짜 밀리초
		Calendar ca = new GregorianCalendar(1994,01,06);
		
		//현재날짜
		Calendar ca2 = Calendar.getInstance();
		
		//차이
		long now = ca2.getTimeInMillis()-ca.getTimeInMillis();
		
		//차이밀리초
		System.out.println("차이밀리초"+now);
		System.out.println("나이"+now/1000/60/60/24/365);
		
	}
}
