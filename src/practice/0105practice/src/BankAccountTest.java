import java.util.Scanner;

public class BankAccountTest {
	public static void main(String[] args) {
		
		BankAccount bk1 = new BankAccount(1, "kim" , 9000);
		BankAccount bk2 = new BankAccount(2, "lee");
		
		Scanner sc = new Scanner(System.in);
		
		//(1) 계좌번호 1, 예금주명 kim, 잔액 9000으로 초기화한 은행계좌 생성(account1 이라고 하자)
		System.out.println("lee에게 입금 금액은 ? ");
		bk2.in(sc.nextInt());
		//(2) 계좌번호 2, 예금주명 lee로 초기화한 은행계좌 생성(account2 라고 하자)
		System.out.println("lee에게 출금 금액은 ? ");
		bk2.out(sc.nextInt());
		//(3) 사용자로부터 입금액을 입력받아 account1에 입금
		System.out.println("kim에게 입금 금액은 ? ");
		bk1.in(sc.nextInt());
		//(4) 사용자로부터 출금액을 입력받아 account1에서 출금
		System.out.println("kim에게 출금 금액은 ? ");
		bk1.out(sc.nextInt());
		//(5) 사용자로부터 입금액을 입력받아 account2에 입금
		System.out.println("lee에게 입금할 금액은 ?");
		bk2.in(sc.nextInt());
	    //(6) 사용자로부터 출금액을 입력받아 account2에서 출금
		System.out.println("lee에게 출금할 금액은 ?");
		bk2.out(sc.nextInt());
		
		
		//(7) 사용자로부터 송금액을 입력받아 account2에게 account1로 송금하도록 지시
		System.out.println("lee에서 kim에게 송금할 금액은 ? ");
		bk2.toss(bk1, sc.nextInt());
		
		//(8) 사용자로부터 송금액을 입력받아 account2에게 account1로 송금하도록 지시
		System.out.println("kim에서 lee에게 송금할 금액은 ? ");
		bk1.toss(bk2, sc.nextInt());
		
		//(9) account2의 예금주명을 park으로 수정
		bk2.setName("park");
		//(10) account2의 계좌번호, 예금주명, 잔액 출력
		System.out.println(bk2.toString());
		//(11) account1의 계좌번호, 예금주명, 잔액 출력
		System.out.println(bk1.toString());
	}
}
