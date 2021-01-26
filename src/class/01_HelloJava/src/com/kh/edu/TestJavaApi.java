package com.kh.edu;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestJavaApi {

	public static void main(String[] args) {
		TestJavaApi t = new TestJavaApi();
		t.test();
	}

	private void test() {
		//1. Date의 메소드 가져오기
		//deprecated
		Date d = new Date();
		System.out.println(
				(d.getYear() + 1900) + "/" + 
				(d.getMonth() + 1) + "/" + 
				d.getDate()
			);//Deprecated

		//2. 형식객체 SimpleDateFormat 사용하기
		//형식문자열
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf.format(d));
		
		//3. java.util.Calendar
		//static키워드가 있는 메소드는 클래스명.메소드 로 호출!
//		Calendar cal = Calendar.getInstance();
		Calendar cal = new GregorianCalendar();
		System.out.println(
				cal.get(Calendar.YEAR) + "/" +
				(cal.get(Calendar.MONTH) + 1) + "/" +
				cal.get(Calendar.DATE)
			);

	}

}
