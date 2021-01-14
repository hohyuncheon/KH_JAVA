package kh.java.gui.swing.change.panel;

import java.awt.Color;

import javax.swing.JFrame;

import kh.java.gui.util.MyUtil;

public class MainFrame extends JFrame {

	public static CustomPanel[] panels= new CustomPanel[3];
	
	public MainFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		//panels 객체 할당
		panels[0]=new CustomPanel(this, Color.green,"panel0");//this꼭필요
		panels[1]=new CustomPanel(this, Color.yellow,"panel1");//this꼭필요
		panels[2]=new CustomPanel(this, Color.pink,"panel2");//this꼭필요
		
		add(panels[0]);//초기화면
	}
}
