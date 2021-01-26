package television2;

public class TelevisionTest {

	public static void main(String[] args) {
		
		
		//값입력
		Television [] channel = new Television[3];
		
		channel[0]= new Television(7);
		channel[1]= new Television(9);
		channel[2]= new Television(11);
		

//		channel[0].setChannel(7);
//		channel[1].setChannel(9);
//		channel[2].setChannel(11);
		
		
		//값출력
		
		for (int i = 0; i < channel.length; i++) {
			
			System.out.println(channel[i].getChannel());
		
			
		}

	}

}
