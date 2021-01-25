package com.exception.charcheck;

import javax.sound.midi.Soundbank;

//	2. 클래스 만들기
//	클래스명 : CharacterProcess
//	기본 생성자
//	메소드
//	  전달된 문자열값에서 영문자가 몇개인지 카운트해서 리턴
//	public int countAlpha(String s){}
//	  단, 공백문자가 있으면, CharCheckException 발생

public class CharacterProcess {
	
	// 기본생성자 생성
	public CharacterProcess() {
		super();
	}

	// 카운트용
	int count = 0;


	public int countAlpha(String s) throws CharCheckException {

		// char로 변환
		char[] ch = s.toCharArray();

		// 공백일때 charcheckexception으로 throw
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				throw new CharCheckException("체크할 문자가 없습니다");
			} else if (ch[i] >= 'a' || ch[i] <= 'z' | ch[i] >= 'A' | ch[i] <= 'Z') {
				count++;
			}
		}System.out.println("알바벳 숫자는? "+ count+"개입니다"); //밑에 리턴이 있는데 여기서 출력해야하는 이유 밑에 리턴 COUNT의 기능은?
		return count;
	}

}
