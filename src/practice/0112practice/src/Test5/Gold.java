package Test5;

public class Gold extends Member{
	
	
	public Gold() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Gold(String number, String grade, int point) {
		super(number, grade, point);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double eza() {
		return getPoint() *0.5;
		
	}

}
