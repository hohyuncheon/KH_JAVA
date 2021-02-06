package school;

public class StudentTest {
	
	// Student 객체를 3개 생성하여 배열에 넣는다 
	// 배열에 있는 객체 정보를 모두 출력 한다 – for 문을 이용 할 것 
	// 나이의 평균 출력 
	// 신장의 평균 출력 
	// 몸무게의 평균 출

	public static void main(String[] args) {
		
		Student studentArray [] = new Student[3];
		studentArray[0] = new Student("홍길동" ,15, 171, 81);
		studentArray[1] = new Student("한사람" ,13, 183, 72);
		studentArray[2] = new Student("임걱정" ,16, 175, 65);
		System.out.println("이름    나이   신장  몸무게");
		for (int i = 0; i < studentArray.length; i++) {
			System.out.printf("%s  %s  %s  %s\n",studentArray[i].getName(),studentArray[i].getAge(),studentArray[i].getHeight(),studentArray[i].getWeight());
		}
		
		double age = 0;
		double height = 0;
		double weight = 0;
		
		
		for (int i = 0; i < studentArray.length; i++) {
			age += studentArray[i].getAge();
		}
		
		for (int i = 0; i < studentArray.length; i++) {
			height += studentArray[i].getHeight();
		}
		
		for (int i = 0; i < studentArray.length; i++) {
			weight += studentArray[i].getWeight();
		}
		
		System.out.println();
		System.out.printf("나이의 평균 : %.2f\n" , age/3);
		System.out.printf("신장의 평균 : %.2f\n" , height/3);
		System.out.printf("몸무게의 평균 : %.2f\n" , weight/3 );
		
	}
}
