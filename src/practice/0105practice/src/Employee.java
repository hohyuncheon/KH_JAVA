
public class Employee {
	
	private int salary;//봉금

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(int salary) {
		super();
		this.salary = salary;
	}

	public Employee() {
		super();
	}
	
	
	//getTax - 세금액(봉급의 10%)을 리턴
    //봉급을 매개변수로 받아 초기화 하는 생성자
	
	//세금액
	public int getTax() {
		
		return salary/10;
	}
	
	
	

}
