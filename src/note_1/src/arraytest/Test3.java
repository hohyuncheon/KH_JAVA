package arraytest;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		
		Test3 t= new Test3();
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 갯수를 입력하시오");
		int num = sc.nextInt();

		// 배열생성
		int[] array = new int[num];

		// 합계 더해지는곳
		for (int i = 0; i < array.length; i++) {
			System.out.println("정수를 입력하시오");
			array[i] = sc.nextInt();
		}

		// 출력문
		System.out.println(Test3.method1(array));

	}
	
	//매서드
	
	public static int method1(int[] array) {
		int sum =0;
		for(int arr: array) {
			sum+=arr;
			
		}
		
		return sum;
	}

}
