package ncs.test10;

public class Secretary extends Employee implements Bonus {

	public Secretary() {
		super();
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public void incentive(int pay) {//pay에 100
		int num = (int) (getSalary()*1.2);
		setSalary(num);
	}
	
	public double tax() {
		return getSalary()*0.1;
	}

}
