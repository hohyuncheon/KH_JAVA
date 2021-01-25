package Test6;

public class MemberManager {

	Member[] m = new Member[40];
	
	int count=0;
	
	public void insertMember(Member m) {
		this.m[count++]=m;
	}
	public void printData() {
		for (int i = 0; i < count; i++) {
//			System.out.println(m[i].getPoint());
			System.out.println(m[i]);
		}
		
	}
		

}
