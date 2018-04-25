package jdbc;
//####################################################
//	JTable 만들기 - TableModel을 만들어 이용하는 테이블
//				 - 생성 후 나중에 데이타모델 추가하는 방법
//----------------------------------------------------
import java.awt.Dimension; 
import javax.swing.*; 
import javax.swing.table.*; 
import java.awt.event.*;
import java.util.*;
import javax.swing.event.*;

public class JTableTableModelTest{ 

	JFrame frame;
	JTable table;
	JButton button;
	MyTableModel model;
	Vector cName = new Vector();


	public JTableTableModelTest() { 


		frame = new JFrame("테이블 테스트 1 ");
		button = new JButton(" 눌려주세요 ");

		// 기본적인 테이블 생성
		model = new MyTableModel(); // model	
		table = new JTable(model);  // view

		//table.getColumnModel().getColumn(2).setPreferredWidth(200); 

		frame.add("Center", new JScrollPane(table)); // tabel은 JScrollPane에 붙여야함   
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
		
//		table.addMouseListener(new MouseAdapter() {
//					
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				int row = table.getSelectedRow();
//				int col = table.getSelectedColumn();
//				String str = (String)table.getValueAt(row, col);
//				JOptionPane.showMessageDialog(null, row + "행"+ col + "열 : " + str);
//				
//			}
//		});
	} 
	
	void change() {
		Vector data = new Vector();
		for (int i = 0; i < 5; i++) {
			
			Vector<String> temp = new Vector<String>();
			
			for (int j = 0; j < 4; j++) {
				temp.add("<" + i + "," + j+ ">");
			}
			data.add(temp);
		}
		
		TableColumn comColumn = table.getColumnModel().getColumn(2);
		JComboBox combo = new JComboBox();
		combo.addItem("멜로");
		combo.addItem("코믹");
		combo.addItem("공포");
		comColumn.setCellEditor(new DefaultCellEditor(combo));
		
		model.data = data;
		table.setModel(model);
		model.fireTableDataChanged();
	}

	 


	public static void main(String args[]) { 
		JTableTableModelTest test = new JTableTableModelTest(); 

	} 

	class MyTableModel extends AbstractTableModel {  // 직접 만든것 AbstractTableModel을 상속받아야함 

		Vector data = new Vector();
		String [] columnNames = {"First", "Second","삼","사" };

		//=============================================================
		// 1. 기본적인 TabelModel  만들기
		// 아래 세 함수는 TabelModel 인터페이스의 추상함수인데
		// AbstractTabelModel에서 구현되지 않았기에...
		// 반드시 사용자 구현 필수!!!!

		public int getColumnCount() { 
			return columnNames.length; 
		} 

		public int getRowCount() { 
			return data.size(); 
		} 

		public Object getValueAt(int row, int col) { 
			Vector temp = (Vector)data.elementAt( row );
			return temp.elementAt( col ); 
		}

		//===============================================================
		// 2. 지정된 컬럼명으로 변환하기
		//
		//이 메소드를 오버라이딩 하지 않으면 기본적으로 A, B, C, D 라는 이름으로 컬럼명이 지정된다
		public String getColumnName(int col) { 
			return columnNames[col]; 
		} 


		//============================================================
		// 3. 한 컬럼에 String 출력이 아닌 다른 형태(Checkbox)로 변환하기
		//		(1) Boolean 형태의 값을 지닌 컬럼의 인덱스를 넘겨받음
		//		(2) 0행의 c번째 셀에 들어있는 값을 Object 형태로 넘김
		//		(3) 2번의 Object를 적용할 클래스로 변환하여 리턴
		//
		//		기본적으로 테이블에서 한 셀에 출력되는 클래스 형태는 String 클래스로
		//	   이용하는 그 것을 받아 기존의 클래스 형태로 바꿔주는 기능
		public Class getColumnClass(int c) { 
			return getValueAt(0, c).getClass(); 
		} 
		
		public boolean isCellEditable(int row, int col){
            if(col == 2 |col ==3){
                return true;
            }else {
                return false;
            }
        }
        
        public void setValueAt(Object value,int row, int col){
            Vector temp = (Vector)data.get(row);
            temp.set(col, value);
            fireTableCellUpdated(row, col);
        }

} 
}

