package freetest;

import java.util.Scanner;

public class Free {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("1 ~ 100사이의 정수를 입력하시오");
		int num = sc.nextInt();

		if (num >= 1 && num <= 100) {
			if (num == 1) {
				System.out.println("1은 소수가 아닙니다");

			} else {
				for (int i = 2; i < num; i++) {
					if (num % i == 0) {
						System.out.println(num + "은(는) 소수가 아닙니다");
						break;
					} else {
						System.out.println(num + "은 소수입니다.");
					}
					break;
				}
			}
		} else {
			System.out.println("1부터 100사이의 정수를 입력하세요");

		}
	}
}
