package self;

import java.util.Scanner;

public class SelfTest4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하시오");
		char[] num = sc.nextLine().toCharArray();
		
		char [] num2 = num.clone();
		
		
		System.out.print(num);
		
		for (int i = 6; i < num2.length; i++) {
			num2[i] = '*';
		}
		System.out.println();
		System.out.print(num2);
		
		

	}

}
