package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 te = new Test1();
		te.test1();
	}

	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int num = sc.nextInt();

		if (num >= 0) {
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < i+1; j++)
					System.out.print(j + 1);
				System.out.println();
			}

		} else {
			System.out.println("양수가아닙니다");
		}
	}

}
