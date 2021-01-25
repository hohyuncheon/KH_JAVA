import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test5 {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList<String>();
		li.add("고구마피자");
		li.add("페퍼로니피자");
		li.add("치즈피자");
		li.add("치즈피자");
		
		System.out.println(li);
		
		Set<String> se = new HashSet<String>();
		se.add("고구마피자");
		se.add("페퍼로니피자");
		se.add("치즈피자");
		se.add("치즈피자");
		
		System.out.println(se);
		
		Iterator<String> it = li.iterator();
		
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		

		
		Map<String, String> ma = new HashMap<>();
		ma.put("햄버거", "3개");
		ma.put("피자", "1판");
		ma.put("치킨", "1마리");
		
//		ma.clear();//지우기
//		System.out.println(ma);
		
//		//map객채의 키셋을 불러와서 셋으로 정렬
//		Set<String> keySet = ma.keySet();
//		
//		for (String s : keySet) {
//			String Value = ma.get(s);//벨류값 출력할 수 있는 코드.
//			System.out.println("키  :"+s +"  벨류  :"+ Value);
//		}
		
//		Set<String> s = ma.keySet();
//		
//		for(String va : s) {
//			String value = ma.get(va);
//			System.out.println("셋값 : " +s +"  키값 : " + va + " 벨류값 : " + value);
//		}
		
		
//		Iterator<String> ii = keySet.iterator();
//		
//		while(ii.hasNext()) {
//			String sz = ii.next();
//			String value = ma.get(sz);
//			System.out.println(sz + value);
//		}
		
////		Set<String> keySet = ma.keySet();
//		Iterator<String > itt =keySet.iterator();
//		while(itt.hasNext()) {
//			String b = itt.next();
//			String value = ma.get(b);
//			System.out.println(b+value);
//			
//		}
		
		
		
		Set<String> sett = ma.keySet();
		
		Iterator<String> ittt = sett.iterator();
		
		while(ittt.hasNext()) {

			String sz = ittt.next();
			String value = ma.get(sz);
			System.out.println(sz+value);
			
		}
		
		
		
		
		
		
		

		
		
		
		
		
		
		

	}

}
