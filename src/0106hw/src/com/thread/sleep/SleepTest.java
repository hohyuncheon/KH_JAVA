package com.thread.sleep;

//[Thread 실습문제]
//<문제 1> 
// - 실행용클래스 com.thread.sleep.SleepTest
// + sendAphorism() : void 
// - 좋아하는 속담, 경구 10개를 문자열배열에 담고, 3초마다 랜덤하게 출력하세요.
// - 10번 출력후 종료하세요.

public class SleepTest {

	public static void main(String[] args) {
		SleepTest st = new SleepTest();
		st.sendAphorism();

	}

	public void sendAphorism() {

		String[] s = new String[10];

		s[0] = "하늘은 용기 있는 자의 편이다. - (베르길리우스)";
		s[1] = "교육은 노후를 위한 최상의 양식이다. - (아리스토텔레스)";
		s[2] = "지나치게 왕성한 생각은 사고가 아니다. - (시어도어 로스케)";
		s[3] = "우둔함은 영원하나 무지는 고칠 수 있다. - (돈 우드)";
		s[4] = "웃음 없는 하루는 낭비한 하루다. - (찰리 채플린)";
		s[5] = "성공의 겉모습 만큼 성공하는 것은 없다. - (크리스토퍼 래쉬)";
		s[6] = "전쟁은 적을 사랑하라고 가르치지 않는다 오히려 동맹군을 미워하라고 가르칠 뿐 - (조지)";
		s[7] = "지금이 제일 비참하다고 할 수 있는 동안은 아직 제일 비참한 게 아니다. - (윌리엄 셰익스피어)";
		s[8] = "사랑은 모두가 기대하는 것이다 사랑은 진정 싸우고 용기를 내고 모든 것을 걸 만하다.- (에리카 종)";
		s[9] = "올바른 순간에 잘못된 행동을 하는 것이 삶의 모순 중 하나라고 생각한다. - (찰리 채플린)";

		for (int i = 0; i < s.length; i++) {
			int random = (int) (Math.random() * 10);
			System.out.println(s[random]);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
