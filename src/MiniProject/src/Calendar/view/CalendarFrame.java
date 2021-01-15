package Calendar.view;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JFrame;

public class CalendarFrame {

	public CalendarFrame() {
		JFrame caleFrame = new JFrame();
		caleFrame.setTitle("!!Calendar!!");
		caleFrame.setSize(700, 600);
		caleFrame.setLocationRelativeTo(null);
		
		//그리드레이아웃을 프레임에
		GridLayout gridLayout = new GridLayout(calArr.size() / 7, 7);
		caleFrame.setLayout(gridLayout);

		
		
		CalendarSet();
//		CalendarFrame();
		

		caleFrame.setVisible(true);

	}


	ArrayList<Integer> calArr = new ArrayList<>();
	// 날짜 정하기
	private void CalendarSet() {

		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH); // month는 0이 1월 11이 12월이다
		int date = cal.get(Calendar.DATE);
		int lastDay = cal.getActualMaximum(Calendar.DATE);

		// 이번달 셋팅
		for (int i = 0; i < lastDay; i++) {
			calArr.add(i + 1);
		}
		// 지난달 셋팅
		/** 지난 달 세팅 완료 **/

		cal.set(Calendar.DATE, 1); // 1일로 세팅
		int yoil = cal.get(Calendar.DAY_OF_WEEK); // 1 일요일 ~ 7 토요일
		int numOfPreMonth = yoil - 1;
		cal.add(Calendar.MONTH, -1);
		lastDay = cal.getActualMaximum(Calendar.DATE);
		for (int i = 0; i < numOfPreMonth; i++) {
			calArr.add(0, lastDay);
			lastDay--;
		}

		// 다음달 셋팅
		cal.add(Calendar.MONTH, 1);
		lastDay = cal.getActualMaximum(Calendar.DATE);
		cal.set(Calendar.DATE, lastDay);
		yoil = cal.get(Calendar.DAY_OF_WEEK);

		int numOfNextMonth = 7 - yoil;
		for (int i = 0; i < numOfNextMonth; i++) {
			calArr.add(i + 1);
		}
	}
	
//	private void CalendarFrame() {
//		GridLayout gridLayout = new GridLayout(calArr.size() / 7, 7);
//		CalendarFrame.setLayout(gridLayout);
//	}
	

}
