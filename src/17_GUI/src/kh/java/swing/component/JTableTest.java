package kh.java.swing.component;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import kh.java.gui.util.MyUtil;

/**
 * JTable(TableModel) 
 * 	- TableModel 데이터가 저장되는 객체, 이벤트핸들링
 * JScrollPane(JTable)을 추가
 * 	- 헤더부 노출, 스크롤기능 이용
 */

public class JTableTest extends JFrame {

	public JTableTest(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		//컬럼정보
		Object[] columnNames = {
			"이름", "주소", "나이", "결혼여부"
		};
		
		//행정보(data)
		Object[][] rowData = {
				{"홍길동", "서울", 24, false},	
				{"신사임당", "부산", 48, true},	
				{"세종", "서울", 67, true},	
		};
		
		//테이블 생성
		JTable table = new JTable(rowData, columnNames);
		
		//헤더 클릭시 정렬기능
		table.setAutoCreateRowSorter(true);
		
		//스크롤페인에 추가
		JScrollPane scrollPane = new JScrollPane(table);
		
		//셀 편집시 이벤트 처리하기
		TableModel model = table.getModel();
		model.addTableModelListener(new TableModelListener() {

			@Override
			public void tableChanged(TableModelEvent e) {
				int row = e.getFirstRow();
				int col = e.getColumn();	
				Object data = model.getValueAt(row, col);
				System.out.println(data);
			}
			
		});
		
		add(scrollPane);
	}

	public static void main(String[] args) {
		new JTableTest(500, 200, "JTable").setVisible(true);
	}

}