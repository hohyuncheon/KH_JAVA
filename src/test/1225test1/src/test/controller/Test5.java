package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1~9 정수를두번입력하시오");
		
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		if(i >=10 || j >=10 ) {
			System.out.println("잘못입력하셨습니다");
			return;
		}
		
		if (i*j<10) {
			System.out.println("한자리수입니다");
			
		}else if(i*j<=100){
				System.out.println("두자리수입니다");
		}
		
		
	}

}
