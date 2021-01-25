import java.util.Scanner;

public class Test6 {

	
	public static void main(String[] args) {
		Test6 t = new Test6();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 쓰시오");
		int num =sc.nextInt();
		
		//배열생성
		int [] array = new int[num];
		
		//입력문
		System.out.println("정수를 입력하시오 더하고싶은");
		for (int i = 0; i < array.length; i++) {
		array[i] = sc.nextInt();
		}
		
		//출력문
		System.out.println(t.rereturn(array));
		

	}
	//메소드 합을구하는
	public int rereturn(int[] array) {
		
		int sum =0;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			
		}return sum;
	}
		
}
