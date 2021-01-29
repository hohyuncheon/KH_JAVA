package account;


//고정 금리의 계좌를 생성 하여 현재 잔액을 기준으로 이자를 계산하는 프로그램을 작성 한다.
//사용 데이터
//Account(계좌번호): 441-0290-1203, balance(잔액): 500000원, interestRate(이율): 7.3%

public class Account {
	
	private String account="";
	private int balacne=0;
	private double interestRate=0;
	
	public Account() {
		super();
	}
	public Account(String account, int balacne, double interestRate) {
		super();
		this.account = account;
		this.balacne = balacne;
		this.interestRate = interestRate;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalacne() {
		return balacne;
	}
	//이자계산 잔액*이율
	public double calculateInterest() {
		return balacne*(interestRate/100);
		
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	//입금
	public int deposit(int money) {
		balacne+=money;
		return balacne;
		
	}

	//출금
	public int withdraw(int money) {
		if (balacne<money) {
			System.out.println("잔액이 부족합니다.");
		}
		else {
		balacne-=money;
		}
		return balacne;
	}
	//- 출력예: 계좌번호: 221-0101-2111 잔액: 100000원 이자율: 4.5%
	public void accountInfo() {
		
		System.out.printf("계좌번호 : %s 잔액 : %s 이자율 : %.1f %%" ,this.account ,this.balacne,this.interestRate);
	}
	

}
