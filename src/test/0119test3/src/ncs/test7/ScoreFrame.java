package ncs.test7;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ScoreFrame extends JFrame {

	int num1 =0;	//자바 택스트 필드에 넣는 점수
	int num2 =0;	//Sql 택스트 필드에 넣는 점수
	
	Font font = new Font("HY견고딕", Font.BOLD, 30);
	
	JTextField jt1 = new JTextField();
	JTextField jt2 = new JTextField();
	JTextField jt3 = new JTextField();
	JTextField jt4 = new JTextField();
	
	JFormattedTextField jf = new JFormattedTextField();
	
	public ScoreFrame() {
		
		jf.setBounds(0,0,900,900);
		add(jf);
		// 프레임
		JFrame jf = new JFrame();

		jf.setTitle("문제 7");
		jf.setBounds(0, 0, 400, 400);

		JLabel jl0 = new JLabel("점수를 입력하세요");
		jl0.setBounds(50, 10, 400, 50);
		jl0.setFont(font);
		jf.add(jl0);

		JLabel jl1 = new JLabel("자바 : ");
		jl1.setBounds(10, 75, 50, 10);
		jf.add(jl1);
		jt1.setBounds(60, 70, 100, 20);
		jf.add(jt1);
		
		JLabel jl2 = new JLabel("SQL : ");
		jl2.setBounds(190, 75, 50, 10);
		jf.add(jl2);
		jt2.setBounds(250, 70, 100, 20);
		jf.add(jt2);
		
		JLabel jl3 = new JLabel("총점 : ");
		jl3.setBounds(10, 265, 50, 10);
		jf.add(jl3);
		jt3.setBounds(60, 260, 100, 20);
		jf.add(jt3);

		JLabel jl4 = new JLabel("평균 : ");
		jl4.setBounds(190, 265, 50, 10);
		jf.add(jl4);
		jt4.setBounds(250, 260, 100, 20);
		jf.add(jt4);

		//계산하기 버튼
		JButton jb = new JButton("계산하기");
		jb.setBounds(130, 150, 120, 40);
		jf.add(jb);
		
//		버튼을 눌렀을 때 실행되는 것.
		jb.addActionListener(new ActionHandler());

		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	}
	public class ActionHandler implements ActionListener {
	
		@Override
		public void actionPerformed(ActionEvent e) {
			
			num1= Integer.parseInt(jt1.getText()); // 자바 택스트 필드의  쓴 값을 상위 클래스 num1에 인트값으로 변환하여 넣는코드
			num2= Integer.parseInt(jt2.getText()); // sql 택스트 필드에 쓴 값을 상위 클래스 num2에 인트값으로 변환하여 넣는코드
			
			int sum = num1+num2;; //인트값으로 바꾼 값을 합계 구한다
			int avereage = sum/2;; //인트값으로 바꾼 값을 평균을 구한다.
			
			String a = Integer.toString(sum); //인트값으로 바꾼걸 textfield에 넣기 위해 스트링으로 변환한다
			String b = Integer.toString(avereage);  //인트값으로 바꾼걸 textfield에 넣기 위해 스트링으로 변환한다
			
			jt3.setText(a); //합계 택스트 필드창에 셋팅한다
			jt4.setText(b); //평균 택스트 필드창에 셋팅한다
		}
	}
}
