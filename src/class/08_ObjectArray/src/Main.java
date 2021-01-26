
public class Main {

	public static void main(String[] args) {
//		test("abc");
		test(null);
//		test("");
	}

	public static void test(String str) {
		System.out.println(str == null);
//		System.out.println(str.length() == 0);
		
		// || 좌항이 true면 우항은 검사안한다.(효율적)
		// |  좌항, 우항 모두 검사(비효율적)
		if (str == null || str.length() == 0) {
			System.out.println("String is empty");
		} else {
			System.out.println("String is not empty");
		}
	}

}
