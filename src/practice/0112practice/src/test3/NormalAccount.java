package test3;

public class NormalAccount extends BankAccount {

	public NormalAccount(int id, int balance) {
		super(id, balance);
	}

	public NormalAccount(int id) {
		super(id);
	}

	// 출금 메소드 오버라이드 - 잔액부족시 출금 수행하지 않고 오류메시지 출력
	@Override
	public void withdraw(int amount) {
		if (amount > getBalance()) {
			System.out.println("잔액이 부족합니다");
		}
		else {
			super.withdraw(amount);
		}
	}
}
