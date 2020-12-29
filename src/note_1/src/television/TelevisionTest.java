package television;

public class TelevisionTest {

	public static void main(String[] args) {

		
		Television [] array = new Television[3];
		
		array[0]=  new Television(7);
		array[1]=  new Television(9);
		array[2]=  new Television(11);
		
		
		for (int i = 0; i < array.length; i++) {
			
			//기본출력문
//			System.out.println(array[i].getChannel());
		
			//tostring출력문
			System.out.println(array[i]);
			
		}
		
		
	}

}
