package kh.java.thread.synchronization;

public class Atm extends Thread {

	private Account acc;

	public Atm(Account acc) {
		this.acc = acc;
	}

	@Override
	public void run() {
		while(acc.getBalance() > 0) {
			int money = (int)(Math.random()* 3 + 1) *100;
			acc.withdraw(money); //100원 200원 300원 중 출금
			
			try {
			//1.5초에 한번씩 출금해라
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//쓰레드의 이름 출력 후 종료라는 출력문
		System.out.println(Thread.currentThread().getName() + "종료!!");
	}
	
	
}