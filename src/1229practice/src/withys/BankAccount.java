package withys;

public class BankAccount {
	
	//잔액
	private int balance;

	//잔액조회
	public int getBalance() {
		return balance;
	}

	//입금
	public void deposit(int num) {
		balance+=num;
	}
	
	public BankAccount(int balance) {
		super();
		this.balance = balance;
	}

	//출금
	public void withdraw(int num) {
		if (num > balance ) {
			System.out.println("잔액이 적습니다");

		}else {
			balance-=num;
		}
			
	}
}
