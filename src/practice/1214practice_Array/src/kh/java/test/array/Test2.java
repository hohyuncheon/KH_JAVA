package kh.java.test.array;

public class Test2 {

	public static void main(String[] args) {
		Test2 te = new Test2();
		te.test2();

	} public void test2() {
		
		String [] st = new String[5];
		st [0] = "딸기";
		st [1] = "복숭아";
		st [2] = "키위";
		st [3] = "사과";
		st [4] = "바나나";
		
		//String [] ex = {"딸기", "복숭아","키위", "사과", "바나나"};
		for(int i =0;i<st.length;i++) {
			System.out.println(st[i]);
		}
		
	}

}
