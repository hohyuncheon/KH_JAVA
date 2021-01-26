package snippet;

public class Snippet {
	
	public static void main(String[] args) {
		new Snippet().test1();
	}
	
	public void test1() {
		int a = 10;
		int b = ++a;
		int c = 4;
		int d = c++ + 2;
		
		a = 11;
		b = 11;
		c = 5;
		d = 6;
		
		// 1번 문제
		System.out.println((a + (c * d)) - c % d);//36
		
		// 2번 문제
		System.out.println((boolean) (a != b));//false
		
//		a = 10;
//		b = 11;
//		c = 21;
//		d = 141;
		
		// 3번 문제
		c = 20;
		d = c++ + a-- * b;
		System.out.println("결과 = " + (c + a) + ", " + (d - 10));
		System.out.println("결과 = " + (31) + ", " + (131));
	}

}
