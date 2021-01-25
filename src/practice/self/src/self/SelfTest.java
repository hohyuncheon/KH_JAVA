package self;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
	
		
		System.out.println("주민번호입력하시오");
		
		char[] num = sc.nextLine().toCharArray();
		
		char[] num2 = num.clone();
		for(char c : num) {
			System.out.print(c);
		}
		
		
		for (int i = 6; i < num.length; i++) {
			num2[i] = '*';
		}
		System.out.println();
		for(char c : num2) {
			System.out.print(c);
		}

		
	}

}
