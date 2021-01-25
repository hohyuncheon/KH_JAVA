package withys;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열 길이를 입력하시오");
		
		int num = sc.nextInt();
		
		//배열 할당
		int [] array = new int[num];
		
		
		//배열입력
		for (int i = 0; i < array.length; i++) {
			System.out.print("정수를 입력하시오");
			array[i]= sc.nextInt();
			
		}
		
		//배열출력
		System.out.print("배열 = ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		System.out.print("배열 = ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
