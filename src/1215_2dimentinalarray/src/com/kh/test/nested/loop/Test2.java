package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Test2 te = new Test2();
		te.test2();

	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력하시오");
		int num = sc.nextInt();

		if (num >= 0) {
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num - i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}

		} else {

			System.out.println("정수를 입력하시오");
		}

	}

}
