package ncs.test10;

//	 Employee[] employees = new Employee[2];
//	 // 1번의 사용 데이터를 기반으로 객체를 생성하여 배열에 넣는다 .
//	// 모든 객체의 기본 정보를 출력한다 (for 문을 이용하여 출력한다.)
//	 // 모든 객체에 인센티브 100 씩 지급한 급여를 계산하고 다시 객체의 salary에 넣는다 .
//	 // 모든 객체의 정보와 세금을 출력한다 (for 문을 이용하여 출력한다.)
//	}
//	} 

public class Company {

	public static void main(String[] args) {

		Employee[] employees = new Employee[2];
		employees[0] = new Secretary("Hilery", 1, "secretary", 800);
		employees[1] = new Sales("Clinten ", 2, "sales  ", 1200);

		System.out.println("name" + "   " + "department" + "   " + "salary" + "   ");
		System.out.println("--------------------------");

		for (int i = 0; i < employees.length; i++) {
			System.out.print(
					employees[i].getName() + "   " + employees[i].getDepartment() + "     " + employees[i].getSalary());
			System.out.println();
		}
		Secretary sc = new Secretary();
		Sales sa = new Sales();

		System.out.println("인센티브 100씩 지급");

		//인센티브 주는 코드 모르겠음
		for(Employee e : employees) {
			if(e instanceof Bonus)
				((Bonus) e).incentive(100);
		}
		
		System.out.println("name" + "   " + "department" + "   " + "salary" + "   "+"tax");
		System.out.println("--------------------------");
		
		System.out.println(employees[0].getSalary());
	

		for (int i = 0; i < employees.length; i++) {
			System.out.print(
					employees[i].getName() + "   " + employees[i].getDepartment() + "     " + employees[i].getSalary()+ "     " + employees[i].tax());
			System.out.println();
		}
		

	}
	public void bonus(Bonus b,int bb) {
		b.incentive(bb);
	}

}
