
public abstract class Member {
	int age;

	public Member(int age) {
		super();
		this.age = age;
	}

	public Member() {
		super();
	}
	
	public int getAge() {
		return age;
	}

	//회비를 조회하는 메소드(매개변수는 없고, int형을 리턴하는 abstract method)
	public abstract int getPayment();

}
