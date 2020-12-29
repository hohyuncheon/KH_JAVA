package com.kh.test.shape.controller;

import com.kh.test.shape.model.vo.Circle;
import com.kh.test.shape.model.vo.RectAngle;


public class ShapeMaker {
	
	public static void main(String[] args) {
	Circle[] ci = new Circle[3];
	
	ci [0] = new Circle (10);
	ci [1] = new Circle (40);
	ci [2] = new Circle (50);
	
	for(Circle s : ci) {
		s.draw();
		
	}


	RectAngle[] ra = new RectAngle[2];
	ra[0] = new RectAngle(20, 60);
	ra[1] = new RectAngle(50, 60);
	
	for(RectAngle s : ra) {
		s.draw();
		
	}
	}

}
