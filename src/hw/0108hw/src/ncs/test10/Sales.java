package ncs.test10;

public class Sales extends Employee implements Bonus {

	public Sales() {
		super();
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public void incentive(int pay) {
		int num = (int) (getSalary()*0.10);
		setSalary(num);
	}
	
	public double tax() {
		return getSalary()*0.13;
	}

}
