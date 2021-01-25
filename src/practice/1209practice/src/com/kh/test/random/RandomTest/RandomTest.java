package com.kh.test.random.RandomTest;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {

		RandomTest rt = new RandomTest();
		rt.test1();
		

	}
	
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("\t===가위바위보게임===\n"
						+ "숫자를 선택하세요(1. 가위 2. 바위 3.보)");
		int person= sc.nextInt();
		
		Random rd = new Random();
		int com = rd.nextInt(3) +1;
		
		System.out.println("======결과======");

		if(person==1) {
			System.out.println("당신은 가위를 냈습니다");
		}
		else if(person==2) {
			System.out.println("당신은 바위를 냈습니다");
		}
		else if(person==3) {
			System.out.println("당신을 보를 냈습니다");
		}
		
		if(com==1) {
			System.out.println("컴퓨터는 가위를 냈습니다");
			
		}
		else if(com==2) {
			System.out.println("컴퓨터는 바위를 냈습니다");
		}
		else if(com==3) {
			System.out.println("컴퓨터는 보를 냈습니다");
		}
		
		
		System.out.println("============");
		//무승부일때
		if(com == person) {
			System.out.println("무승부입니다");
		}
		
		//유져가 이겼을때
		if(person == 1 && com ==3) {
			System.out.println("당신이 이겼습니다");
		}
		if(person == 2 && com ==1) {
			System.out.println("당신이 이겼습니다");
		}
		if(person == 3 && com ==2) {
			System.out.println("당신이 이겼습니다");
		}
		
		//유져가 졌을때
		if(person == 1 && com ==2) {
			System.out.println("당신이 졌습니다");
		}
		if(person == 2 && com ==3) {
			System.out.println("당신이 졌습니다");
		}
		if(person == 3 && com ==1) {
			System.out.println("당신이 졌습니다");
		}
		
	}
	

}
