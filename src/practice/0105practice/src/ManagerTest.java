
public class ManagerTest {

	public static void main(String[] args) {
		
		
		
//		(1) 봉급을 1000으로 초기화 한 직원 생성
		Employee e = new Employee(1000);
//		(2) 직원 봉급, 세금액을 조회하여 출력
		System.out.println("직원 봉급은 "+e.getSalary()+"세금액은 "+e.getTax());
//		(3) 봉급을 1000, 보너스를 500로 초기화 한 매니저 생성
		Manager m = new Manager(1000, 500);
//		(4) 매니저의 봉급, 보너스, 세금액을 조회하여 출력
		System.out.println("매니저의 봉급 "+m.getSalary()+"세금액은 "+m.getTax());
	}

}
