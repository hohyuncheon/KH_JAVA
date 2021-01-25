package Test5;

public class VVip extends Member{

	
	public VVip() {
		super();
		// TODO Auto-generated constructor stub
	}


	public VVip(String number, String grade, int point) {
		super(number, grade, point);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double eza() {
		return getPoint() *1.5;
		
	}

}
