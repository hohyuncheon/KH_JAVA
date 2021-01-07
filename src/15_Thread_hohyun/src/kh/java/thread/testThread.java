package kh.java.thread;

/**
 *  3의 배수출력 쓰레드와
 *  4의 배수출력 쓰레드를 생성하고 실행하세요
 *  [Thread 이름 - 배수]
 *  실행간격은  200밀리초.
 *  100초과시 중지할 것.
 */
public class testThread implements Runnable {

	private int num;
	private long millis; // 밀리초

	public testThread(int num, long millis) {
		this.num = num;
		this.millis = millis;
	}

	@Override
	public void run() {
		for (int i = 1; i < 100; i++) {
			
			int sum = num*i;
			if(sum >= 100) break;
			else

			System.out.println(num+"의 배수 쓰레드 : "+num*i);
			
			try {
				// 현재 쓰레드를 TIMED - WAITING 상태로 변경
				// 그냥찍지말고 쉬었다가 지어라 mills설정해준 초만큼
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		// 쓰레드명
		System.out.println(Thread.currentThread().getName()+"끝");
	}
}