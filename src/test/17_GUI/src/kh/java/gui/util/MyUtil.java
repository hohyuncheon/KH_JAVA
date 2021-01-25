package kh.java.gui.util;

import javax.swing.JFrame;
import javax.swing.JPanel;

import kh.java.gui.swing.change.panel.CustomPanel;

public class MyUtil {

	public static void init(JFrame f, int w, int h, String title) {
		f.setTitle(title);
		f.setSize(w, h);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	//화면 색상을 바꿔준다 패널 바꾸기용.
	public static void changePanel(JFrame parent, CustomPanel current, JPanel next) {
		parent.remove(current);//지우기
		parent.add(next);
		
		parent.revalidate();//container하위 계층 구조를 새로고침하는 기능.
		parent.repaint();//다시 화면 그리기용 메소드
		
	}
}
