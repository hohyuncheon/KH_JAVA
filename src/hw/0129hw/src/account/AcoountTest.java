package account;

public class AcoountTest {

	public static void main(String[] args) {
		Account account;
		account = new Account("441-0290-1203", 500000,7.3);
	
		System.out.print(account.getAccount());
		System.out.print(" 현재잔액 : "+account.getBalacne());
		
		System.out.println();
		System.out.println("2000원 입금");
		account.deposit(2000);
		
		System.out.print(account.getAccount());
		System.out.println(" 현재잔액 : "+account.getBalacne());
		System.out.printf("이자 : %.1f",account.calculateInterest());//이자율
		
		
	}

}
