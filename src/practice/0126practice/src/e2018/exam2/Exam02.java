package e2018.exam2;

import java.util.Arrays;

public class Exam02 {

	public static void main(String[] args) {
		//두개의 객체 생성됨.
		Person[] a = new Person[] { new Person("홍길동", 18), new Person("임꺽정", 21) };
		
		System.out.println(toString(a));
	}
	
    static String toString(Person[] a) {
    	
    	return Arrays.toString(a);
    }
    
}