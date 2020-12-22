package com.oop.coffee.controller;

import java.util.Scanner;

import com.oop.coffee.model.dto.Coffee;

public class CoffeeManager {

	Coffee[] co = new Coffee[3];

	public CoffeeManager() {
		Scanner sc = new Scanner(System.in);
		System.out.println("커피 3대 정보를입력하시오");
		
		for (int i = 0; i < 3; i++) {
			System.out.print("원산지는 : ");
			String origin = sc.next();
			System.out.print("지역은 : ");
			String location = sc.next();
			co[i] = new Coffee(origin, location);
		}
		System.out.println("<세계3대커피>");
		System.out.println("---------------------------");
		System.out.println(" 원산지           지역\r\n" + 
						"  ---------------------------"		);
		for(int i =0 ;i < co.length ;i++) {
			co[i].print();
		}
	}
}
