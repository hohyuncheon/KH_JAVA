import java.util.Calendar;

public class Test3 {

	public static void main(String[] args) {

		// 태어난 날부터 지금까지 밀리초로 계산

		// 내생일
		Calendar ca1 = Calendar.getInstance();
		ca1.set(1994, 03, 26);

		// 현재
		Calendar ca2 = Calendar.getInstance();

		long count = ca2.getTimeInMillis();

		long mills = ca2.getTimeInMillis() - ca1.getTimeInMillis();

		System.out.println("태어난 날부터 밀리초" + mills);
		System.out.println("내 나이 " + (double) mills / 1000 / 60 / 60 / 24 / 365);

	}
}
