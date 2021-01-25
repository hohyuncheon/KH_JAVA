package com.oop.book.run;

import java.util.Scanner;

import com.oop.book.model.Book;

public class BookManager {

	// 10개 배열 생성
	
	Book[] bo = new Book[10];

	// 필드값
	Scanner sc = new Scanner(System.in);
	private Book[] bar=null; // ?
	private static int count = 0;

	// 개터세터
	public Book[] getBo() {
		return bo;
	}

	public void setBo(Book[] bo) {
		this.bo = bo;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public Book[] getBar() {
		return bar;
	}

	public void setBar(Book[] bar) {
		this.bar = bar;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	// 생성자 카운트값 추가해줌
	public BookManager() {
	}

	// 인풋
	public void bookInput() {
		
			// String bookname, int price, int discount, String author

			System.out.println("bookname, price, discount,author순으로 적어주세요 각각엔터");
			bo[count] = new Book(sc.next(), sc.nextInt(), sc.nextInt(), sc.next());
			count++;
		}

	// 아웃풋 모든 출력
	public void bookoutput() {
		for (int i = 0; i < count; i++) {
			System.out.println(bo[i].information());
		}System.out.println("입력하신 책 숫자는 "+count+"개입니다");
	}

}


