package test4;

public class NormalAccount extends BankAccount{

	public NormalAccount(int id, int balance) {
		super(id, balance);
	}
	
	public NormalAccount(int id) {
		super(id);
	}
	@Override
	public void withdraw(int amount) { // 출금
		if(getBalance()<amount) {
			System.out.println("잔액이 부족합니다.");
		}
		super.withdraw(amount);
	}
	

}
