package kh.java.inner.class_;

//외부클래스 밖에서 타 클래스의 내부클래스를 부르는 방법.

public class Main {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.A a = outer.new A();//멤버 내부클래스
		a.aaa();
		
		//스태틱 클래스 호출방법 클래스.메소드
		OuterClass.B b = new OuterClass.B();
		b.bbb();
		
		//지역내부 클래스 호출방법
		//외부에서 절대 접근할 수 없다. 메소드 호출뿐
		outer.test();//그래서 test지역메소드 가면 출력문을 만들어줬다.
	}
}
