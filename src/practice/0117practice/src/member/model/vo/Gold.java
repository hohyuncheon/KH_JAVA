package member.model.vo;

public class Gold {
	
	
	private String name;//이름
	private String grade;//등급
	private int point;//포인트
	

	
	//getter setter
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
	
	
	
	//이자율추가 getter
	
	public double getinterest() {
		
		return point * 0.05;
	}
	
	
	
	public Gold() {

	}
	//입력되는 곳
	public Gold(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
		
	}
	
	


}
