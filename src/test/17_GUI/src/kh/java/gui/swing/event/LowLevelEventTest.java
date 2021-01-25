package kh.java.gui.swing.event;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

public class LowLevelEventTest extends JFrame {

	/*
	 * Event 컴퓨터 (프로그램)와 사용자간의 상호작용
	 * 
	 * event -> os -> jvm ->event 분배쓰레드 -> 각component event handler메소드 호출
	 * 
	 * 1. 저수준 이벤트 -key event -mouse event -focus event -window event
	 *
	 * 2. 고수준 Semantic Event(Component 별처리) -action event -item event -adjustment
	 * event..
	 * 
	 * 
	 */

	public LowLevelEventTest(int w, int h, String title) {
		MyUtil.init(this, w, h, title);

		JPanel panel = new JPanel();
		JLabel label = new JLabel("패널");
		panel.add(label);// 패널에 라벨 추가

//		MyMouseListener listener = new MyMouseListener();
//		// 컴포넌트에 바인딩해줘야함
//		// 컴포넌트에 이벤트 핸들러 객체 바인딩.(연결)
//		panel.addMouseListener(listener);
//		panel.addMouseWheelListener(listener);
//		panel.addMouseMotionListener(listener);
//
//		add(panel);// 프레임에 페널 추가
		
		//-------------------------------------
		
		panel.addMouseListener(new MyMouseListener2());
		add(panel);

	}
	//마우스 이벤트에서 원하는 것만 셋팅할 수 있도록 할 수 있는 메소드 어뎁터.
	public class MyMouseListener2 extends MouseAdapter {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("mouseClicked");
		}
		
	}
	
	
	//마우스 이벤트를 실행하려면 하나만 구현할라해도 다 만들어야돼서 조금 불편함.
	public class MyMouseListener implements MouseListener, MouseWheelListener, MouseMotionListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("mouseClicked");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println("mousePressed");

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println("mouseReleased");

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println("mouseEntered");

		}

		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println("mouseExited");
		}

		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			System.out.println("MouseWheelMoved");

		}

		@Override
		public void mouseDragged(MouseEvent e) {
			System.out.println("mouseDragged!!");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			System.out.println("mouseMoved" + e.getX() + " ," + e.getY());
		}

	}

	public static void main(String[] args) {
		new LowLevelEventTest(300, 200, "저수준 이벤트").setVisible(true);

	}

}
