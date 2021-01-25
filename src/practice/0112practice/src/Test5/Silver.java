package Test5;

public class Silver extends Member{
	

	public Silver() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Silver(String number, String grade, int point) {
		super(number, grade, point);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double eza() {
		return getPoint() *0.2;
		
	}
	
	

}
