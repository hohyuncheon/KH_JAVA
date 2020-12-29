package com.oop.body.controller;

import com.oop.body.model.Arm;
import com.oop.body.model.Body;
import com.oop.body.model.Head;
import com.oop.body.model.Leg;

public class ActionBody {
	
	public static void main(String[] args) {
		ActionBody ab = new ActionBody();//이유
		
		//배열에 입력
		Body[] body = new Body[5];
		body[0] = new Head("검정");
		body[1] = new Arm();
		body[2] = new Arm();
		body[3] = new Leg();
		body[4] = new Leg();
		
		//for each 출력문
//		for(Body bo : body) {
//			ab.action(bo);
//		}
		
		//for문 출력문
		
		for (int i = 0; i < body.length; i++) {
			ab.action(body[i]);
		}
		
	}
	
	//Body의 act출력
	public void action(Body body) {
		body.act();
	}

}
