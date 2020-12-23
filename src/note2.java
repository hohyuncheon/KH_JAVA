package note_1;

import java.util.Scanner;

public class note2 {
	public static void main(String[] args) {

		note2 te = new note2();
		te.test1();
		
	
            
                
//      java.util.Scanner 클래스의 nextLine() 
//                메소드를 사용하여 키보드로 값을 입력받아 출력처리하는 구문을 아래의 예와 같이 실행되도록 구문을 작성하시오. (25점)
//                -변수명은 임의대로 선언합니다.
//                -클래스와 메소드는 생략합니다. 구문만 작성합니다.
//                [입력]
//                아이디 : kh007
//                이름 : 홍길동
//                [출력]
//                홍길동님의 아이디는 kh007입니다.
//        
	

	private void test1() {Scanner sc = new Scanner(System.in);
	System.out.println("아이디를 입력하시오");
	String id = sc.nextLine();
	System.out.println("이름을 입력하시오");
	String name = sc.nextLine();
	System.out.println(name + "님의 아이디는 " + id + "입니다");
	}


		// TODO Auto-generated method stub
		
	}
}
