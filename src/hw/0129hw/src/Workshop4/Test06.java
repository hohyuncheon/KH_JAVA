package workshop4;

import java.util.Random;

//1)eclipse Argument 에서 1~5까지의 두 개의 정수형 데이터를 입력 받아 2차원 배열을 만든다.
//2) 입력 받은 데이터가 2개 미만 또는 2개 초과로 입력 하면 “다시 입력 하세요” 출력
//3) 1~5이외의 숫자가 입력 될 경우 “숫자를 확인 하세요” 출력
//4) 입력 받은 두개의 정수를 이용하여 2차원 배열을 생성한다.
//5) 2차원 배열에 1~5까지의 랜덤한 숫자(중복허용)를 넣는다.
//6) 배열의 내용을 출력 한다.
//7) 배열의 총합과 평균을 출력 한다.
//출력은 아래와 같이 이루어 진다.
//합과 평균은 실수형으로 출력 하시오.
//2 2 를 입력 할 경우
//2 2
//5 5
//sum=14.0 avg=3.5
public class Test06 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int sum = 0;
		double count =0;
		
		//2) 입력 받은 데이터가 2개 미만 또는 2개 초과로 입력 하면 “다시 입력 하세요” 출력
		if(args.length<2||args.length>4) {
			System.out.println("2가지의 수를 입력해야합니다");
			return;
		}
		//3) 1~5이외의 숫자가 입력 될 경우 “숫자를 확인 하세요” 출력
		for (int i = 0; i < args.length; i++) {
			if(Integer.parseInt(args[i])>5) {
				System.out.println("1~5입력 해야합니다.숫자를 확인하세요");
				return;
			}
		}
		//4) 입력 받은 두개의 정수를 이용하여 2차원 배열을 생성한다.
		int[][] num2 = new int [Integer.parseInt(args[0])][Integer.parseInt(args[1])];
	
		//5) 2차원 배열에 1~5까지의 랜덤한 숫자(중복허용)를 넣는다.
		for (int i = 0; i < num2.length; i++) {
			for (int j = 0; j < num2[i].length; j++) {
				int rand = rd.nextInt(5)+1; //랜덤값 생성
				num2[i][j]=rand;
			}
			
		}
		//6) 배열의 내용을 출력 한다.
		for (int i = 0; i < num2.length; i++) {
			for (int j = 0; j < num2[i].length; j++) {
				System.out.print(num2[i][j] + " ");
				sum+=num2[i][j];//합계
				count++;
			}System.out.println();
		}
		
		//7) 배열의 총합과 평균을 출력 한다.
		System.out.println("합계 : " +sum);
		System.out.println("평균 : "+sum/count);
	}

}
