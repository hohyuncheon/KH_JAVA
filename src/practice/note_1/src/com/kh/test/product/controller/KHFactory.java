package com.kh.test.product.controller;

import com.kh.test.product.vo.Computer;
import com.kh.test.product.vo.Sugar;

public class KHFactory {

	public static void main(String[] args) {
		
		Computer[] co = new Computer[3];
		Sugar [] su = new Sugar[2];
		
		//int productCode, String productName, int seriaNumber
		co[0] = new Computer(1,"kh컴퓨터", 123456);
		co[1] = new Computer(1,"kh컴퓨터", 178786);
		co[2] = new Computer(1,"kh컴퓨터", 987656);
		
		
		//int productCode, String productName, String type, int weight
		su[0] = new Sugar(2,"kh설탕", "흑설탕",5 );
		su[1] = new Sugar(2,"kh설탕", "백설탕",2 );
		
		//for each문으로 출력방법
//		for(Computer s : co) {
//			s.makeProduct();	
	
		//for문으로 출력방법
		for (int i = 0; i < co.length; i++) {
			co[i].makeProduct();
		}
		System.out.println();
		for (int i = 0; i < su.length; i++) {
			su[i].makeProduct();
		}
	}
	
	

}
