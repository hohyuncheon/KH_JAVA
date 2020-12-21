package com.calc;

import java.util.Scanner;

public class Calculator {
		
		public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("1~9 정수를두번입력하시오");
		
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		int plu = i+j;
		int min = i-j;
		int mul = i*j;
		int div = i/j;
		if (j<=0) {
			div =0;
		
		}
		
		System.out.println("합 : "+plu);
		System.out.println("차 : "+min);
		System.out.println("곱 : "+mul);
		System.out.println("나누기 : "+div);
		}
}
		
		

		
		
		
		