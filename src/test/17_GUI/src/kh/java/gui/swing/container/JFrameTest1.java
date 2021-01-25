package kh.java.gui.swing.container;

import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * JFrame객체 생성1
 * 		new JFrame() 직접 객체 생성하기
 * JFrame객체 생성2
 * 		JFrame을 상속한 커스텀 클래스 작성후 객체 생성하기
 
 */

public class JFrameTest1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		//제목 지정
		f.setTitle("Hello Swing");
		
		//윈도우크기 지정
		f.setSize(300, 200);
		
		//스크린 가운데 띄우기
		f.setLocationRelativeTo(null);
		
		//기준점 지정
//		f.setLocation(0, 0);//기본값은 0,0  기준점을 생성하기.
		
		//x버튼 프로그램 종료처리 하게 만들기
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//자식 컴포넌트 : 컨테이너에 포함된 컴포턴트
		f.add(new JLabel("안녕"));
		
		//시각화 처리 (맨 마지막에 작성해야한다.)
		f.setVisible(true);
	}

}
