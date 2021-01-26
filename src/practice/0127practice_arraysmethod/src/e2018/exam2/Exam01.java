
package e2018.exam2;

public class Exam01 {

	public static double average(int... a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return (double) sum /a.length ;
	}

	
	
	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5 };

		System.out.println(average(2, 3));
		System.out.println(average(2, 3, 4));
		System.out.println(average(a));
	}
}
