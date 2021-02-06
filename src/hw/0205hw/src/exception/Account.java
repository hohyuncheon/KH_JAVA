package exception;

public class Account {

	private String account; // 계좌번호
	private double balance; // 잔액
	private double interestRate; // 이율

	public Account() {
		super();
	}

	public Account(String account, double balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	// 현재잔액을 기준으로 이자를 계산
	public double calculateInterest() {
		double num= balance * (interestRate/100);
		return num;
	}

	// 입금
	public void deposit(double money) throws Exception{
		if(money<=0) {
			throw new Exception();
		}
		
		balance += money;
	}

	// 출금
	public void withdraw(double money) throws Exception{
		if (money<balance) {
			balance -= money;
		}else System.out.println("잔액이부족합니다.");
	}
	
	@Override
	public String toString() {
		return "계좌정보 : " + account + " 잔액 : " +  balance + " 이율 : "+ interestRate;
	}
	
	

}
