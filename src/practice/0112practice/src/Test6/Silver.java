package Test6;

public class Silver extends Member{
	
	
	
	public Silver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Silver(String name, String grade, int point) {
		super(name, grade, point);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double eza() {
		return getPoint()*0.2;
	}
	

}
