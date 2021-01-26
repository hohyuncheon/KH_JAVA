package e2018.exam2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
//새 ArrayList 객체를 생성하여 리턴하라.
//리턴되는 객체에는, c1과 c2에 모두 들어있는 값만 들어있어야 한다.
//c1, c2는 변경되지 말아야 한다.
//addAll, removeall, retailAll 메소드를 사용해서 구현하라.
//[a, b, c, d]
//[b, d, e, f]
//[b, d]

public class Exam07 {

    static Collection<String> intersection(Collection<String> c1, Collection<String> c2) {
		
    	List<String>li = new ArrayList<String>();
    	li.addAll(c1);
    	li.retainAll(c2);
		return li;
 
    }

    public static void main(String[] args) {
        Collection<String> c1 = Arrays.asList("a", "b", "c", "d");
        Collection<String> c2 = Arrays.asList("b", "d", "e", "f");
        Collection<String> c3 = intersection(c1, c2);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}