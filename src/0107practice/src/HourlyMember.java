
public class HourlyMember extends Member{
	int time;//사용시간
	
	public HourlyMember() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public HourlyMember(int age) {
		super(age);
	}

	public HourlyMember(int age, int time) {
		super(age);
		this.time = time;
	}

	@Override
	public int getPayment() {

		return time *100;
	}
	

	
	

}
