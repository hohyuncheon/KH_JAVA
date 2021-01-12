package test4;

import test3.BankAccount;
import test3.MinusAccount;
import test3.NormalAccount;

public class AccountTest {

	public static void main(String[] args) {

		BankAccount[] bk = new BankAccount[4];
		bk[0] = new NormalAccount(11, 1000);
		bk[1] = new NormalAccount(22);
		bk[2] = new MinusAccount(33, 1000, 500);
		bk[3] = new MinusAccount(44, 500);
		
		System.out.println("최대 출금 가능액");
		for (int j = 0; j < bk.length; j++) {
			if(bk[j] instanceof NormalAccount) {
				System.out.println(bk[j].getBalance());
			}else if (bk[j] instanceof MinusAccount) {
				System.out.println(bk[j].getBalance() + ((MinusAccount)bk[j]).getHando());
			}
		}
		
		
		System.out.println("출금액은 500원");
		for (int i = 0; i < bk.length; i++) {
			bk[i].withdraw(500);
		}
		
		
		System.out.println("입금액은 100원");
		for (int i = 0; i < bk.length; i++) {
			bk[i].deposit(100);
		}
		
		
		System.out.println("최대 출금 가능액");
		for (int j = 0; j < bk.length; j++) {
			if(bk[j] instanceof NormalAccount) {
				System.out.println(bk[j].getBalance());
			}else if (bk[j] instanceof MinusAccount) {
				System.out.println(bk[j].getBalance() + ((MinusAccount)bk[j]).getHando());
			}
		}
	}
	
	

}
