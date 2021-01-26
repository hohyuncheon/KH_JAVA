


public class ForExample {
	
	public static void main(String[] args) {
		int i = 0, j = 5;
		OUT: 
		for (;;) {
			i++;
			
			for (;;) {
				System.out.println("i=" + i + ", j=" + j);
				if (i > --j) {
					
					break OUT;
				}
			}
		}
		System.out.println("---------------------------");
		System.out.println("i=" + i + ", j=" + j);
	}
}
