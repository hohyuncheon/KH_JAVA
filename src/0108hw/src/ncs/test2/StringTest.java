package ncs.test2;

public class StringTest {

	public static void main(String[] args) {

		String str = "1.22,4.12,5.93,8.71,9.34";
		double data[] = new double[5];
		double sum = 0;
		// str에서 데이터를 분리한다.

		String[] st = str.split(",");

		// for(){ //for~each 문 사용한다.
		// 배열에 실수 데이터를 넣는다.
		// 배열 데이터의 합을 구한다.
		for (int i = 0; i < st.length; i++) {
			sum += Double.parseDouble(st[i]);
		}

		// 결과 값을 출력 한다.
		System.out.printf("sum = %.3f", sum);
		System.out.println();
		System.out.printf("avereage + %.3f", sum/st.length);
		
	}
}
