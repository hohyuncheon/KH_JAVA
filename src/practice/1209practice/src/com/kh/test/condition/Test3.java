package com.kh.test.condition;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Test3 te = new Test3();
		
		te.test7() ;

	}
	
	public void test7() {
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.print("정수를 쓰시오 ex)1~100");
		int num = sc.nextInt();
		
		System.out.print("정수를 쓰시오 ex)1~100");
		int num2 = sc.nextInt();

		System.out.print("연산자를 쓰시오 ex)+,-,*,/");
		char op = sc.next().charAt(0);
		
		if(num < 0 || num > 100 || num2 < 0 || num2 > 100 || op != '+' && op != '-' && op != '*' && op!= '/') {
			System.out.println("잘못 입력하셨습니다 프로그램을 종료합니다");
		
		}
		
		else if(op == '+') {
			
			System.out.println(num +"+" + num2 +"=" + (num +num2));
		}
		
		else if(op == '-') {
			
			System.out.println(num +"-" + num2 +"=" + (num -num2));
		}
	
		else if(op == '*') {
			
			System.out.println(num +"*" + num2 +"=" + (num *num2));
		}
		
		else if(op == '/') {
			
			System.out.println(num +"/" + num2 +"=" + (num /num2));
		}
		
		
		
		
	}
}
