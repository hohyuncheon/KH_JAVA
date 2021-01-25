
public class Student {
	
	private int number;//학번
	private String name;//이름
	private double score;//학점
	
	//성적이 그 이상이면 true, 아니면 false 리턴
	private boolean solomon;
	
	public Student() {
		super();
	}
	public Student(int number, String name, double score) {
		super();
		this.number = number;
		this.name = name;
		this.score = score;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	public void name() {
		if(score>=1.5) {
			solomon = true;
		}
		if(score<1.5) {
			solomon = false;
		}
	}
}
