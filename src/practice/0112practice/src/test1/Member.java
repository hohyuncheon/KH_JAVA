package test1;

public abstract class Member {
	
	private int age;//나이

	public Member(int age) {
		this.age = age;
	}
	
	
	//나이를 받아오는 getage
	public int getAge() {
		return age;
	}
	// getPayment() - 회비를 조회하는 메소드(매개변수는 없고, int형을 리턴하는 abstract method)
	public abstract int getpayment();
	
	

}
