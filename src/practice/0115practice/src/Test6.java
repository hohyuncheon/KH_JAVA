import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test6 {
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
	}
}
