import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import kh.java.gui.util.MyUtil;
import model.vo.Todo;
public class PlanerFrame extends JFrame{
	private String mission;
	Calendar time = new GregorianCalendar();
	Calendar now = new GregorianCalendar();
	List<Todo> list = new ArrayList<>();
	{
		list.add(new Todo(mission));
	}
	public PlanerFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		ImagePanel panel = new ImagePanel("img/2_background.png");
		JButton pushBtn = new JButton("시작하기");
		JLabel mainTitle = new JLabel(new ImageIcon("img/title.png"));
		setLayout(null);
		panel.setBounds(0, 0, 600, 800);
		mainTitle.setBounds(0, 0 , 600,800);
		pushBtn.setBounds(225, 600, 150, 50);
		pushBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainTitle.setVisible(false);
				pushBtn.setVisible(false);
				appStart();
//				dispose(); // 화면 전환
			}
		});
		add(mainTitle);
		add(panel);
		add(pushBtn);
	}
	public void appStart() {
		JPanel tablePanel = new JPanel();
		tablePanel.setBounds(0, 0, 500, 400);
		tablePanel.setBackground(new Color(100,150,100));
		tablePanel.setVisible(true);
		//tablePanel 안에 table을 담았는데, 콘솔1 출력되는것도 확인이 되는데
		//화면에 안나와용 이부분
		Object[] columnNames = {
				"순서","오늘 해야 할 일", "최근 완료일" 
		};
		Object[][] rowDate = new Object[list.size()][columnNames.length];
		for (int i = 0; i < list.size() ; i++) {
			Todo t = list.get(i);
			rowDate[i][0] = i;
			rowDate[i][1] = t.getDo();
			rowDate[i][2] = (time.get(Calendar.DATE))-now.get(Calendar.DATE);
		}
		while(true){
			int rnd = (int)((Math.random()*8)+1);
			switch(rnd){
			case 1 :
				mission = "방 청소"; 
				break;
			case 2 :
				mission = "빨래";
				break;
			case 3 : 
				mission = "화장실 청소";
				break;
			case 4 : 
				mission = "책상 정리";
				break;
			case 5 :
				mission = "컴퓨터 청소";
				break;
			case 6 : 
				mission = "옷장 정리";
				break;
			case 7 :
				mission = "산책";
				break;
			case 8 : 
				mission = "독서";
				break;
			}
			break;
		}
		JTable table = new JTable(rowDate, columnNames);
		table.setAutoCreateRowSorter(true);
		TableModel model = table.getModel();
		model.addTableModelListener(new TableModelListener() {
			@Override
			public void tableChanged(TableModelEvent e) {
				int row = e.getFirstRow();//Returns the first row that changed	
				int col = e.getColumn();
//				System.out.println(row + ", " + col);
				Object data = model.getValueAt(row, col);
//				System.out.println(data);
			}
		});
		tablePanel.add(table);
		add(tablePanel);
	}
	public class ImagePanel extends JPanel{
		private BufferedImage img;
		private int w;
		private int h;
		public ImagePanel(String fileName) {
			try {
				img = ImageIO.read(new File(fileName));
				w = img.getWidth();
				h = img.getHeight();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		/**
		 * 현재 패널 크기를 백그라운드 이미지의 크기로 지정
		 */
		@Override
		public Dimension getPreferredSize() {
			return new Dimension(w, h);
		}
		@Override
		public void paintComponent(Graphics g) {
			//void javax.swing.JComponent.paintComponent(Graphics g)
			super.paintComponent(g);
			//img 객체를 x,y 값만큼 떨어뜨려(offset) 그리기 메소드
			//boolean java.awt.Graphics.drawImage(Image img, int x, int y, ImageObserver observer)
			g.drawImage(img, 0, 0, null);
		}
	}
}