package ncs.test6;

public class Calculator {

	int data;// 스캐너로 받아올 정수

	public double getSum(int data) throws InvalidException {
		if (data < 2 || data > 5) {
			System.out.println("2~5사이의 정수를 입력해주세요");
			throw new InvalidException(null);
		}
			int sum = 0;//합계구하기용
			
			for (int i = 1; i <= data; i++) {
				sum+=i;
			}
			return sum;
	}
}