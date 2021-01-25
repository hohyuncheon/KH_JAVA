package test3;

public class AccountTest {

	public static void main(String[] args) {

		BankAccount[] bk = new BankAccount[4];
		bk[0] = new NormalAccount(11, 1000);
		bk[1] = new NormalAccount(22);
		bk[2] = new MinusAccount(33, 1000, 500);
		bk[3] = new MinusAccount(44, 500);

//(2) 4개 계좌의 최대 출금 가능액 각각 출력
		for (int i = 0; i < bk.length; i++) {
			if(bk[i] instanceof NormalAccount) {
			System.out.println("각계좌 최대 출금액 " +bk[i].getBalance());
		}else if(bk[i] instanceof MinusAccount) {
			System.out.println(bk[i].getBalance() + ((MinusAccount)bk[i]).getHando());
		}
		}
//(3) 사용자로부터 출금액 입력받아 4개 계좌에서 각각 출금 수행
		for (int i = 0; i < bk.length; i++) {
			bk[i].withdraw(500);
		}
//(4) 사용자로부터 입금액 입력받아 4개 계좌에 각각 입금 수행
		System.out.println();
		for (int i = 0; i < bk.length; i++) {
			bk[i].deposit(100);
		}
		
//(5) 4개 계좌의 최대 출금 가능액 각각 출력
		for (int i = 0; i < bk.length; i++) {
			if(bk[i] instanceof NormalAccount) {
			System.out.println("각계좌 최대 출금액 " +bk[i].getBalance());
		}else if(bk[i] instanceof MinusAccount) {
			System.out.println(bk[i].getBalance() + ((MinusAccount)bk[i]).getHando());
		}
		}
		
	}

}
