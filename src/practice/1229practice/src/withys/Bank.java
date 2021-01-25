package withys;

//- BankAccount 클래스 - 은행계좌를 나타내는 클래스

//필드 : 잔액(balance)
// 메소드 : 
//     기본생성자로 작업
//     입금(deposit) - 매개변수 있음, 리턴타입없음
//            출금(withdraw) - 매개변수 있음, 리턴타입 
//            잔액조회(getBalance) - 매개변수 없음, 리턴타입 int

public class Bank {

	private int balance;

	// 잔액
	public Bank(int balance) {
		this.balance = balance;
	}

	// 입금
	public void deposit(int balance) {
		this.balance += balance;
	}

	// 출금
	public void withdraw(int balance) {
		if (balance > this.balance) {
			System.out.println("잔액이 부족합니다");
		}else
		this.balance -= balance;
	}
	
	
	//잔액조회
	public int getBalance() {
		return balance;
	}

}
