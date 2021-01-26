package com.oop.coffee.controller;

import java.util.Scanner;

import com.oop.coffee.model.dto.Coffee;

public class CoffeeManager {
	
	Scanner sc = new Scanner(System.in);
	public static final int MAX_LENGTH = 3;
	Coffee[] top3 = new Coffee[MAX_LENGTH];
	
	public void insertCoffeeData() {
		for(int i=0; i<top3.length; i++) {
			//Coffee객체 생성
			Coffee c = new Coffee();
			System.out.print("커피원산지(국가) 입력 : ");
			c.setOrigin(sc.next());
			System.out.print("생산지역 입력 : ");
			c.setLocation(sc.next());
			
			//객체배열에 추가
			top3[i] = c;
		}
	}
	
	public void printCoffeeData() {
		for(int i=0; i<top3.length; i++) {
			System.out.println(top3[i].information());
		}
	}
}
