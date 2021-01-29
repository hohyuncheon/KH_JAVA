package workshop4;
//다음 배열의 내용을 실행 결과와 같이 출력 되도록 프로그램을 작성 하시오.
//int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//출력은 아래와 같이 이루어 진다.
//100 90 80 70 60 50 40 30 20 10



public class Test03 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (!(i==arr.length-1)) {
				System.out.print(", ");
			}
		}
		System.out.print("}");
	}
}
