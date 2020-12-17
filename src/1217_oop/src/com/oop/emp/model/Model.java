package com.oop.emp.model;

import java.util.Scanner;

//- 사원정보 관리용 클래스
//- Field 작성 : 캡슐화 반드시 적용함
//사번 : - empNo:int
//이름 : - empName:String
//소속부서 : - dept:String
//직급 : - job:String
//나이 : - age:int
//성별 : - gender:char
//급여 : - salary:int
//보너스포인트 : - bonusPoint:double
//핸드폰 : - phone:String
//주소 : - address:String


//Employee 클래스의 메소드 작성
//1. 키보드입력용 메소드 : empInput()
//2. emp객체 모든 필드 출력용 메소드 : empOutput()
//3. getter/setter메소드


//* 실행용 클래스 : com.oop.emp.run.EmpTest


//메뉴작성 : 메소드 작성
//=>메뉴 화면의 예
//public void mainMenu(){}
//******* 사원 정보 관리 프로그램 ************
//1. 새 사원 정보 입력  => empInput() 메소드 실행
//2. 사원 정보 삭제 => 참조변수에 null대입할  것.
//3. 사원정보 출력 =>  empOutput() 메소드 실행
//9. 끝내기
//********************************************


	public class Model {
		
		private int empNo;
		private String empName;
		private String dept;
		private String job;
		private int age;
		private char gender;
		private int salary;
		private double bonusPoint;
		private String phone;
		private String address;
		
	public void empInPut() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사원번호 : ");
		setEmpNo(sc.nextInt());
		sc.nextLine();
		
		
		System.out.println("이름 : ");
		setEmpName(sc.nextLine());
		
		System.out.println("소속부서 : ");
		setDept(sc.nextLine());
		
		
		System.out.println("직급 : ");
		setJob(sc.nextLine());
		
		
		System.out.println("나이 : ");
		setAge(sc.nextInt());
		
		
		System.out.println("성별 : 남 or 여");
		setGender(sc.next().charAt(0));
		
		
		System.out.println("급여 : ");
		setSalary(sc.nextInt());
		
		
		System.out.println("보너스포인트 : ");
		setBonusPoint(sc.nextDouble());
		
		
		
		System.out.println("핸드폰 : ");
		setPhone(sc.nextLine());
		sc.nextLine();
		
		
		System.out.println("주소 : ");
		setAddress(sc.nextLine());
	
		
		
		
		
		
	}
		
		
		
		
		
	public void empOutPut() {
		System.out.println("사원번호 : "+getEmpNo()+
						   "\n사원이름 : "+getEmpName()+
						   "\n소속부서 : "+getDept()+
						   "\n직급 : "+getJob()+
						   "\n나이 : "+getAge()+
						   "\n성별 : "+getGender()+
						   "\n급여 : "+getSalary()+
						   "\n보너스포인트 : "+getBonusPoint()+
						   "\n핸드폰 : "+getPhone()+
						   "\n주소 : "+getAddress());
	}
		
		public int getEmpNo() {
			return empNo;
		}
		public void setEmpNo(int empNo) {
			this.empNo = empNo;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public String getJob() {
			return job;
		}
		public void setJob(String job) {
			this.job=job;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public double getBonusPoint() {
			return bonusPoint;
		}
		public void setBonusPoint(double bonusPoint) {
			this.bonusPoint = bonusPoint;
		}
		public String getPhone() {
			return empName;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAddress() {
			return empName;
		}
		public void setAddress(String address) {
			this.address = address;
		}
	
	
}
