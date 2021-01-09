package ncs.test4;

import java.util.Scanner;

import ncs.test3.Product;

public class ProductTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("이름 가격 수량 각각 적고 엔터");
		Product p = new Product(sc.nextLine(), sc.nextInt(), sc.nextInt());
		
		System.out.println(p.information());
		
		
	}

}
