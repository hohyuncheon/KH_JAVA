package kh.java.gui.swing.component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

public class CheckBoxTest extends JFrame {

	JLabel resultLabel;

	public CheckBoxTest(int x, int y, String title) {
		MyUtil.init(this, x, y, title);

		topPanel();
		selectPanel();
		resultPanel();

	}

	private void resultPanel() {

		JPanel panel = new JPanel();
		this.resultLabel = new JLabel("아무과일도 선택하지 못하였습니다.");
		panel.add(resultLabel);
		add(panel, BorderLayout.SOUTH);
	}

	private void selectPanel() {
		JPanel panel = new JPanel();
		JCheckBox[] chks = { new JCheckBox("딸기"), new JCheckBox("아보카도"), new JCheckBox("바나나") };

		// 이벤트핸들러 처리
		for (JCheckBox chk : chks) {
			//각 checkbox객체에 이벤트리스너 바인딩함.
			chk.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					List<String> checkedList = new ArrayList<>();
					for (JCheckBox chk : chks) {
						if (chk.isSelected()) {// 체크되어있니???
							checkedList.add(chk.getText());// 체크되어있으면 텍스트
						}

						if (checkedList.isEmpty()) {//비어있으면
							resultLabel.setText("아무것도 선택하지 않았습니다");
						} else {
							resultLabel.setText(checkedList + "를 선택하셨습니다");
						}
					}
				}
			});
		}

		for (JCheckBox chk : chks) {
			panel.add(chk);
		}

		add(panel);
	}

	private void topPanel() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("과일을 선택하시오");
		panel.add(label);
		add(panel, BorderLayout.NORTH);
	}

	public static void main(String[] args) {

		new CheckBoxTest(300, 200, "체크박스").setVisible(true);

	}
}
