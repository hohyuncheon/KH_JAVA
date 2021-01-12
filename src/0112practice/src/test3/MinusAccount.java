package test3;

public class MinusAccount extends BankAccount {

	private int hando;// 한도설정

	public MinusAccount(int id) {
		super(id);
	}

	public MinusAccount(int id, int balance, int hando) {
		super(id, balance);
		this.hando = hando;
	}

	public MinusAccount(int id, int hando) {
		super(id, hando);
	}

	// 출금 메소드 오버라이드 - 잔액부족시 출금 수행하지 않고 오류메시지 출력
	@Override
	public void withdraw(int amount) {
		if (hando > getBalance()) {
			System.out.println("잔액이 부족합니다");
			return;
		} else {
			super.withdraw(amount);
		}
	}

	public int getHando() {
		return this.hando;
	}

}
