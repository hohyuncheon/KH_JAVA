package test2;

import test1.HourlyMember;
import test1.Member;
import test1.RegularMember;

public class MemberTest {

	public static void main(String[] args) {
		
		Member [] me = new Member[4];
		me[0]=new HourlyMember(22, 2);
		me[1]=new HourlyMember(33, 3);
		
		me[2]=new RegularMember(44);
		me[3]=new RegularMember(55);
		
		////(3) 회원의 나이 평균을 구해 출력 <--- 반복문 이용할 것, 나이 리터럴 이용 금지
		
		int sum = 0;//합계 구하기용
//		int ave = sum/mb.length;
		for (int i = 0; i < me.length; i++) {
			sum += me[i].getAge();
		}
		System.out.println("평균 나이합은 " + sum / me.length);

//	(4) 회원의 회비 합을 구해 출력 <--- 반복문 이용할 것, 회비 리터럴 이용 금지
		int hap = 0;
		for (int i = 0; i < me.length; i++) {
			hap += me[i].getpayment();
		}
		System.out.println("회비의 합은" + hap);
	}
}
