package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;

import model.RentModel;

public class RentView extends JPanel implements ActionListener {
	JTextField tfRentTel, tfRentCustName, tfRentVideoNum;
	JButton bRent;

	JTextField tfReturnVideoNum;
	JButton bReturn;

	RentModel model;

	RentTableModel rtModelRent;
	JTable tableRecentList;
	// JTable tableVideo;

	// VideoTableModel tbModelVideo;
	// VideoModel model;
	// tbModelVideo = new VideoTableModel();
	// tableVideo = new JTable(tbModelVideo);
	// ==============================================
	// 생성자 함수
	public RentView() {
		addLayout();
		connectDB();
		eventProc();
		search();// 미납목록 출력
		
	}

	void search() {
		ArrayList list;
		try {
			list = model.search();
			rtModelRent.data = list;
			tableRecentList.setModel(rtModelRent);
			rtModelRent.fireTableDataChanged();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void connectDB() { // DB연결
		try {
			model = new RentModel();
			System.out.println("렌트서버 연결 성공");

		} catch (Exception e) {
			System.out.println("렌트서버 연결 실패");
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object evt = e.getSource();
		if (evt == bRent) {
			String tel = tfRentTel.getText();
			String videoNo = tfRentVideoNum.getText();
			search();
		} else if (evt == bReturn) {
			String vnum = tfReturnVideoNum.getText();
			search();
		} else if (evt == tfRentTel) {

		}

	}

	public void eventProc() {
		tfRentTel.addActionListener(this);
		bRent.addActionListener(this);
		bReturn.addActionListener(this);

	}

	public void addLayout() {
		// 멤버변수의 객체 생성
		tfRentTel = new JTextField();
		tfRentCustName = new JTextField();
		tfRentVideoNum = new JTextField();
		tfReturnVideoNum = new JTextField();

		bReturn = new JButton("반납");
		bRent = new JButton("대여");
		rtModelRent = new RentTableModel();
		tableRecentList = new JTable(rtModelRent);
		// 위쪽
		JPanel p_north = new JPanel();
		p_north.setLayout(new GridLayout(1, 2));

		// 위쪽 왼쪽
		JPanel p_north_west = new JPanel();
		p_north_west.setBorder(new TitledBorder("대여"));
		p_north_west.setLayout(new GridLayout(4, 2));

		p_north_west.add(new JLabel("전 화 번 호"));
		p_north_west.add(tfRentTel);
		p_north_west.add(new JLabel("고 객 명"));
		p_north_west.add(tfRentCustName);
		p_north_west.add(new JLabel("비디오 번호"));
		p_north_west.add(tfRentVideoNum);
		p_north_west.add(bRent);

		// 위에 오른쪽
		JPanel p_north_east = new JPanel();
		p_north_east.setLayout(new BorderLayout());
		p_north_east.setBorder(new TitledBorder("반납"));
		// 위에 오른쪽에 위에
		JPanel p_north_east_north = new JPanel();
		p_north_east_north.setLayout(new BorderLayout());
		// 위에 오른쪽에 위에 가운데
		JPanel p_north_east_north_center = new JPanel();
		p_north_east_north_center.setLayout(new GridLayout(1, 3));
		p_north_east_north_center.add(new JLabel("비디오 번호"));
		p_north_east_north_center.add(tfReturnVideoNum);
		p_north_east_north_center.add(bReturn);
		p_north_east_north.add(p_north_east_north_center, BorderLayout.CENTER);

		JPanel p_north_east_north_west = new JPanel();
		p_north_east_north.add(p_north_east_north_west, BorderLayout.WEST);
		JPanel p_north_east_north_east = new JPanel();
		p_north_east_north.add(p_north_east_north_east, BorderLayout.EAST);

		p_north_east.add(p_north_east_north, BorderLayout.NORTH);
		p_north.add(p_north_west);
		p_north.add(p_north_east);

		setLayout(new BorderLayout());

		add(p_north, BorderLayout.NORTH);
		add(new JScrollPane(tableRecentList), BorderLayout.CENTER);
		// 테이블을 붙일때에는 반드시 JScrollPane() 이렇게 해야함

	}

}

class RentTableModel extends AbstractTableModel {

	ArrayList data = new ArrayList();
	String[] columnNames = { "비디오번호", "제목", "고객명", "전화번호", "반납예정일", "반납여부" };

	// =============================================================
	// 1. 기본적인 TabelModel 만들기
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
		ArrayList temp = (ArrayList) data.get(row);
		return temp.get(col);
	}

	public String getColumnName(int col) {
		return columnNames[col];
	}
}
