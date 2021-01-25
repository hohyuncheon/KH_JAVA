package withys;

public class BankAccountTest {
	public static void main(String[] args) {

			
		//객체생성
		BankAccount ba = new BankAccount(0);

		// 2000원 입금
		ba.deposit(2000);
		
		// 3000원 입금
		ba.deposit(3000);
		
		
		//출금할때
		ba.withdraw(9999);
		
		
		// 잔액출력
		System.out.println("잔액은 " + ba.getBalance()+"원 입니다");
	}

}
