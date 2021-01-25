import java.util.Scanner;
//못푼 문제
public class Test1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("나이 하한 입력 : ");
		int min = sc.nextInt();
		System.out.print("나이 상한 입력 : ");
		int max = sc.nextInt();
		System.out.print("학생 수 입력 : ");
		int num = sc.nextInt();
		int length = max - min + 1;

		int[] countArr = new int[length];

		for (int i = 0; i < num; i++) {
			System.out.print("나이 입력 : ");
			int input = sc.nextInt();
			if (input >= min && input <= max)
				countArr[input - min]++;
			else {
				System.out.println("범위를 벗어났습니다. 다시 입력하세요.");
				i--;
			}
		}
		System.out.println("나이      학생수");
		for (int i = 0; i < length; i++) {

			System.out.println((min + i) + "   " + countArr[i]);
		}
	}
}

//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("하한나이를 입력하시오");
//		int num1 = sc.nextInt();
//		System.out.println("상한나이를 입력하시오");
//		int num2 = sc.nextInt();
//
//		System.out.println("몇번 입력하실건가요");
//		int num3 = sc.nextInt();
//
//		int count=0;
//		// 배열생성 10 8 10 9 8
//		int[] arr = new int[num2-num1+1];
//		
//		// 배열대입
//		for (int i = 0; i < arr.length; i++) {
//			arr[0] = num1+ i;
//		}
//		
//		//arr[0] = 8;
//		//arr[1] = 9;
//		//arr[2] = 10;
//		
//		// 받은 숫자만큼 값 입력 
//		for (int i = 0; i < num3; i++) {
//			System.out.println("해당하는 숫자는?");
//			int num4 = sc.nextInt();//입력하는숫자
//			for (int j = 0; j < arr.length; j++) {
//				if(num4==arr[j]) {
//					System.out.println("같습니다");
//					count++;
//					System.out.println(num4+"="+count+"개");
//				}else {
//					System.out.println("범위를 벗어났습니다.");
//				}
//				
//			}
//			
//		}
//
//	}
//
//}
