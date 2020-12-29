import java.util.Arrays;
import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오 배열 정하기용");
		int num = sc.nextInt();
		
		//배열정리
		int[] array = new int[num];
		
		//배열 입력
		for (int i = 0; i < array.length; i++) {
			System.out.println("정수를 입력하시오");
		array[i]=sc.nextInt();
		}
		
		//배열출력
		System.out.print(Arrays.toString(array));

	}
}
