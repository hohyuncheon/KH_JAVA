package e2018.exam2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Exam05 {

    static void removeEvenNumbers(Collection<Integer> c) {
    	
    	Iterator<Integer> it = c.iterator();
    	while(it.hasNext()) {
    		int a = it.next();
    		if(a%2==0) {
    			it.remove();
    		}
    	}
    }

    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < 10; ++i)
            c.add(i);
        removeEvenNumbers(c);
        System.out.println(c.toString());
    }
}