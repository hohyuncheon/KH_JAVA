package self;

public class Myclass implements RemoteControl {
		
		boolean onOFF=false;
		
		public void turnon() {
			onOFF=true;
			System.out.println("티비를 켰습니다");
			
		}

		public void turndown() {
			onOFF=false;
			System.out.println("티비를 껐습니다");
		}

}




	