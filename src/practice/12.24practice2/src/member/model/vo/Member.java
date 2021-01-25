package member.model.vo;

public class Member {

	private String name;// 이름
	private String grade;// 등급
	private int point;// 포인트
	private double jaPoint; // 이자포인트

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	// 이자율
	public double getJaPoint() {
		return jaPoint;
	}

	public Member() {
		super();
	}

	public Member(String name, String grade, int point) {
		super();
		this.name = name;
		this.grade = grade;
		this.point = point;
	}

}
