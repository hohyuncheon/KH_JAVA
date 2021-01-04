package com.oop.student.controller;

public class Student {
	
	private int grade;
	private int classroom;
	private int stdNo;
	private String name;
	
	
	public Student() {
		super();
	}
	public Student(int grade, int classroom, int stdNo, String name) {
		super();
		this.grade = grade;
		this.classroom = classroom;
		this.stdNo = stdNo;
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public int getStdNo() {
		return stdNo;
	}
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String information() {
		return grade+" 학년  " + classroom+" 반  " + stdNo+" 번  " + name+" 입니다 ";
	}

}
