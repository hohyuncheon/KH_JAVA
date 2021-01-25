package Test6;

public class Gold extends Member{

	
	public Gold() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gold(String name, String grade, int point) {
		super(name, grade, point);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double eza() {
		return getPoint()*0.5;
	}

}
