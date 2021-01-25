package test1;

// 메소드:
//    나이를 매개변수로 받아 초기화하는 생성자
//    기타 꼭 필요한 메소드

public class RegularMember extends Member{

	
	//나이받는 메서드
	public RegularMember(int age) {
		super(age);
	}

	//정액제 1000원
	@Override
	public int getpayment() {
		return 1000;
	}
	


}
