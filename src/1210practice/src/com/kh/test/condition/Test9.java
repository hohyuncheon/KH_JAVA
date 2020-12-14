package com.kh.test.condition;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {

		Test9 te = new Test9();
		te.test();
		
		
	}

	public void test() {


		System.out.println("*********주메뉴*********\n"
							+ "a. 불고기버거 ------------5000\n"
							+ "b. 새우버거 --------------4000\n"
							+ "c. 치킨버거 --------------4500\n"
							+ "d. 한우버거 -------------10000\n"
							+ "e. 디버거 ----------------7000\n"
							+ "*********************** ");
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 메뉴를 알파벳으로 입력하세요");
		char al = sc.next().charAt(0);

		System.out.println("*******사이드메뉴********\n"
								+ "1. 콜라 -------------------1500\n"
								+ "2. 사이다 -----------------1500\n"
								+ "3. 밀크쉐이크-------------2500\n"
								+ "4. 레드불------------------3000\n"
								+ "***********************");
		System.out.print("사이드메뉴를 숫자로 입력하세요");
		int num = sc.nextInt();

		int sum = 0;
		
		String mainNum = "";
		String smainNum = "";
		
		switch(al) {
		case 'a': mainNum = "불고기버거"; sum += 5000; break;
		case 'b':mainNum = "새우버거"; sum += 4000; break;
		case 'c':mainNum = "치킨버거"; sum += 4500; break;
		case 'd':mainNum = "한우버거"; sum += 10000; break;
		case 'e':mainNum = "디버거"; sum += 7000; break;
		default: System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");
		}
		
		switch(num) {
		case 1: smainNum = "콜라"; sum += 1500; break;
		case 2: smainNum = "사이다"; sum += 1500; break;
		case 3: smainNum = "밀크쉐이크"; sum += 1500; break;
		case 4: smainNum = "레드불"; sum += 1500; break;
		default: System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");
		

		}
		
		System.out.printf("%s, %s은(는) 총 %s원입니다", mainNum, smainNum, sum);
				
		
	}
	
}

