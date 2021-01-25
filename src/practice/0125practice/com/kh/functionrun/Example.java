package com.kh.functionrun;

import java.util.Scanner;

public class Example {
	
	public void opSample1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수는? : ");
		int ko = sc.nextInt();
		
		System.out.print("영어점수는? : ");
		int en = sc.nextInt();
		
		System.out.print("수학점수는? : ");
		int ma = sc.nextInt();
		
		int to = (ko + en + ma);
		double av = to / 3.0;
		
		String s = (ko >= 40) && (en >= 40) && (ma >= 40) && (av >=60)? "합격" : "불합격";
		
		System.out.println("총점점수 = " + to);
		System.out.println("평균점수 = " + av);
//		System.out.printf("영어 = %s%n", en);
//		System.out.printf("수학 = %s%n", ma);
		System.out.println(s);
		
		
	}

	
	public void opSample2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생이름 : ");
		String name = sc.next();
		
		System.out.print("학년: ");
		int gr = sc.nextInt();

		System.out.print("반 : ");
		int ca = sc.nextInt();
		
		System.out.print("번호 : ");
		int num = sc.nextInt();
		
		
		
		System.out.print("성별(M or F): ");
		String se = sc.next().toUpperCase().charAt(0) == 'M'?"남학생":"여학생";
		
		//toUppercase 소문자 대문자 둘다가능하게만들어줌
		
		System.out.print("성적 : ");
		double scor = sc.nextInt();
		
		System.out.printf("%d학년 %d반 %d번 %s %s은 성적이 %.2f이다", gr, ca, num, se, name, scor);
		
		
	}
}
