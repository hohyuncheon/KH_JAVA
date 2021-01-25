public class MemberTest {

	public static void main(String[] args) {

//	(1) 크기가 4인 Member 배열을 생성
		Member[] mb = new Member[4];

//	(2) 다음 4명 생성하여 위의 회원 배열에 저장
//	시간제회원(나이 22, 사용시간 2)
		mb[0] = new HourlyMember(22, 2);
//	시간제회원(나이 33, 사용시간 3)
		mb[1] = new HourlyMember(33, 3);
//	정회원(나이 44)
		mb[2] = new RegularMember(44);
//	정회원(나이 55) 
		mb[3] = new RegularMember(55);

//	(3) 회원의 나이 평균을 구해 출력 <--- 반복문 이용할 것, 나이 리터럴 이용 금지

		int sum = 0;
//		int ave = sum/mb.length;
		for (int i = 0; i < mb.length; i++) {
			sum += mb[i].getAge();
		}
		System.out.println("평균 나이합은 " + sum / mb.length);

//	(4) 회원의 회비 합을 구해 출력 <--- 반복문 이용할 것, 회비 리터럴 이용 금지
		int hap = 0;
		for (int i = 0; i < mb.length; i++) {
			hap += mb[i].getPayment();
		}
		System.out.println("회비의 합은" + hap);
	}
}
