package member.model.vo;

public class Vip extends Member {

	public Vip() {
		super();

	}

	public Vip(String name, String grade, int point) {
		super(name, grade, point);
	}

	public double getJaPoint() {
		return super.getPoint() * 0.1;
	}

}