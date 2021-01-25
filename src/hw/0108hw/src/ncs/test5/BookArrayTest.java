package ncs.test5;

public class BookArrayTest {

	public static void main(String[] args) {

		// Book 객체를 3개 생성하여 배열에 넣는다.
		Book bArray[] = new Book[3];
		
		bArray[0] = new Book("자바의 정석", "남궁성", 30000, "도우출판",  0.1);
		bArray[1] = new Book("열혈강의 자바", "구정은",29000, "프리렉",  0.1);
		bArray[2] = new Book("객체지향 JAVA8", "금영욱",30000, "북스홈",  0.1);
		
		System.out.println(bArray[0].gethowmuch());
		// 배열에 있는 객체 정보를 모두 getter 로 출력 한다. – for 문을 이용 할 것
		for (int i = 0; i < bArray.length; i++) {
			System.out.printf("%s, %s, %s, %d원, %.0f%%할인\n",bArray[i].getTitle(),bArray[i].getAuthor(),bArray[i].getPublisher(),bArray[i].getPrice(),bArray[i].gethowmuch());
			System.out.printf("할인된 가격 : %.0f원\n",bArray[i].getDiscountRate());
		}
	}
}
