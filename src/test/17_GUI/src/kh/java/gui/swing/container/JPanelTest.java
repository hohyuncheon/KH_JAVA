package kh.java.gui.swing.container;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelTest extends JFrame{

	/*
	 * 패널사용법. 프레임 안의 패널
	 */
	public JPanelTest() {
		setTitle("800,500만들기");
//		setBounds(0,0,800,500);//앞에가 위치, 뒤에가 크기
		setSize(800,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//JFrame 의 기본 LayoutManager 객체는 BorderLayout이다.
//		setLayout(new BorderLayout());
		
		//null layout : layout manager객체를 사용하지 않고 직접 좌표를 지정(직관적임?)
		setLayout(null);
		
		//자식컴포넌트 추가
		JPanel panel1 = new JPanel();
//		panel1.setBackground(Color.red);//색상추가
		panel1.setBackground(new Color(248,252,3));//색상추가 컬러피커사용.
		JLabel label1 = new JLabel("panel1");//글자쓰기
		
		panel1.setBounds(100, 50, 300, 400);
		
		//반드시 추가해줘야함 라벨 ->패널 패널->프레임
		panel1.add(label1);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.DARK_GRAY);
		JLabel label2 = new JLabel("panel2");
		panel2.setBounds(400,50,300,400);//이거 쓸때 사용null layout : layout manager객체를 사용하지 않고 직접 좌표를 지정(직관적임?)
		
		panel2.add(label2);
		
		//프레임에 추가하는 코드.보더 레이아웃을 사용해 위치를 지정해줘야함.
//		add(panel1, BorderLayout.NORTH);
//		add(panel2, BorderLayout.CENTER);
		
		add(panel1);//좌표 직접 지정해줬을 때 
		add(panel2);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JPanelTest();

	}
}
