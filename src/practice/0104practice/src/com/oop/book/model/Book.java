package com.oop.book.model;

public class Book {

	private String bookname;
	private int price;
	private int discount;// 할인율
	private String author;// 저자

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Book(String bookname, int price, int discount, String author) {
		super();
		this.bookname = bookname;
		this.price = price;
		this.discount = discount;
		this.author = author;
		
	}

	public Book() {
		super();
	}

	// 출력
	public String information() {
		return "책 이름은 :" + bookname +" 가격은 :" + price + " 할인율은 :"+discount + " 저자는 :"+author;

	}

}
