package withys;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를입력하시오");
		int s = sc.nextInt();
		
		
		int [] arr = new int[s] ;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("더해지고싶은 정수입력");
			arr[i]=sc.nextInt();
			
		}
		// arraystostring
		
		
		int [] sample = new int[3];
		
		//배열값
		sample[0]= 1;
		sample[1]= 3;
		sample[2]= 6;
		
		//출력문
		for(int new1 : sample) {
			System.out.print(new1);
		}
		
		
		//출력문 
		for(int each : arr) {
			
			System.out.print(each);
		}
		
		
//		System.out.println(Arrays.toString(arr));
//		System.out.println("====================");
//		
//		System.out.print("배열 : ");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//		}
//		
//		
//		System.out.print("배열 : ");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//		}
//
	}

}
