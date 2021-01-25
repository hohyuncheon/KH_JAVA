package e2018.exam2;

//파라미터로 주어진 정수들의 평균값을 리턴하는 average 메소드를 구현하라.

public class Exam01 {

//	public static double average(int a, int b) {
//		return (double)(a+b)/2;
//	}
//	public static double average(int a, int b,int c) {
//		return (double)(a+b+c)/3;
//	}
//	public static double average(int[] a) {
//		double sum=0;
//		
//		for (int i = 0; i < a.length; i++) {
//			sum += a[i];
//		}
//		double avereage=sum/a.length;
//		return avereage;
//	}
	
    public static double average(int... a) {
    	int sum = 0;
    	for (int i = 0; i < a.length; i++) {
    		sum+=a[i];
			
		}
		return (double)sum/a.length;
    	
    }
	

//    public static double average(int... a) {
//        int sum = 0;
//        for (int i = 0; i < a.length; ++i)
//            sum += a[i];
//        return sum / (double)a.length;
//    }

	
	
	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5 };

		System.out.println(average(2, 3));
		System.out.println(average(2, 3, 4));
		System.out.println(average(a));
	}


}