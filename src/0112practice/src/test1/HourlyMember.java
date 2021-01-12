package test1;


////메소드:
//나이, 사용시간을 매개변수로 받아 초기화하는 생성자

public class HourlyMember extends Member{
	
	 int num;//사용시간  
	
//	나이, 사용시간 메서드
	public HourlyMember(int age, int time) {
	super(age);
	this.num = num;
	}
	 
	
	public HourlyMember(int num) {
		super(num);
	}

	//시간당 100원 곱하는 메소드
	@Override
	public int getpayment() {
		return num*100;
	}


}
