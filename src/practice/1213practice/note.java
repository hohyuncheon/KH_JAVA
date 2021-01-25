package note_1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class note {
	public static void main(String[] args) {

		note te = new note();
//	te.test1();
//	te.test2();
//	te.test3();
//	te.test4();
//	te.test5();
//	te.test6(); 더 해보고싶은 문제
//	te.test7();
//	te.test8();
//	te.test9();
//	te.test10();
//	te.test11();
//	te.test12();
//	te.test13();
//	te.test14();
	te.test15();
	
	
	

	
	

	}public void test15() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ----------menu----------\r\n" + 
				"        1. 가정용 (50원/liter)\r\n" + 
				"        2. 상업용 (45원/liter)\r\n" + 
				"        3. 공업용 (30원/liter)\r\n" + 
				"        -------------------------\r\n" + 
				"        메뉴번호를 선택하세요. ==> ex) 2\r\n" + 
				"        물 사용량을 입력하세요. ==> ex) 250");
	
		System.out.println("메뉴번호는? : ");
		int choice1= sc.nextInt();
		System.out.println("물사용량은? : ");
		int choice2= sc.nextInt();
		
		int ga = 0; // 용도 고르기 choice1 그릇
		String a= " ";
	
		switch (choice1) {
		case 1 : ga+=50;a= "가정용"; break;
		case 2 : ga+=45;a= "상업용"; break;
		case 3 : ga+=30;a= "공업용"; break;
		}
		
		int total = ga * choice2; //사용요금
		
		int water = (int)(total * 0.05); //수도세
		int result = total + water;  //총사용요금
		
		
		
		System.out.println(
				
				" 선택메뉴번호 : "+choice1+a+"를 선택하셨습니다. \r\n" + 
				"        사용요금 :"+total+"\r\n" + 
				"        수도세 : "+water+ 
				"        총수도요금 : "+result);
		}
		
		
		

		
		
		

	
	
	
	
	public void test14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("       *********주메뉴*********\r\n" + 
			    "       a. 불고기버거 ------------5000\r\n" + 
				"       b. 새우버거 --------------4000\r\n" + 
				"       c. 치킨버거 --------------4500\r\n" + 
				"       d. 한우버거 -------------10000\r\n" + 
				"       e. 디버거 ----------------7000\r\n" + 
				"       ***********************  \r\n" + 
				"       \r\n" + 
				"       *******사이드메뉴********\r\n" + 
				"        1. 콜라 -------------------1500\r\n" + 
				"        2. 사이다 -----------------1500\r\n" + 
				"        3. 밀크쉐이크-------------2500\r\n" + 
				"        4. 레드불------------------3000\r\n" + 
				"        ***********************");
		
		
		System.out.print("햄버거 메뉴 a~e중 고르시오");
		char choice1 = sc.next().charAt(0);
		
		
		System.out.print("사이드 메뉴 1~4중 고르시오");
		int choice2 = sc.nextInt();
		
		String result= " ";
		int sum= 0;
		
		switch(choice1) {
		
		case 'a': result+="불고기버거, "; sum+=5000;break;
		case 'b': result+="새우버거, "; sum+=4000;break;
		case 'c': result+="치킨버거, "; sum+=4500;break;
		case 'd': result+="한우버거, "; sum+=10000;break;
		case 'e': result+="디버거, " ; sum+=7000;break;
		default : result+="//햄버거 메뉴를 잘못 고르셨습니다//";break;
		}
		
		switch(choice2) {
		
		case 1: result+="콜라"; sum+=1500;break;
		case 2: result+="사이다"; sum+=1500;break;
		case 3: result+="밀크쉐이크"; sum+=2500;break;
		case 4: result+="한레드불"; sum+=3000;break;
		default : result+="//사이드 메뉴를 잘못 고르셨습니다//";break;
		}
		
		System.out.println(result+"의 가격은"+sum+"입니다");
		
		
		
		
		
		
		
		
	}
	
	
	
	public void test13() {
		
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.print("    **********메  뉴*********\r\n" + 
				"    1. 떡볶이 ----------------1000\r\n" + 
				"    2. 김밥 ------------------ 2000\r\n" + 
				"    3. 오뎅 ------------------ 1000\r\n" + 
				"    4. 순대 ------------------ 2000\r\n" + 
				"    5. 튀김 ------------------ 3000\r\n" + 
				"    6. 떡튀순 ---------------- 8000\r\n" + 
				"    *************************\n" +
				"    그만주문하려면 0 번");
		
			int choice = sc.nextInt();
			if(choice>6||choice<0) {
				System.out.println("잘못입력했습니다 영업을 종료합니다");
				return;
			}
			
			
			switch(choice) {
			case 1 : System.out.println("떡볶이는 1000원입니다.");break;
			case 2 : System.out.println("김밥는 2000원입니다.");break;
			case 3 : System.out.println("오댕는 1000원입니다.");break;
			case 4 : System.out.println("순대는 2000원입니다.");break;
			case 5 : System.out.println("튀김 3000원입니다.");break;
			case 6 : System.out.println("떡튀순은 8000원입니다.");break;
			case 0 : return;
			
			default :System.out.println("잘못입력하였습니다"); break;
			}
		
		} while(true);
	
		

		
		
		
		
		
		
	}
	
	
	

	public void test12() {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();


		String use = " ";  //유져그릇
		String com = " ";  //컴퓨터그릇
		int count = 0;
		
		for (;;) {

			System.out.println("\n\n가위바위보게임\n" + "숫자를 선택하세요(1.가위  2.바위  3.보)");

			//받는 값
			int computer = rd.nextInt(3) + 1;
			int user = sc.nextInt();

			//상황
			if (user == 1 && computer==1 || user ==2 && computer==2 ||user ==3 && computer==3) {
				System.out.println("비겼습니다\n" + count+2 + "번 만에 비김");
				break;
				
			} else if (user == 2) {
				if (computer == 1) {
					System.out.println("당신이 이겼습니다");
					use = "바위";
					com = "가위";
					count++;
					

				} else if (computer == 3) {
					System.out.println("당신이 졌습니다");
					use = "바위";
					com = "보";
					count++;
					
				}
			} else if (user == 3) {
				if (computer == 1) {
					System.out.println("당신이 졌습니다");
					use = "보";
					com = "가위";
					count++;
					

				} else if (computer == 2) {
					System.out.println("당신이 이겼습니다");
					use = "보";
					com = "바위";
					count++;
					

				}
			} else if(user == 1) {
				if (computer == 2) {
					System.out.println("당신은 졌습니다");
					use = "가위";
					com = "바위";
					count++;
					

				} else if (computer == 3) {
					System.out.println("당신이 이겼습니다");
					use = "가위";
					com = "보";
					count++;
					
				}

			} System.out.print("\n유져 : " + use + "\n" + "컴퓨터 : " + com + "");



		}

}

	public void test11() {

		Scanner sc = new Scanner(System.in);

		System.out.println("당신의키는");
		double height = sc.nextDouble();

		System.out.println("당신의 몸무게는");
		int weight = sc.nextInt();

		double bmi = weight / ((height * 0.01) * (height * 0.01));

		double result = 0;

		if (bmi < 18.5) {
			result = bmi;
			System.out.println("저체중입니다");
		} else if (bmi >= 18.5 && bmi < 23) {
			result = bmi;
			System.out.println("과체중입니다");
		} else if (bmi >= 20 && bmi < 25) {
			result = bmi;
			System.out.println("비만체중입니다");
		} else if (bmi >= 25 && bmi < 30) {
			result = bmi;
			System.out.println("고도비만체중입니다");
		} else if (bmi <= 30)
			result = bmi;
		{
			result = bmi;
			System.out.println("돼지입니다");
		}

		System.out.printf("%.2f", bmi);

	}

	public void test10() {

		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("정수를 입력하시오");
			int num1 = sc.nextInt();
			if (num1 < 0 || num1 > 10) {
				System.out.println("돌아가 1~10입력해");
				continue;
			} else if (num1 % 2 == 0) {
				System.out.println("짝수야");
				continue;
			}
		}

	}

	public void test9() {

		Scanner sc = new Scanner(System.in);

		for (;;) {

			System.out.println("정수하나를 입력하시오");
			int num1 = sc.nextInt();

			System.out.println("정수하나를 입력하시오");
			int num2 = sc.nextInt();

			System.out.println("+,-,*,/ 중 입력해봐");
			char ch = sc.next().charAt(0);

			int last = 0;

			if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
				if (ch == '+') {
					last = num1 + num2;
				} else if (ch == '-') {
					last = num1 - num2;
				} else if (ch == '*') {
					last = num1 * num2;
				} else if (ch == '/') {
					last = num1 / num2;
				} else {
					System.out.println("잘못입력함");
				}
			}
			System.out.println(num1 + "" + ch + "" + num2 + "=" + last);
		}
	}

	public void test8() {

		Scanner sc = new Scanner(System.in);

		for (;;) {

			System.out.println("국어점수는?");
			int num1 = sc.nextInt();

			System.out.println("영어점수는?");
			int num2 = sc.nextInt();

			System.out.println("수학점수는?");
			int num3 = sc.nextInt();

			int total = num1 + num2 + num3;

			double avereage = total / 3;

			if (total >= 40 && avereage >= 60) {
				System.out.println("합격");

			} else {
				System.out.println("불합격");
				continue;
			}

		}

	}

	public void test7() {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("정수를 입력하시오\n" + "끝내려면 0을 입력하시오");
			int num = sc.nextInt();

			if (num == 0) {
				break;

			} else if (num % 2 == 1) {

				System.out.println("홀수입니다");
				continue;

			} else if (num % 2 == 0) {
				System.out.println("짝수입니다");
				continue;
			}
		}
		System.out.println("게임종료");

	}

	public void test6() {
		Scanner sc = new Scanner(System.in);

		System.out.println("a의 연봉을입력하시오");
		int a = sc.nextInt();
		System.out.println("b의 연봉을입력하시오");
		int b = sc.nextInt();
		System.out.println("c의 연봉을입력하시오");
		int c = sc.nextInt();

		String name = " ";

		System.out.println(name + "은 고액연봉자입니다");
	}

	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수는");
		int num1 = sc.nextInt();
		System.out.println("영어점수는");
		int num2 = sc.nextInt();
		System.out.println("수학점수는");
		int num3 = sc.nextInt();

		if (num1 + num2 + num3 >= 250) {

			System.out.println("우수생입니다");

		} else {

			System.out.println("공부가필요합니다");
		}

	}

	public void test4() {

		Scanner sc = new Scanner(System.in);

		System.out.println("학생이름이뭔가여");
		String name = sc.nextLine();
		System.out.println("학년은?");
		int grad = sc.nextInt();
		System.out.println("반은?");
		int clss = sc.nextInt();
		System.out.println("번호는?");
		int num = sc.nextInt();

		System.out.println("성별은뭔가여 M or F");
		char sex = sc.next().charAt(0);

		String c = "";

		if (sex == 'M' || sex == 'm') {
			c = "남학생";

		} else {
			c = "여학생";

		}
		System.out.println("성적은? (89.11) ");
		float score = sc.nextFloat();

		System.out.printf("%d학년 %s반 %d번 %s %s은 성적이 %.2f이다", grad, clss, num, c, name, score);

	}

	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수입력");
		int num1 = sc.nextInt();
		System.out.print("수학점수입력");
		int num2 = sc.nextInt();
		System.out.print("영어점수입력");
		int num3 = sc.nextInt();

		int num4 = (num1 + num2 + num3) / 3;

		if (num1 > 40 && num2 > 40 && num3 > 40) {
			if (num4 >= 60) {
				System.out.println("합격");
			}
		} else {
			System.out.println("불합격");
		}
		System.out.println("평균값 = " + num4);

	}

	public void test2() {
		int num = 100;
		long longg = 99999999999L;
		float f = 486.520F;
		char A = 'A';
		String s = "Hello world";
		boolean b = 1 > 2;

		System.out.println(A + s + f + b);

	}

	public void test1() {
		System.out.println("컴퓨터 1급");
		Date today = new Date();
		System.out.println(today);

		SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sd.format(today));

	}

}