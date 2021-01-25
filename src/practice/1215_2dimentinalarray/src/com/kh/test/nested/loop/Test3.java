package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 te = new Test3();
		te.test3();

	}

	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력하시오");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 1 + i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		for (int k = 0; k < num; k++) {
			for (int o = 0; o < k + 1; o++)
				System.out.print(' ');// 앞줄에 공백찍기

			for (int z = 1; z < num - k; z++) { // 내림차순으로 별찍기
				System.out.print("*");
			}
			System.out.println(" ");

		}
	}
}
