package e2018.exam2;

import java.util.Arrays;

public class Exam04 {

    static Person[] clone(Person[] a) {
		return Arrays.copyOf(a, a.length);
    }

    static boolean compareIdentity(Person[] a1, Person[] a2) {
    	
    	return a1==a2;

    }

    static boolean compareEquality(Person[] a1, Person[] a2) {
 
    	return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {
        Person[] a1 = new Person[] { new Person("홍길동", 18), new Person("임꺽정", 21) };
        Person[] a2 = clone(a1);

        System.out.println(compareIdentity(a1, a2));
        System.out.println(compareEquality(a1, a2));
    }
}