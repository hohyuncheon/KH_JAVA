package com.oop.method.nonstatic;

import java.util.Arrays;
import java.util.Random;
	

public class NonStaticSample {
	public void outputChar(int num, char word) {
		for (int i = 0; i < num; i++) {
			System.out.print(word);
		}
		System.out.println("");
		System.out.println(word + "문자를" + num + "번 출력하였습니다");

	}
	public void alphabet() {
		
		Random rd = new Random();
		
		int randoomnum = (int)rd.nextInt(122);
						
		if((randoomnum>='A'&&randoomnum<='Z')||(randoomnum>='a'&&randoomnum<='z')) {
			char ch = (char)randoomnum; 
			return ;
		
		
			
			
			
		}
		
	
		
		
	
	}

	public void printLottoNumbers() {

		Random rnd = new Random();

		int[] rd = new int[6];
		int temp;
		int temp2;

		for (int i = 0; i < 6; i++) {
			rd[i] = rnd.nextInt(45) + 1;
			temp = rd[i];
			temp2 = rd[i];
			if (temp == rd[i]) {

			}

		}

	}
	
	

}
