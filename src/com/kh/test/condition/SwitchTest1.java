package com.kh.test.condition;

import java.util.Scanner;

public class SwitchTest1 {
	public static void main(String[] args) {
		
		SwitchTest1 sw = new SwitchTest1();
		sw.test10();
	}
	
	public void test10() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("----------menu----------\r\n" + 
				"1. 가정용 (50원/liter)\r\n" + 
				"2. 상업용 (45원/liter)\r\n" + 
				"3. 공업용 (30원/liter)\r\n" + 
				"-------------------------\n");
		System.out.print("사용하시는 메뉴 번호를 입력하시오");
		int menu = sc.nextInt();
		
		System.out.print("물 사용량을 입력하시오");
		int wa = sc.nextInt();
		
		int num = 0;
		String sum = "";
		
		
		switch(menu) {
		case 1 : sum = "가정용(가정에서 사용하실 경우를 선택하셨습니다)" ; num +=50 ; break;
		case 2 : sum = "상업용(상업에서 사용하실 경우를 선택하셨습니다)" ; num +=45 ; break;
		case 3 : sum = "공업용(공업에서 사용하실 경우를 선택하셨습니다)" ; num +=30 ; break; 
		default : System.out.println( "메뉴번호는 1,2,3만 가능합니다.");
		return;
		}
		
		int to = num * wa;
		int ch = (int)(to * 0.05);
		
		
		System.out.println("----------<<수도세>>-----------");
		System.out.println("선택메뉴번호  : " + sum);
		System.out.println("사용요금  : " + to );
		System.out.println("수도세  : " + ch );
		System.out.println("총 수도요금  : " + (ch + to));
		
	}

	
	
}
