package com.oop.student.controller;

import java.util.Scanner;

public class StudentManger {
	
	private Scanner sc;
	
	//배열생성
	private Student[] students= new Student[3];
	
	//배열입력
	public void insertStudentData() {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < students.length; i++) {
			
			System.out.println("학년은?");
			int old = sc.nextInt();
			
			System.out.println("반은?");
			int classs = sc.nextInt();
			
			System.out.println("번호는?");
			int num = sc.nextInt();
//			sc.nextLine();
			
			System.out.println("이름은?");
			String name = sc.next();
			
			
			// 새로운객체 만들면서 배열에 넣기!
			students[i]=new Student(old, classs, num, name);
//			students[i]=new Student(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.next());
		}
		
	}
	//배열에 들어가있는 객체 값출력
	public void printStudentData() {
		for (int i = 0; i < students.length; i++) {
			 System.out.println(students[i].information());
		}
	}
}
