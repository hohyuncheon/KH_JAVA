
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
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

		} catch (ArithmeticException a) {
			result = 0;
			System.out.println("ArithmeticException 나누기에 발생 0입력함");

		} catch (InputMismatchException i) {
			result = 1;
			System.out.println("잘못입력하였습니다. InputMismatchException 발생");
		}
		System.out.println("result = " + result);

	}
}