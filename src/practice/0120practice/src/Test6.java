import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Test6 {

	public static void main(String[] args) {

		// 키 중복불가 벨류허용
		Map<String, Integer> ma = new HashMap<>();
		ma.put("햄버거", 3);
		ma.put("피자", 2);
		ma.put("라면", 3);

		// 프로퍼티스
		Properties pr = new Properties();

		pr.setProperty("ㄱr", "ㄴㄴ");
		pr.setProperty("ㄴr", "ㄴㄴ");
		pr.setProperty("ㄷr", "ㄴㄷㄴ");

		Enumeration<?> enu = pr.propertyNames();
		while (enu.hasMoreElements()) {
			String aa = (String) enu.nextElement();
			String bb = pr.getProperty(aa);

			System.out.println("프로퍼티스" + aa + bb);
		}

		// 4. 포이치 entryset
		Set<Entry<String, Integer>> en2 = ma.entrySet();

		for (Entry<String, Integer> ex : en2) {
			String aaa = ex.getKey();
			int bbb = ex.getValue();

			System.out.println("엔트리셋 " + aaa + bbb);
		}

		// 3. 이터레이터 entryset

		Set<Entry<String, Integer>> en = ma.entrySet();

		Iterator<Entry<String, Integer>> itt = en.iterator();

		while (itt.hasNext()) {
			Entry<String, Integer> a = itt.next();
			String st = a.getKey();
			int in = a.getValue();
			System.out.println("이터레이터 entry" + st + in);
		}

		// 2. 이터레이터 key set

		Set<String> st2 = ma.keySet();
		Iterator<String> it = st2.iterator();

		while (it.hasNext()) {
			String a = it.next();
			int b = ma.get(a);

			System.out.println("이터레이터" + a + b);
		}

		// 1. foreach 출력 key set
		Set<String> st1 = ma.keySet();
		for (String ss : st1) {
			int i = ma.get(ss);
			System.out.println("foreach" + i + ss);

		}

	}

}
