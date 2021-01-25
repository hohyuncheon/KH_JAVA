package self;

public class Test {
	public static void main(String[] args) {
		
		
		int num = 100;
		String num2= num+"";//스트링으로 인트를 바꿈
		System.out.println((num2+(20+20)));//100이라는 문자에 숫자 20더함
		
		StringBuffer Buffer = new StringBuffer("whatthezzzzzzzzzdsad");//16문자
	
		System.out.println(Buffer);
		
		StringBuffer Buffer2 = new StringBuffer(10);//1문자
		System.out.println(Buffer2);
	}
}
