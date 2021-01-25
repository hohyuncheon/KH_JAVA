package com.kh.test.loop;

import java.util.Scanner;


//- 패키지 : com.kh.test.loop
//[문제 1]
//- 클래스 : com.kh.test.loop.Test1.java
//- 메소드명 : public void test()
//   1부터 사용자로부터 입력 받은 정수까지 존재하는 짝수의 합을 출력하세요. 
//   (for문 활용)

public class Test1 {

	public static void main(String[] args) {

		Test1 te = new Test1();
		te.test1();

	}

	public void test1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하시오");
		int num = sc.nextInt();
		int hold = 0;

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				hold += i;
			}

		}
		
		System.out.println(num+"까지 짝수의 합은? = " + hold);


	}

}
