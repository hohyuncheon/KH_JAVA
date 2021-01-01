package com.exception.number;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Run r = new Run();
		r.test();
	}

	public void test() {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수두개를 입력하시오");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		NumberProcess np = new NumberProcess();

		boolean solomon;

		try {
			solomon = np.checkDouble(num1, num2);
			if (solomon) {
				System.out.println("첫번째수는 두번째수의 배수가 맞습니다.");
			} else {
				System.out.println("첫번째수는 두번째수의 배수가 아닙니다.");
			}
		} catch (NumberRangeException e1) {
			e1.printStackTrace();
		}

	}
}
