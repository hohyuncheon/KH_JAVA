package com.oop.book.run;

import java.util.Scanner;

public class TestBookArray {

	public static void main(String[] args) {
		TestBookArray t = new TestBookArray();
		t.menu();

	}

	public void menu() {
		Scanner sc = new Scanner(System.in);
		BookManager bm = new BookManager();

		do {
			System.out.println("*****도서관리메뉴*****");
			System.out.println("1. 도서 정보 추가");
			System.out.println("2. 모두출력");
			System.out.println("7. 끝내기");
			int choice = sc.nextInt();

			if (choice == 7) {
				System.out.println("끝났습니다");
				return;
			} else if (choice == 1) {
				bm.bookInput();
			} else if (choice == 2) {
				bm.bookoutput();
				break;
			}
		} while (true);

	}

}
