package note_1;

import java.util.Scanner;

public class Snippet {

	public static void main(String[] args) {
	
		int[] list = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		
		int value, index = -1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("탐색할 값을 입력하시오: ");
		
		value = scan.nextInt();
		
		for(int i = 0; index == -1 && i < list.length; i++) {
		if (list[i] == value)
		index = i;
		}
		
		if (index >= 0)
		System.out.println(value + "값의 위치 : " + index);
		
				else
		System.out.println(value + "값 탐색 실패");
		}
}
