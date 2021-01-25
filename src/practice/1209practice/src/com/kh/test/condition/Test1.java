package com.kh.test.condition;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Test1 t1 = new Test1();
		t1.test1();
		t1.test2();
		t1.test3();
		
	
	}
	
	
	public void test3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("좋아하는 숫자는?");
		int num = sc.nextInt();
		
		if(num % 2 ==0) {
			System.out.println("짝수다");
		}
		
		else {
			System.out.println("홀수다");
		}
		
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A의 연봉은? ex)5000");
		int AP = sc.nextInt();
		
		System.out.print("B의 연봉은? ex)5000");
		int BP = sc.nextInt();
		
		System.out.print("C의 연봉은? ex)5000");
		int CP = sc.nextInt();
				
		if(AP>=5000 || BP>=5000 ) {
			System.out.println("A는 고액연봉자입니다");
		}
		
		else if(BP>=5000) {
			System.out.println("B는 고액연봉자입니다");
		}
	
		else if(CP>=5000) {
		System.out.println("C는 고액연봉자입니다");}
	}
	
	

	public void test1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("국어 점수 : ");
		int ko = sc.nextInt();

		System.out.print("영어 점수 : ");
		int en = sc.nextInt();

		System.out.print("수학 점수 : ");
		int ma = sc.nextInt();

		int to = ko + en + ma;

		System.out.println(to);

		if (to >= 250) {

			System.out.println("우수생입니다");

		}

		else {

			System.out.println(" ");

		}

	}
}
