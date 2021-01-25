package kh.java.gui.swing.container.layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

public class FlowLayoutTest extends JFrame{

	public FlowLayoutTest(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		//JPanel의 기본 Layout객체
		JPanel panel = new JPanel();
		
		//정렬기준 제시 left , right , center 실행했을 때 왼쪽부터 정렬.
		
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		for (int i = 0; i < 15; i++) {
			panel.add(new JButton((i+1) + "번"));
			
		}
		add(panel);
		
	}

	public static void main(String[] args) {
		new FlowLayoutTest(500, 500, "FlowLayoutTest").setVisible(true);
	}

}