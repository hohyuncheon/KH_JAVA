package com.kh.test.loop;

// 클래스 : com.kh.test.loop.Test3.java
// 메소드명 : public void test()
//    정수를 입력 받아 입력된 값의 구구단 프로그램을 만들어보세요.  
// 
//    예) 5입력 
//    5X1=5
//    5X2=10
//    5X3=15
//     .
//     .
//    5X9=45
//    단, 1~9까지만 가능하고 이외에 값을 넣으면 “잘못입력하셨습니다. 프로그램종료합니다”출력

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Test3 te = new Test3();
		te.test3();

	}
	
	public void test3() {
		
		//정수를 입력받음
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int num = sc.nextInt();
		
		//
		
		int dan = 0;
		
		for(int j = 1; j <10 ; j++) {
			dan = j;
			
			System.out.println(num +"x"+dan +  "=" + dan * num );
			

	}

}}
