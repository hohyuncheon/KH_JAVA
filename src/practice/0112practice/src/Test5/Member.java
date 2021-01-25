package Test5;

public abstract class Member {
	
	private String number;//이름
	private String grade;//등급
	private int point;//포인트
	
	
	public Member(String number, String grade, int point) {
		super();
		this.number = number;
		this.grade = grade;
		this.point = point;
	}

	public abstract double eza();

	public Member() {
		super();
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
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
	

}
