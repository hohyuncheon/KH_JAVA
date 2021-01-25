package withys;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int s = sc.nextInt();

		// 배열생성
		int[] array = new int[s];

		// 입력
		ArrayTest2 t = new ArrayTest2();
		for (int i = 0; i < array.length; i++) {
			System.out.println("정수를 입력해봐");
			array[i] = sc.nextInt();
		}
		// 출력
		System.out.println(t.meththd(array));
	}						//meththd(int[])

	// 합계를 구하는 메소드

	public int meththd(int[] num) {
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			count += num[i];
		}
		return count;
	}

}
