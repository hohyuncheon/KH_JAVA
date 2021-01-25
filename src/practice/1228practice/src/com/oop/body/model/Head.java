package com.oop.body.model;

public class Head extends Body {
	
	private String hairColor;

	
	
	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public Head() {
	}

	public void headBang() {
		System.out.println(this.hairColor +  "색 머리를 돌립니다.");
	}
	
	public Head(String hairColor) {
		super();
		this.hairColor = hairColor;
	}
	
	@Override
	public void act() {
		headBang();
	}


	
}
