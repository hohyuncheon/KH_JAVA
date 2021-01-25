import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test5 {

	public static void main(String[] args) {
		// 중복 허용, 순서 유지
		List<Integer> li = new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(1);
		
		System.out.println(li);

		
		// 중복 허용, 순서 유지
		Set<Integer> se = new HashSet<Integer>();
		se.add(1);
		se.add(2);
		se.add(3);
		se.add(1);
		
		System.out.println(se);
		
		Iterator<Integer> it = se.iterator();
		
		while(it.hasNext()) {
			int num= it.next();
			System.out.println(num);
		}
		
		//키 중복불가 벨류허용
		Map<String, Integer> ma = new HashMap<>();
		ma.put("햄버거", 3);
		ma.put("피자", 2);
		ma.put("라면", 3);
		
		
		
		Set<String> st2 = ma.keySet();
		
		for(String s : st2) {
			int abb =ma.get(s);
			System.out.println("for"+s+abb);
		}
		
		
		
		
		
		
		
		Set<String> st = ma.keySet();
		
		Iterator<String> ittt =st.iterator();
		while(ittt.hasNext()) {
			String fdsa = ittt.next();
			int dvcxz = ma.get(fdsa);
			
			System.out.println(fdsa + dvcxz+"뉴");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		Properties prrr = new Properties();
		
		prrr.setProperty("ㄴ", "ㅎ");
		prrr.setProperty("ㄹ", "ㅋ");
		prrr.setProperty("ㅗ", "ㅍ");
		
		Enumeration<?> enn = prrr.propertyNames();
		while(enn.hasMoreElements()) {
			String aa = (String) enn.nextElement();
			String bb = prrr.getProperty(aa);
			System.out.println(aa+bb);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Properties prr = new Properties();
//		prr.setProperty("ㅂ", "ㅂㅂ");
//		prr.setProperty("ㅂ", "ㅂㅂ");
//		prr.setProperty("ㄴ", "ㄴㄴ");
//		
//		Enumeration<?> en = prr.propertyNames();
//		
//		while(en.hasMoreElements()) {
//			String aaa = (String) en.nextElement();
//			String bbb = prr.getProperty(aaa);
//			
//			System.out.println(aaa+bbb);
//			
//		}
		
		
		
		
		
		
		
//		Properties pr = new Properties();
//		pr.setProperty("ㄱ", "ㄴ");
//		pr.setProperty("ㄷ", "ㄹ");
//		pr.setProperty("ㅁ", "ㅂ");
//		
//		Enumeration<?> e = pr.propertyNames();
//
//		while(e.hasMoreElements()) {
//			String aa = (String) e.nextElement();
//			String bb = pr.getProperty(aa);
//			
//			System.out.println(aa+bb);
//			
//		}
//		
		
		
		
//		Properties prop = new Properties();
//		prop.setProperty("a", "b");
//		prop.setProperty("c", "d");
//		prop.setProperty("e", "f");
//		
//		Enumeration<?> en = prop.propertyNames();
//		
//		while(en.hasMoreElements()) {
//			String name = (String) en.nextElement();
//			String value = prop.getProperty(name);
//			
//			System.out.println(name+" = "+value);
//		}
		
		
		
//		Set<Entry<String, Integer>> seee = ma.entrySet();
//		Iterator<Entry<String, Integer>> ittttt = seee.iterator();
//		
//		while(ittttt.hasNext()) {
//			Entry<String, Integer> et = ittttt.next();
//			String ring = et.getKey();
//			int number = et.getValue();
//			
//			System.out.println(ring+number);
//			
//			
//		}
//		Set<Entry<String, Integer>> ent = ma.entrySet();
//		for (Entry<String, Integer> entt : ent) {
//			
//			String stu = entt.getKey();
//			int numm = entt.getValue();
//			
//			System.out.println(stu+numm);
//		}
		
//		Set<Entry<String, Integer>> Entry = ma.entrySet();
//		
//		for (Entry<String, Integer> et : Entry) {
//			
//			String stz = et.getKey();
//			int numm = et.getValue();
//			
//			System.out.println(stz+numm);
//			
//		}
		
		
//		Set<String> stt = ma.keySet();
//		for(String st : stt) {
//			int num55 = ma.get(st);
//			System.out.println(st+num55);
//			
//			
//		}
		
		
//		Set<String> foeac = ma.keySet();
//		for (String key: foeac) {
//			int in = ma.get(key);
//			System.out.println(key+in);
//			
//		}
		
//		Set<String> set = ma.keySet();
//		Iterator<String> ittt = set.iterator();
//		while(ittt.hasNext()) {
//			String str = ittt.next();
//			int num4 = ma.get(str);
//			System.out.println(str+num4);
//		}
		
		
		
		
		
		
		
		
		
		

		
		
//		Set<String>s = ma.keySet();
//		Iterator<String> itt = s.iterator();
//		while (itt.hasNext()) {
//			String g = itt.next();
//			int num3 = ma.get(g);
//			System.out.println(g+num3);
//			
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Set<String> aaa = ma.keySet();
//		Iterator<String> tt = aaa.iterator();
//		while (tt.hasNext()) {
//			String key = tt.next();
//			int num2 =ma.get(key);
//			System.out.println(key + num2);
			
			
//		}
		
		
		
		
	}

}
