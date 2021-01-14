package kh.java.gui.swing.container;

import javax.swing.JFrame;

public class JFrameTest2 extends JFrame{
/*
 * JFrame상속해서쓰기
 * 이방법 방법 선호
 * 
 */
	public static void main(String[] args) {
		new JFrameTest2();

	}
	
	public JFrameTest2() {
		setTitle("두번째 프레임");
		
		setSize(300,200);
		setLocation(200,200);
//		setBounds(200,200,300,200);//위 두줄 한번에 쓰기 크기와, 위치지정
		
		//리사이즈 방지
		setResizable(false);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

}
