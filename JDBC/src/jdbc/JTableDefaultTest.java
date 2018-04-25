package jdbc;
import javax.swing.*; 
import javax.swing.table.*; 
import java.awt.event.*;
import java.util.*;
import javax.swing.event.*;
//
//	JTable 만들기 - TableModel을 만들어 이용하는 테이블
//				 - 생성 후 나중에 데이타모델 추가하는 방법
//----------------------------------------------------
public class JTableDefaultTest{ 

	JFrame frame;
	JTable table;
	JButton button;

	DefaultTableModel model;
	Vector data = new Vector(); // 내용과 컬럼이름은 vector 
	Vector columnNames = new Vector();

	public JTableDefaultTest() { 


		frame = new JFrame("테이블 테스트 1 ");
		button = new JButton(" 눌러주세요 ");

		//  테이블의 제목 생성
		columnNames.add("첫");
		columnNames.add("첫2");
		columnNames.add("첫3");
		columnNames.add("첫4");
		model = new DefaultTableModel(data, columnNames); 	
		
		table = new JTable(model); 
//		table = new JTable(); // 화면만 만들어짐 
		
		//table.getColumnModel().getColumn(2).setPreferredWidth(200); 

		frame.add("Center", new JScrollPane(table)); // 반드시 JScrollPane에 붙여야 table이 뜸 
		frame.add("South", button); 
		frame.setSize(800,200); 
		frame.setVisible(true); 
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				change();
			}

			
		});
		model.addTableModelListener(new TableModelListener() {
			
			@Override
			public void tableChanged(TableModelEvent e) {
				JOptionPane.showMessageDialog(null, "이벤트");
			}
		});
		
		table.addMouseListener(new MouseAdapter() {
					
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				int col = table.getSelectedColumn();
				String str = (String)table.getValueAt(row, col);
				JOptionPane.showMessageDialog(null, row + "행"+ col + "열 : " + str);
				
			}
		});
	} 
	
	void change() {
		for (int i = 0; i < 5; i++) {
			
			Vector<String> temp = new Vector<String>();
			
			for (int j = 0; j < 4; j++) {
				temp.add("<" + i + "," + j+ ">");
			}
			data.add(temp);
		}
		model.setDataVector(data, columnNames);
		table.setModel(model);
		//model.fireTableDataChanged();
	}


	public static void main(String args[]) { 
		JTableDefaultTest test = new JTableDefaultTest(); 
	} 
}