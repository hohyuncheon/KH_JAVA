package com.kh.test.condition;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Test5 te = new Test5();

		te.test();

	}

	public void test() {

		Scanner sc = new Scanner(System.in);

		System.out.print("당신의 키는(cm?) : ex)185 ");
		int he = sc.nextInt();

		System.out.print("당신의 몸무게는(kg?) : ex)57 ");
		int we = sc.nextInt();

		double bmi = we / he / 200 * he/100;


		if (bmi >= 30) {
			System.out.println("고도미만입니다");
		}

		else if (bmi >= 25 && bmi < 30 ) {
			System.out.println("비만입니다");
					
		}
		
		else if (bmi >= 23 && bmi < 25) {
				System.out.println("과체중입니다");
		
		}

		else if (bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중입니다");
		}

		else  {
			System.out.println("저체중입니다");
			
		}
	}
				
}
