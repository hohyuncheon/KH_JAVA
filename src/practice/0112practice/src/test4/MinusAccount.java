package test4;

public class MinusAccount extends BankAccount{
	private int hando;

	public int getHando() {
		return hando;
	}

	public MinusAccount(int id, int balance) {
		super(id, balance);
	}

	public MinusAccount(int id, int balance, int hando) {
		super(id, balance);
		this.hando = hando;
	}
	

	@Override
	public void withdraw(int amount) { // 출금
		if(getBalance()<amount) {
			System.out.println("잔액이 부족합니다.");
		}
		super.withdraw(amount);
	}



	
}
