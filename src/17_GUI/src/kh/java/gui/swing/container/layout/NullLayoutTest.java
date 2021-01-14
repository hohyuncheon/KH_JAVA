package kh.java.gui.swing.container.layout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import kh.java.gui.util.MyUtil;

public class NullLayoutTest extends JFrame {

	private JTextField id;
	private JPasswordField pwd;

	public NullLayoutTest(int w, int h, String title) {

		MyUtil.init(this, w, h, title);

		// layout 무효화 null레이아웃을 쓰겠다.
		setLayout(null);

		JLabel labelId = new JLabel("아이디");
		labelId.setBounds(50, 100, 60, 50);

		id = new JTextField();
		id.setBounds(110, 100, 200, 50);

		JLabel labelPwd = new JLabel("비번");
		labelPwd.setBounds(50, 160, 60, 50);

		// 비밀번호는 노출되지 않게 하는 방법이 있음.
		pwd = new JPasswordField();
		pwd.setBounds(110, 160, 200, 50);

		// 버튼만들어보기
		JButton btn = new JButton("로그인");
		btn.setBounds(330, 100, 100, 110);

		// 사용자 로그인버튼을 클릭했을 때 입력한 id pw값 가져오기.

		// 이벤트란 사용자가 행동하는것? 뭐 누르거나 했을시.
		// 사용자event + eventhandling
		// 1이벤트 처리객체 생성해야함.(클래스 작성)
		// 2. btn컴포넌트와 연결(binding)
		btn.addActionListener(new LoginbtnListener());
		
		add(labelId);
		add(id);
		add(labelPwd);
		add(pwd);
		add(btn);
	}

	/*
	 * JButton 용 action event handler클래스 작성 event handlier event listener //이벤트
	 * 발생했는지 감지해주는 역할
	 */
	public class LoginbtnListener implements ActionListener {
		/*
		 * JButton의 ActionEvent가 발생시 자동호출되는 메소드
		 */
		@Override
		public void actionPerformed(ActionEvent e) {

			// System.out.println("버튼을 클릭하셨습니다"); //이건성공
			// 사용자 입력 id password가져오기 실험.
			System.out.println(" id = " + id.getText());
			System.out.println(" pwd = " + new String(pwd.getPassword()));// char배열로 우선 가져온 다음에 문자열로 보기 위해서 스트링으로 바꾼것.

		}
	}

	public static void main(String[] args) {
		new NullLayoutTest(500, 500, "로그인").setVisible(true);
	}

}
