package com.oop.person.model;

public class Person {

	private String na;
	private int age;
	private int he;
	private int we;
	private int pr;
	
	public String getNa() {
		return na;
	}
	public void setNa(String na) {
		this.na = na;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHe() {
		return he;
	}
	public void setHe(int he) {
		this.he = he;
	}
	public int getWe() {
		return we;
	}
	public void setWe(int we) {
		this.we = we;
	}
	public int getPr() {
		return pr;
	}
	public void setPr(int pr) {
		this.pr = pr;
	}
	public Person(String na, int age, int he, int we, int pr) {
		super();
		this.na = na;
		this.age = age;
		this.he = he;
		this.we = we;
		this.pr = pr;
	}
	public Person() {
		super();
	}
	
	
	public String information() {
		return "이름은 " + na+ "  나이는 " + age+"살 키는 "+ he+ "cm 몸무게는 "+we+"kg 재산은 "+pr+"원입니다";
	}

	
}
