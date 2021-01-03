package withys;

public class BankTest {

	
//	- BankAccountTest 클래스 - main 메소드에서 다음을 수행
//	   (1) 은행계좌 객체를 하나 생성
//	   (2) 계좌에 2000원을 입금 -- deposit() 호출
//	   (3) 계좌에 3000원을 입금 -- deposit() 호출
//	   (4) 계좌를 잔액조회(getBalance() 호출)하여 잔액을 알아내어 출력 
//	   (5) 계좌에서 1000원을 출금 
//	   (6) 계좌를 잔액조회하여 잔액을 알아내어 출력 
//	   (7) 계좌에서 10000원을 출금
//	   (8) 계좌를 잔액조회
	
	
	public static void main(String[] args) {
		Bank b = new Bank(0);
		//2000원 입금
		b.deposit(2000);
		//3000원 입금
		b.deposit(3000);
		//출력
		System.out.println(b.getBalance());//5000
		
		//1000원 출금
		b.withdraw(1000);
		//출력
		System.out.println(b.getBalance());//4000원
		
		//100000출력
		b.withdraw(10000);
		System.out.println(b.getBalance());
		
	}

}
