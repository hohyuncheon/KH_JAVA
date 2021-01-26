package com.oop.coffee.model.dto;

public class Coffee {
	private String origin; 		//원산지(국가)
	private String location;		//지역
	
	public Coffee(){}
	public Coffee(String origin, String location) {
		this.origin = origin;
		this.location = location;
	}
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String information(){
		return this.origin+" "+this.location+" 커피";
	}
	
	
}
