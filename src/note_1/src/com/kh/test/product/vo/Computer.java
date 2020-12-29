package com.kh.test.product.vo;

public class Computer {
	
	
	private int productCode;//상품코드
	private String productName;//상품명
	private int seriaNumber;//제품번호
	
	
	//setter getter 
	
	public int getSeriaNumber() {
		return seriaNumber;
	}

	public void setSeriaNumber(int seriaNumber) {
		this.seriaNumber = seriaNumber;
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
	public Computer() {
		super();
	}

	public Computer(int productCode, String productName, int seriaNumber) {
		super();
		this.productCode = productCode;
		this.seriaNumber = seriaNumber;
		this.productName = productName;
	}
	
	
	public void makeProduct(){
		System.out.println("상품코드  : "+productCode+",  상품명  : "+productName+",  제품번호  : "+seriaNumber+" 컴퓨터를 생산하였습니다");
		
	}
}
