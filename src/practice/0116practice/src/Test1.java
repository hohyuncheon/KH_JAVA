import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();

		for (;;) {
			Random rnd = new Random();
			int num = rnd.nextInt(45) + 1;
			set.add(num);

			if (set.size() == 6) {
				break;
			}
		}
		System.out.println(set);

		for (Integer se : set) {
			System.out.print(se + " ");
		}

		System.out.println();

		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			int num1 = it.next();
			System.out.println("이터레이터" + num1);
//			System.out.println("이터레이터" + it.next());
//			it.remove();
		}

		System.out.println(set);
	}
}
