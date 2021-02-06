package exception;

public class AccountTest {
	public static void main(String[] args) {
		Account ac = new Account("441-0290-1203", 500000.0, 7.3);
		System.out.println(ac.toString());
		
		// account 에 -10원 입금 – Exception 처리
		try {
			ac.deposit(10);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		try {
			ac.withdraw(999999);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.printf("이자 : %.1f",ac.calculateInterest());
	}

}
