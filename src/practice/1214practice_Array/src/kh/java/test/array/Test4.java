package kh.java.test.array;

import java.util.Scanner;

//	사용자의 전화번호를 입력받고, 11자리의 문자형배열에 저장한후,  가운데 4자리를 *로 가리기.  
//	단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요
// 
//    힌트) 복사방법
//   - for문이용 1:1대입
//   - System.arraycopy() 매소드 이용
//   - clone() 매소드 이용

public class Test4 {

	public static void main(String[] args) {
		Test4 te = new Test4();
//		te.test4();
		te.test5();
	}

	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자의 전화번호 11자리를 입력하세요");
		String num = sc.nextLine();

		char[] car = new char[11];// 11개의 빈공간에 전화번호 각 자리의 수 넣기
		for (int i = 0; i < num.length(); i++) {
			car[i] = num.charAt(i);
			}
		
		String result = num.substring(0, 3)+"xxxx"+num.substring(7);
		System.out.println(result);

	
	}	
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자의 전화번호 11자리를 입력하세요");
		String num = sc.nextLine();

		char[] car = new char[11];// 11개의 빈공간에 전화번호 각 자리의 수 넣기
		for (int i = 0; i < num.length(); i++) {
			car[i] = num.charAt(i);
		}

		char[] carcopy = new char[11];// 값 깊은 복사하기
		for (int j = 0; j < car.length; j++) {
			if (j > 2 && j < 7) {
				carcopy[j] = '*';
			} else {
				carcopy[j] = car[j];

			}

		}
		for (int i = 0; i < carcopy.length; i++) {
			System.out.print(carcopy[i]);
		}

	}
}
