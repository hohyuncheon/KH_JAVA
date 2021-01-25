package kh.java.gui.swing.container.layout;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

public class BorderLayoutTest extends JFrame{

	public BorderLayoutTest(int w, int h, String title) {
		MyUtil.init(this , w, h, title);//마이유틸에 현재 객체, 좌표값, 제목까지 전달.
		
		//JFrame객체의 기본 layout은 BorderLayout이다.
		
		//패털커스터마이징
		//내부클래스로 생성하였음.
		JPanel north = new BorderPanel("북", Color.BLUE);
		JPanel south = new BorderPanel("남", Color.cyan);
		JPanel east= new BorderPanel("동", Color.red);
		JPanel west = new BorderPanel("서", Color.yellow);
		JPanel center = new BorderPanel("가운데", Color.pink);
		
		
		add(north, BorderLayout.NORTH);
		add(center);//기본이 center라 따로 지정안해줘도됨.
//		add(south, BorderLayout.SOUTH);
//		add(east, BorderLayout.EAST);
		add(west, BorderLayout.WEST);
		
		
		
	}
	
	/*
	 * 내부클래스 만들기(라벨추가하는)
	 * 내부클래스여서 외부클래스에서 자유롭게 가져다 사용할 수 있다.
	 */
	public class BorderPanel extends JPanel{
		public BorderPanel(String title, Color c) {
			setBackground(c);//배경색 지정
			JLabel label = new JLabel(title);
			add(label);//현재 JPanel객체에 추가.
		}
	}
	
	
	
	public static void main(String[] args) {
		//사이즈를 지정해줘버림.setvisible을 맨뒤에써줘야된다.
		new BorderLayoutTest(500,500,"Border LayoutTest").setVisible(true);

	}
}
