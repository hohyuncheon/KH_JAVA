package workshop4;
//프로그램 실행 시 eclipse argument로 5~10까지의 정수형 데이터를 입력 받는다.
//입력 받은 정수 값을 Calc class의 calculate()함수를 이용하여 1부터 입력 받은 숫자까지 짝수만 더하는 프로그램을 작성 한다.

public class Test04 {
	public static void main(String[] args) {
		
		Calc c = new Calc();
		
		int ii =Integer.parseInt(args[0]);
		
		System.out.println("입력값 :" + ii);
		System.out.println("합계는 :"+c.calculate(ii));
	}
	

}
