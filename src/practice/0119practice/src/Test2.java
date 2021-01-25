
public class Test2 {
    public static void main(String[] args) {
        Test2 t = new Test2();
        
        t.test5();
        try {
			t.test6();
		} catch (HohyunException e1) {
			e1.printStackTrace();
		}            
    }
    
    //throw로 해서 throws로 던져서 처리하기
    private void test6() throws HohyunException{
    	throw new HohyunException();
    }
    
    //throw로 try catch로 처리하기
    private void test5(){
    	try {
			throw new HohyunException();
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("test5 에러발생");
		}
    }
    
    private void test4() throws Exception{
        throw new Exception();
    }

    private void test3() {
        try {
            throw new Exception();            
        } catch (Exception e) {
            System.out.println("어쩌구 에러 발생!");
        }
    }

    private void test2() throws ArithmeticException{
        int a=10;
        int b=0;
        System.out.println(a/b);
    }

    private void test1() {
        
        int a=10;
        int b=0;
        
        try {
            System.out.println(a/b); //Unchecked Exception 발생 
        } catch (Exception e) {
            System.out.println("에러발생!");
        }finally {
            System.out.println("Finally 블럭 작동!");
        }
        System.out.println("test1 메서드 끝!");
    }
}