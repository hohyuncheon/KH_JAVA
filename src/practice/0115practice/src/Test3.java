
public class Test3 {
	
//	텔레비전을 나타내는 Television 클래스를 정의하고, Television 배열을 이용하는 프로그램을 작성하시오.
//	두개의 파일, 두개의 클래스로 작성할 것
//
//	- Television 클래스: 채널(정수형) 필드를 가짐
//	 
//	- TelevisionTest 클래스: main 메소드에서 다음을 수행
//	  (1) 크기가 3인 텔레비전 배열에 텔레비전을 생성하여 저장
//	  (2) 텔레비전 채널을 7, 9, 11로 지정
//	  (3) 반복문을 이용하여 배열에 저장된 모든 텔레비전의 채널을 출력
	
	public static void main(String[] args) {
		
		Test_3 [] tele = new Test_3[3];
		tele[0]=new Test_3(7);
		tele[1]=new Test_3(9);
		tele[2]=new Test_3(11);
		
		for (int i = 0; i < tele.length; i++) {
			System.out.print(tele[i].getTelevi()+" ");
		}
		
	}

}
