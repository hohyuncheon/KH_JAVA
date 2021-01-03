package self;

import java.util.Scanner;

public class selfTest2 {
	
	public static void main(String[] args) {
		
		
		System.out.println("전화번호를 입력하시오");
		
		Scanner sc = new Scanner(System.in);
		
		char [] number = sc.nextLine().toCharArray();
		
		char[] number2 = number.clone();
		
		System.out.print(number);
		
		for (int i = 7; i < number.length; i++) {
			number2[i] ='*';
		}
		
		System.out.println();
		System.out.print(number2);
		
		
	}

}
