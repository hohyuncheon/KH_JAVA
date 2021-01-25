package ncs.test7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//JFrame 사용해서
//JPanel ( btn - 콘솔창에 "클릭")
//innerClass사용

public class ysTest extends JFrame {
	
	
	public static void main(String[] args) {
		new ysTest();
	}
		public ysTest(){
			
			JFrame j = new JFrame();
			j.setBounds(0, 0, 500, 500);
			JPanel jp = new JPanel();
			j.add(jp);
			JButton jb = new JButton("클릭");
			jp.add(jb);
			jb.addActionListener(new Action12());
			
//			jb.addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					System.out.println("클릭");
//				}
//			});
			j.setVisible(true);
	}

	public class Action12 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("클릭");
		}
	}
}
