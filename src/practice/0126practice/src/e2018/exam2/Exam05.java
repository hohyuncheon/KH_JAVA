package e2018.exam2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Exam05 {

	static void removeEvenNumbers(Collection<Integer> c) {

		Iterator<Integer> iterator = c.iterator();
		while (iterator.hasNext()) {
			int value = iterator.next();
			if (value % 2 == 0)
				iterator.remove();
		}

//    	List<Integer> li = new ArrayList<>(c);
//    	Iterator<Integer> it = li.iterator();
//    	while(it.hasNext()) {
//    		int num = it.next();
//    		if(num%2==0) {
//    			continue;
//    		}
//       		if(num%2==1) {
//    			System.out.print(num + " ");
//    		}
//    	}

	}

	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>();
		for (int i = 0; i < 10; ++i)
			c.add(i);
		removeEvenNumbers(c);
		System.out.println(c.toString());
	}
}