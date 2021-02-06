package workshop5;

//프로그램 실행 시 eclipse argument로 공백이 없는 String 형태의 문자열을 받아 들인다.
//입력 예1: Morning 입력 받은 문자열을 뒤에서부터 출력 하는 프로그램을 작성 한다.
//단, String class의 toCharArray()함수를 이용한다.


public class Test01 {
	public static void main(String[] args) {
		
		char [] a = args[0].toCharArray();
		
		for (int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i]);
		}
		
	}

}
