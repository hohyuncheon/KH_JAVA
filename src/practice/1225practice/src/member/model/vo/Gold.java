package member.model.vo;

public class Gold extends Member {

	public Gold() {
		super();

	}

	public Gold(String name, String grade, int point) {
		super(name, grade, point);
	}

	public double getJaPoint() {
		return super.getPoint() * 0.05;
	}

}
