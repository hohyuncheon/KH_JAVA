package arraytest;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		
		System.out.println("hw4_1  : ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 하한 입력  : ");
		int min = sc.nextInt();
		
		System.out.println("나이 상한 입력  : ");
		int max = sc.nextInt();
		
		System.out.println("학생 수 입력 : ");
		int num2 = sc.nextInt();
		
		
		
		//배열할당
		int[] ageArr = new int[max-min+1];
		int[] countArr = new int[max-min+1];
		
		
		
		//for
		
		for (int i =0; i < num2; i++) {
		System.out.println("타당한 나이 : ");
		int age = sc.nextInt();		
		
		if(age<min ||age>max) {
			System.out.println("범위를 벗어났습니다 다시입력");
			i--;
//		}else {
//			if()
			
		}
		
		
		}
		
		
		
	}

}
