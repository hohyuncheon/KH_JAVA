
public class BankAccount {
	
	private int account;//계좌번호
	private String name; //예금주명
	private int balance = 0;;//잔액
	
	public BankAccount() {
		super();
	}
	
	public BankAccount(int account, String name, int balance) {
		super();
		this.account = account;
		this.name = name;
		this.balance = balance;
	}
	
	public BankAccount(int account, String name) {
		super();
		this.account = account;
		this.name = name;
	}

	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	
	//입금
	public void in(int money) {
		balance+=money;
	}
	
	//출금
	public void out(int money) {
		if(balance<money) {
			System.out.println("잔액이 부족해 출금 실패하였습니다");
			System.out.println();
			return;
		}
		balance-=money;
		System.out.println(name +"의 현재 잔액은 " + balance+"원 입니다");
		System.out.println();
	}
	
	//송금
	public void toss(BankAccount bk, int tossmoney) {
		
		if(tossmoney>balance) {
			System.out.println("잔액이 부족해 송금 실패하였습니다");
			System.out.println();
		}
		//송금금액만큼 차감한다.
		this.balance-=tossmoney;
		System.out.println(bk.name+"에게"+tossmoney + "원을 송금하였습니다");
		
		
		//송금 금액을 송금한다.
		bk.balance+=tossmoney;
		System.out.println(bk.name+"의 잔액은 "+bk.balance+"원 입니다");
		System.out.println();
	}
	
	
	@Override
	public String toString() {
		return "계좌번호" + account + " 예금주명 " + name + " 잔액 : " +balance;
	}
	
	

}
