package compony;

//1) eclipse Argument 에서 월 기본급을 입력 받는다. (정수형으로 입력)
//2) 입력된 기본급을 기준으로 직원들의 연봉을 계산하는 프로그램을 작성 한다.

//* 연봉 계산 기준
//1) 기본급: 입력 데이터 
//2) 보너스: 분기별로 월 기본급의 20% 지급 
//3) 세금: 기본급은 10% 공제, 보너스는 5.5% 공제
//
//1년 동안 세금을 제외한 총 지급 금액을 계산 한다.

public class Test02 {
	public static void main(String[] args) {
		
//		c.setSalary(num);
		
		//인트로 변환
		double num = (double)Integer.parseInt(args[0]);
		
		Compony c = new Compony(num);
		c.print();
		
		
	}

}
