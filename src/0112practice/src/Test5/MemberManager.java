package Test5;

public class MemberManager {

	int count = 0;// 카운트해줄

	Member[] m = new Member[40];

	public void insertMember(Member m) {// new Silver("홍길동", "Silver",1000)
		this.m[count++]=m;
	}

	public void printData() {
		for (int j = 0; j < count; j++) {
			System.out.println(m[j].getGrade() + m[j].getPoint());
		}
	}

}
