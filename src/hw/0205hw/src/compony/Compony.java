package compony;

public class Compony {
	private double salary;
	private double annualIncome;//연봉
	private double afterTaxIncome;//세후금액
	private double bonus;//보너스
	private double afterTaxBonus;//세금공제금액
	
	
	
	public Compony() {
		super();
	}

	public Compony(double salary) {
		super();
		this.salary = salary;
	}

	
	//연 기본급의 합을 계산하여 리턴
	public double getIncome() {
		this.annualIncome = salary*12;
		return annualIncome;
	}
	public double xxx() {
		return this.annualIncome;
	}

//	
//	//연 기본급의 합에서 세금을 공제한 금액을 리턴 //기본급은 10% 공제
//	public double getAfterTaxIncome() {
//		this.afterTaxIncome= annualIncome-(annualIncome*0.1);
//		return afterTaxIncome;
//	}
//
//
	//연 보너스의 합을 계산하여 리턴 //보너스는 5.5% 공제
	public double getBonus() {
		bonus = (this.salary*4)/0.2;
		return bonus;
	}
//
//
//	//연 보너스의 합에서 세금을 공제한 금액을 리턴
//	public double getAfterTaxBonus() {
//		afterTaxBonus = bonus + afterTaxIncome;
//		return afterTaxBonus;
//	}
//	
////	
////	//set
////	
////	public void setSalary(double salary) {
////		this.salary = salary;
////	}
//	
	public void print() {
		System.out.println("연 기본급"+this.salary +"세후"+annualIncome+getIncome());
//		System.out.println("연 보너스 합:" +afterTaxBonus);

	}




	
	
	
	
	

}
