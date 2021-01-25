
public class Manager extends Employee{
	
	private int bonus;//보너스

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public Manager(int salary, int bonus) {
		super(salary);
		this.bonus = bonus;
	}

	public Manager() {
		super();
	}

	public Manager(int salary) {
		super(salary);
	}

	
	
	// getTax 오버라이드
	// 매니저의 속성에 적합하게 세금액(봉급과 보너스 총액의 10%)을 리턴
	@Override
	public int getTax() {
		int num = ((bonus+getSalary())/10);
		
		return num;
	}
	
	
	
}
