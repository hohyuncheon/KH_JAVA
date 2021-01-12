package test2;

public abstract class Member {
	
	public int age;

	public Member() {
		super();
	}

	public Member(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	public abstract int getPayment();
	

}
