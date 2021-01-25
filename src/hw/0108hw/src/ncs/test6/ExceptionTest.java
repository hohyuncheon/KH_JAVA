package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("2~5정수를 입력해주세요 합계를 구해드립니다.");
		Calculator ca = new Calculator();
		
		try {
//			ca.getSum(sc.nextInt());//입력
			System.out.println(ca.getSum(sc.nextInt()));//입력동시에 출력
		} catch (InvalidException e) {
			e.printStackTrace();
		}
		
	}

}
