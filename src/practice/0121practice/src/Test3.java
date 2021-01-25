import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("가", 1);
		map.put("나", 2);
		map.put("다", 3);
		
		//5
		Properties pr = new Properties();
		pr.setProperty("ㄱ", "ㄴ");
		pr.setProperty("e", "f");
		pr.setProperty("f", "ㄴ");
		Enumeration<?> en = pr.propertyNames();
		while(en.hasMoreElements()) {
			String aa = (String) en.nextElement();
			String bb = pr.getProperty(aa);
			
			System.out.println(aa+bb);
		}
		
		
		//4
		Set<Entry<String, Integer>> sett = map.entrySet();
		Iterator<Entry<String, Integer>> ittt = sett.iterator();
		
		while(ittt.hasNext()) {
			Entry<String, Integer> enn = ittt.next();
			String aaa = enn.getKey();
			int bbb = enn.getValue();
			System.out.println(aaa+bbb+aaa);
			
		}
		
		
		//3
		Set<Entry<String, Integer>> se3 = map.entrySet();
		for (Entry<String, Integer> entry : se3) {
			String aa = entry.getKey();
			int bb = entry.getValue();
			System.out.println(aa+bb);
		}
		
		//2
		Set<String> se2 = map.keySet();
		Iterator<String> it = se2.iterator();
		while(it.hasNext()) {
			String a = it.next();
			int b = map.get(a);
			System.out.println(a+b);
		}
		
		
		//1
		Set<String> se = map.keySet();
		for (String st : se) {
			Integer i = map.get(st);
			System.out.println(st+i);
		}
	}
}
