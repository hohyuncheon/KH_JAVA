package self;

import java.util.Scanner;

public class selfTest3 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("홀수숫자입력해보시오");
		
		//5개의 배열생성
		int[] num = new int[sc.nextInt()];
		
		//값입력
		for (int i = 1; i <= num.length/2; i++) {
			System.out.println(i);
		}
	
		for (int i = num.length / 2 + 1; i > 0; i--) {
			System.out.println(i);
			
		}
		
		//값출력
		
//		
//		if (num%2==0) {
//			System.out.println("잘못입력하셨습니다 홀수입력하세요");
//		}else {
//			
//			for (int i = 0; i < args.length %2; i++) {
//				
//				
//			}
//			
//			System.out.println();
//					
//		
//			
//		}
		
		
		
		
		
	}
}
