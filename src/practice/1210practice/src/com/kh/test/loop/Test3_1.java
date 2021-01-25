package com.kh.test.loop;

import java.util.Scanner;

public class Test3_1 {

	public static void main(String[] args) {
		
		Test3_1 te = new Test3_1();
		te.test4();
		
		

	}
	public void test4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 계산기 \n정수를 입력해봐");
		int num = sc.nextInt();
		
		if(num<10 && num>=2) {
			for(int i = 1 ; i<=10 ;i++) {
				System.out.println(num+"*"+i+"="+num*i);
			}
		}else {
			System.out.println("잘못입력하였습니다");
		}
	}

	
}
