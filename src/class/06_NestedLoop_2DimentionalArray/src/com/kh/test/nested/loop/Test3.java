package com.kh.test.nested.loop;

import java.util.Scanner;

/*
	정수하나 입력받아, 그 수가 양수일때만 입력된 
	수를 줄 수로 적용하여 다음과 같이 출력되게 하는 
	프로그램을 만들어보자.
		출력예)
	  정수 입력 : 5
	
	     0: *
	     1: **
	     2: ***
	     3: ****
	     4: *****
	     5:  ****
	     6:   ***
	     7:    **
	     8:     *

 */
public class Test3 {

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.test();
	}

	private void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의정수를 하나 입력하세요 ==> ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("양의정수가 아닙니다.");
			return;
		}
		
		//5->9, 6->11, 7->13
		for (int i = 0; i < num*2-1; i++) {
			
			//0 1 2 3 4
			if (i<num) {
				//j<=1 등호 주의!!
				for (int j = 0; j <= i; j++) {
				 	System.out.print("*");
				}
			}
			//5 6 7 8 
			else {
				for (int j = 0; j < num; j++) {
					if (j <= (i - num))
						System.out.print(" ");
					else 
						System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
