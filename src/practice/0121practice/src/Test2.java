
public class Test2 {

	public static void main(String[] args) {
		
		Test2 t = new Test2();
		t.test1();
		
		try {
			t.test2();
		} catch (Exception e) {
			System.out.println("메인에서발생");
		}
		

	}
	
	public void test2() throws HohyunException{
		throw new HohyunException();
		
	}

	public void test1() {
		
		try {
			throw new HohyunException();
		} catch (Exception e) {
			System.out.println("예외발생");
		}
	}
	
	
	
	public class HohyunException extends Exception {

		public HohyunException() {
			super();
			// TODO Auto-generated constructor stub
		}

		public HohyunException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
			super(message, cause, enableSuppression, writableStackTrace);
			// TODO Auto-generated constructor stub
		}

		public HohyunException(String message, Throwable cause) {
			super(message, cause);
			// TODO Auto-generated constructor stub
		}

		public HohyunException(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}

		public HohyunException(Throwable cause) {
			super(cause);
			// TODO Auto-generated constructor stub
		}
	}
}
