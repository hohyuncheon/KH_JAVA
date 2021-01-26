package com.oop.movie.run;

import java.util.Calendar;

import com.oop.movie.model.Movie;

public class Run {

	public static void main(String[] args) {
		String movieTitle1 = "무드인디고";
		Movie m1 = new Movie(movieTitle1);
		System.out.println(m1.information());
		
		String movieTitle2 = "5일의 마중";
		String director2 = "장예모";
		Movie m2 = new Movie(movieTitle2, director2);
		System.out.println(m2.information());
		
		String movieTitle3 = "패신져스";
		String director3 = "모튼틸덤";
		String casting3[] = {"크리스 프랫", "제니퍼 로렌스"};
		
		Movie m3 = new Movie(movieTitle3, director3, casting3);
		System.out.println(m3.information());
		
		
		String movieTitle4 =  "조제, 호랑이 그리고 물고기들";
		String director4 = "이누도 잇신";
		String casting4[] = {"츠마부키 사토시(츠네오)", "이케와키 치즈루(조제/쿠미코)", "아라이 히로후미(코지)"};
		//Date는 국제화문제로 파라미터가 있는 생성자 및 관련메소드가 deprecated이다. 
		Calendar release4 = Calendar.getInstance();
		//void java.util.Calendar.set(int year, int month, int date)
		release4.set(2004, Calendar.NOVEMBER, 29);
		
		//대신 Calendar클라스를 이용한다.
//		Calendar release4 = Calendar.getInstance();
//		release4.set(Calendar.YEAR, 2004);
//		release4.set(Calendar.MONTH, Calendar.NOVEMBER);
//		release4.set(Calendar.DAY_OF_MONTH, 29);
		
		
		
		Movie m4 = new Movie(movieTitle4, director4, casting4, release4);
		System.out.println(m4.information());		
		
	}

}
