package test2;

public class HourlyMember extends Member {
	
	private int num;//사용시간  

	@Override
	public int getPayment() {
		return 0;
	}

	public HourlyMember(int age, int num) {
		super(age);
		this.num = num;
	}

//	public HourlyMember(int num) {
//		super();
//		this.num = num;
//	}
	
	
	
	
	

}
