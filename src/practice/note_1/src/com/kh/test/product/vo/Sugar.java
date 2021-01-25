package com.kh.test.product.vo;

public class Sugar {
	
	private String type;
	private int weight;
	private int productCode;
	private String productName;
	
	//getter setter
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	//constructor
	public Sugar() {
		super();
	}
	public Sugar(int productCode, String productName, String type, int weight) {
		super();
		this.type = type;
		this.weight = weight;
		this.productCode = productCode;
		this.productName = productName;
	}
	
	public void makeProduct(){
		System.out.println("상품코드  : "+productCode+", 상품명  : "+productName+", 제품유형  : "+type+", 중량  : "+weight+" kg설탕을 생산하였습니다");
		
	}
}
