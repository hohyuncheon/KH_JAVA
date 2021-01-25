package com.exception.charcheck;

//[예외처리 실습문제]
//<문제 1>
// - 패키지명 : com.exception.charcheck
// 1. 사용자 정의 예외클래스 만들기
//    클래스명 : CharCheckException

public class CharCheckException extends Exception{

	public CharCheckException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CharCheckException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public CharCheckException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public CharCheckException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public CharCheckException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}


	
	

}
