package test2;

public class RegularMember extends Member{
	
	
	public RegularMember() {
		super();
	}

	public RegularMember(int age) {
		super(age);
	}

	@Override
	public int getPayment() {
		return 1000;
	}

	
}
