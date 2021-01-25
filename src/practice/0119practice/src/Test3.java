import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test3 {

	
	public static void main(String[] args) {
		
		
		//중복 o 순서 o
		List<String> li = new ArrayList<>();
		
		li.add("천호현");
		li.add("천호현");
		li.add("천");
		li.add("호");
		li.add("현");
		li.add("천");
		
		System.out.println(li);
		
		//중복 x 순서 유지 x
		Set<String> se = new HashSet<>();
		
		se.add("천호현");
		se.add("천호현");
		se.add("천");
		se.add("호");
		se.add("현");
		se.add("천");
		
		System.out.println(se);
		
		//리스트를 셋으로 만드는 작업 (중복값 제거됨, 순서도 바뀜)
		Set<String> set = new HashSet<>(li);
		System.out.println(set);
		
		//셋을 리스트로 만드는 작업 (정렬기능을 활용하기위해서)
		List<String> list = new ArrayList<>(se);
		System.out.println(list);
		
		
		
		Iterator<String> it = se.iterator();
		
		while(it.hasNext()) {
			String a = it.next();
			System.out.println(a);
		}
		
		
		
	}
}
