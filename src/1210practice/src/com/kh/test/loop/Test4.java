package com.kh.test.loop;

import java.util.Scanner;

//
//[문제 4]
//문자열의 길이를 리턴하는 String의 메소드를 api에서 찾아 사용할 것)
//    문자열과 문자열에서 검색될 문자를 입력 받아 문자열에 그 문자가 몇 개이었는지 개수를 확인하는 
//    프로그램을 작성하세요. 
//    또, 검색할 문자가 영문자가 아니면 "영문자가 아닙니다." 출력후
//    프로그램을 종료하세요. 
//    

//    출력 예)
//    문자열 입력 : application
//    검색할 문자 입력 : p
//    'p'가 포함된 갯수 : 2 개
//    
//    
//    문자열 입력 : apple_test123
//    문자 입력 : ㄱ
//    영문자가 아닙니다.

public class Test4 {

	public static void main(String[] args) {
		
		Test4 te = new Test4();
		te.test4();
		

	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력해봐");
		String st = sc.nextLine();
		
		System.out.println("찾고싶은 알파벳은?");
		char alp = sc.next().charAt(0);
		
		
		if( (alp >='A' && alp<='Z' 
				|| alp >= 'a' && alp <='z')) {
			
			int e =0;
			
			for(int i = 0; i < st.length() ; i++ ) {
				char c = st.charAt(i);
				if(c==alp) {
				e++;
				}
			}
			System.out.println("중복개수"+e);
			}
			
		else {
				System.out.println("잘못입력함 나가주세요");
			}
			
	}
}
