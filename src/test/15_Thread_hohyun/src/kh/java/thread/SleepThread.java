package kh.java.thread;

public class SleepThread implements Runnable {

	private char ch;
	private long millis;	//밀리초
	
	public SleepThread(char ch, long millis) {
		this.ch = ch;
		this.millis = millis;
	}
	
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(ch);
			
			try {
				//현재 쓰레드를 TIMED - WAITING 상태로 변경
				//그냥찍지말고 쉬었다가 지어라 mills설정해준 초만큼
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		//쓰레드명
		System.out.print(Thread.currentThread().getName() + " 끝! ");
	}

	}
