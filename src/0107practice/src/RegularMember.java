
public class RegularMember extends Member{

	public RegularMember() {
		super();
	}
	
	// 나이를 매개변수로 받아 초기화하는 생성자
	public RegularMember(int age) {
		super(age);
	}

	@Override
	public int getPayment() {
		return 1000;
	}
	
	
	

}
