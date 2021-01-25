package kh.java.test.array;

public class Test1 {

	public static void main(String[] args) {
		
		Test1 te = new Test1();
		te.test1();

		
		
	}
	
	public void test1() {
		
		int [] num = new int[100];
				
				for(int i =0 ; i<num.length ; i++) {
					num[i] = i+1;
				}for(int i =0 ; i<num.length;i++) {
					System.out.println(num[i]);
				}
					
				
		
		
	}
	

	
}
