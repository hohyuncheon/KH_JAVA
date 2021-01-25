package com.oop.person.controller;

import java.util.Scanner;

import com.oop.person.model.Person;

public class PersonController {
	Scanner sc = new Scanner(System.in);

	// 배열생성
	Person[] p = new Person[5];

	// 배열에입력
	public void insert() {
		for (int i = 0; i < p.length; i++) {
			System.out.println("당신의 이름은? 나이, 키, 몸무게, 재산은? 각각 치고 엔터");
			p[i] = new Person(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
	}

	// 배열에서 평균구하기
	public void sum() {
		int sumage = 0;
		double sumhe = 0;
		double sumwe = 0;
		int sumtotal = 0;

		for (int i = 0; i < p.length; i++) {
			sumage += p[i].getAge();
			sumhe += p[i].getHe();
			sumwe += p[i].getWe();
			sumtotal += p[i].getPr();
		}

		// 평균출력
		System.out.println("위 사람들의 평균나이는 ? " + sumage / p.length + "살");
		System.out.println("위 사람들의 평균 키는? " + sumhe / p.length + "cm");
		System.out.println("위 사람들의 평균 몸무게는 ? " + sumwe / p.length + "kg");
		System.out.println("위 사람들의 평균 재산은 ? " + sumtotal / p.length + "원");
	}

	// 배열출력
	public void print() {
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].information());
		}
	}

}
