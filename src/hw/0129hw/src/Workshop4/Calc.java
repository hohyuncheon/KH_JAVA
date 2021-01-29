package workshop4;

public class Calc {

	public int calculate(int intt) {

		int sum = 0;
		
		System.out.print("짝수 : ");
		for (int i = 1; i < intt; i++) {
			if(i%2==0) {
				sum += i;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		return sum;
	}
}
