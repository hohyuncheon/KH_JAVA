package com.oop.emp.model;

import java.util.Scanner;

public class EmpTest {
	
	public static void main (String [] args) {
		Model m = new Model();
		Scanner sc = new Scanner(System.in);
		
		
		for(;;) {
			
			System.out.println("******* 사원 정보 관리 프로그램 ************\n"+ 
					"1. 새 사원 정보 입력  =>\r\n"+ 
					"2. 사원 정보 삭제 => \r\n" + 
					"3. 사원정보 출력 =>  \r\n" + 
					"9. 끝내기\r\n" + 
					"********************************************");
			int choice = sc.nextInt();
			if(choice==1) {
				m.empInPut();
				continue;
			}else if(choice==2) {
				m=null;
				continue;
			}else if(choice==3) {
				m.empOutPut();
			}else if(choice==9) {
				System.out.println("끝냅니다");
				break;
			}else {
				System.out.println("잘못입력하셨습니다");
			}
			
				
				
				
				
				
		}
		
	}

}	
	
	
