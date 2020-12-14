package weekend;

public class note { 
	
	public static void main(String []agrs) {
		
		note nt = new note ();
		
//		nt.test1();
		
		nt.test2();
		

	}
		
//	}
//	
//	public void test1() {
//		int a = 1;
//		int b = 2;
//		int c;
//		boolean d;
//		c = a++ + --b;
//        //1번문제 (a, b, c 값)
//		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
//		d = a-- == b++;
//        //2번문제 (true 인지 false인지, a,b,c값)
//		System.out.println(d == true ? "True!!!" : "False!!!");
//		System.out.println("a = " + a + ", b = "+ b + ", c = "+ c );
//	}

	
//	public void test2() {
//		int a = 2;
//		int b = a%2;
//		int c = 'A';
//		System.out.println((a+=b--) + c--);
//		System.out.println("a = "+ a); 
//		System.out.println("b = "+ b); 
//		System.out.println("c = "+ c); 
//	}
	
//	public void test2() {
//		int a = 5;
//		int b = 10;
//		int c = ++a;
//		System.out.printf("a = %d, b = %d, c = %d%n", a, b, c);
//		c = b++;
//		System.out.printf("a = %d, b = %d, c = %d%n", a, b, c);
//		a = 10;
//		c = a-- + ++b;
//		System.out.printf("a = %d, b = %d, c = %d%n", a, b, c);	
//	}
	
    public void test2() {
        
        int a, b;
        String s;
        
        a=0;
        b=0;
        
        a++;
        
        s = a == ++b ? "같다" : "다르다";
        System.out.println(s);
        
        s = a == b-- ? "같다" : "다르다";
        System.out.println(s);
        
        a++;
        b++;
        
        s = a>=2 && b++>=2 ? "같다" : "다르다";
        System.out.println(s);
        
        s = a>=2 && b>=2 ? "같다" : "다르다";
        System.out.println(s);

    }
    
}
