package com.exception.charcheck;

//		3. 실행용 클래스 : Run (main 포함)
//		실행할 메소드 작성 : public void test1(){}
//		키보드로 문자열을 입력받아 사용
//		countAlpha 메소드로 문자열 전달하고, 실행결과 받아 출력함.
//		- 반드시 try ~ catch 문 사용.
//		에러메시지 : "체크할 문자열 안에 공백 포함할 수 없습니다."



public class Run {

	public static void main(String[] args) {
		
		Run run = new Run();
		run.test1();
	}

	public void test1() {
		CharacterProcess cp = new CharacterProcess();
		
		//cp.countAlpha 에 문자를 보냄 
		try {
			cp.countAlpha("testtesFDJAKLFDJA");
//			공백있을시 스케너로 안함.
//			cp.countAlpha("tes tte st");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
}
