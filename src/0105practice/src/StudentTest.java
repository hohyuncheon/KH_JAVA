import java.util.Scanner;



//- StudentTest 클래스의 main 메소드에서 다음을 수행
//(1) 학생 객체를 하나 생성(s1이라고 하자)
//(2) 사용자로부터 입력받은 값으로 s1의 학번, 이름, 성적을 지정 - 반드시 학번, 이름, 성적 순으로 입력받을 것
//
//(3) 학생 객체를 하나 더 생성(s2라고 하자)
//(4) 사용자로부터 입력받은 값으로 s2의 학번, 이름, 성적을 지정 - 반드시 학번, 이름, 성적 순으로 입력받을 것
//
//(5) s1과 s2의 학번 중 앞선 학번(고학년) 출력
//(6) s1과 s2의 이름 중 사전적으로 앞선 이름 출력
//(7) s1과 s2의 성적 중 높은 성적 출력
//
//(8) 기준성적을 1.5로 s2의 합격여부를 조회하여 합격/불합격 출력
//(9) 기준성적을 1.5로 s2의 합격여부를 조회하여 합격/불합격 출력

public class StudentTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학번 이름  학점순으로 적으시오 각각쓰고 엔터");
		Student s1 = new Student(sc.nextInt(), sc.next(), sc.nextDouble());
		System.out.println("학번 이름 학점순으로 적으시오 각각쓰고 엔터");
		Student s2 = new Student(sc.nextInt(), sc.next(), sc.nextDouble());
		
		//고학번자출력
		if(s1.getNumber()>s2.getNumber()) {
			System.out.println("고학번은 : "+s1.getNumber()+"번"+s1.getName()+"입니다");
		}
		if(s1.getNumber()<s2.getNumber()) {
			System.out.println("고학번은 : "+s2.getNumber()+"번"+s1.getName()+"입니다");
		}
		
		//사전적으로 빠른거 compareTo
		
		if(s1.getName().compareTo(s2.getName()) < 0) {
			System.out.println(s1.getName()+"이 사전적으로 더 빠릅니다.");
		}
		if(s1.getName().compareTo(s2.getName()) > 0) {
			System.out.println(s2.getName()+"이 사전적으로 더 빠릅니다.");
		}
		
		
		//높은성적출력
		if(s1.getScore()<s2.getScore()) {
			System.out.println("높은 성적은 : "+s2.getScore()+s2.getName()+"입니다");
		}
		
		
		if(s1.getScore()>s2.getScore()) {
			System.out.println("높은 성적은 : "+s1.getScore()+s1.getName()+"입니다");
		}
	}
}
