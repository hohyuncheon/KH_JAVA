package Test5;

public class Vip extends Member{

	
	public Vip() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Vip(String number, String grade, int point) {
		super(number, grade, point);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double eza() {
		return getPoint() *1;
		
	}

}
