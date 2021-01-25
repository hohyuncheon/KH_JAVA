import java.util.InputMismatchException;
import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {

		System.out.println("lab14_2: 홍길동");
		Scanner scan = new Scanner(System.in);

		int x, y, result;

		try {
			System.out.print("정수 x 입력: ");
			x = scan.nextInt();
			System.out.print("정수 y 입력: ");
			y = scan.nextInt();
			result = x / y;
			// (1) y에 0 입력시 result = 0
		} catch (ArithmeticException a) {
			result = 0;
			// (2) x나 y에 정수 아닌 값(예를 들어 aa) 입력시 result = 1
		} catch (InputMismatchException e) {
			result = 1;
		}
		System.out.println("result = " + result);
	}
}