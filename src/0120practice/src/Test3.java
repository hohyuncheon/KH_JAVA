
public class Test3 {

//	customException- CheckedException으로 만듦
	
//	test1
//	CustomException 발생시킨후 try~catch
	
//	test2
//	CustomException 발생시킨후 main에서 처리
	
	public static void main(String[] args) {
		
		
		Test3 t = new Test3();
		t.test1();
		
		try {
			t.test2();
			
		} catch (Exception e) {
			System.out.println("메인에서 처리");
		}

	}
	
	public void test1() {
		
		try {
			throw new HohyunException();
		} catch (Exception e) {
			System.out.println("예외발생");
		}
		
	}
	
	public void test2() throws HohyunException{
		throw new HohyunException();
	}
	
	
	public class HohyunException extends Exception{

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
