package kh.java.test.array;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Test5 te= new Test5();
		te.test5();

	}
	
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 주민번호는?");
		String num = sc.nextLine();
		
		int [] in = new int[14];
		for(int i =0;i < num.length() ; i++ ) {
			in[i] = num.charAt(i);//그릇에 숫자들이들어감
		}
		
		int [] incopy= in.clone(); //복제함
		
		String result = num.substring(0, 8)+"xxxxxx"+num.substring(14);
		
		System.out.println(result);
	}
		
		
		
		
	}
