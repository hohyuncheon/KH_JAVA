package kh.java.inner.class_;

/*
 * 내부클래스
 * 1.static 내부클래스
 * 2.non-static 내부클래스
 * 3.지역 내부클래스
 * 
 * 목적
 * - 외부클래스안에서만 사용할때.
 * - 외부클래스의 자원(private 자원에도 가능)에 쉽게 접근하기 위해.
 */

public class OuterClass {
	
	private int num=100;
	private static int snum=99;
	
	public OuterClass() {
		new A().aaa();
		
		//non-static에서는 static 자원에 접근이가능하다
		new B().bbb();
//		new C().ccc();//x안된다.
		test();
	}
	
	//non-static 내부클래스
	public class A{
		public void aaa() {
			System.out.println(num);
			System.out.println(snum);
			
		}
	}
	//static 내부클래스
	public static class B{
		public void bbb() {
//			System.out.println(num);//필드가 논스태틱이라 불가
			System.out.println(snum);
			
		}
	}
	
	// 지역내부클래스 - 이름을 만들고 생성해줘야함?
	//지역변수와 마찬가지로 접근 제한자를 가질 수 없다.
	public void test() {
		class C{
			public void ccc() {
				System.out.println(num);
				System.out.println(snum);
			}
		}
		C c = new C();
		c.ccc();
	}

	//내부클래스 같은 클래스 내에서 실행방법.
	public static void main(String[] args) {
		new OuterClass();//생성자를 호출함 생성자 속에 실행 넣어둠.
	}
}
