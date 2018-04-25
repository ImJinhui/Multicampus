package	 view;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.AbstractTableModel; 
import javax.swing.text.TabExpander;

import model.VideoModel;
import model.vo.Video;


public class VideoView extends JPanel implements ActionListener
{	
	//	member field
	JTextField	tfVideoNum, tfVideoTitle, tfVideoDirector, tfVideoActor;
	JComboBox	comVideoJanre;
	JTextArea	taVideoContent;

	JCheckBox	cbMultiInsert;
	JTextField	tfInsertCount;

	JButton		bVideoInsert, bVideoModify, bVideoDelete;

	JComboBox	comVideoSearch;
	JTextField	tfVideoSearch;
	JTable		tableVideo; // JTable의 view역할
	
	VideoTableModel tbModelVideo; //JTabel의 모델 
	
	VideoModel model; // 비지니스 로직 (JDBC연결)

	//##############################################
	//	constructor method
	public VideoView(){
		addLayout(); 	// 화면설계
		initStyle();  //초기화
		eventProc();
		connectDB();	// DB연결
	}
	
	void initStyle() {
		tfVideoNum.setEditable(false);
		tfInsertCount.setEditable(false);
		
	}

	public void connectDB(){	// DB연결
		try {
			model = new VideoModel();
			System.out.println("비디오 DB 연결 성공");
		} catch (Exception e) {
			System.out.println("비디오 DB 연결 실패");
			e.printStackTrace();
		}
	}
	
	public void eventProc(){
		cbMultiInsert.addActionListener(this);
		bVideoDelete.addActionListener(this);
		bVideoInsert.addActionListener(this);
		bVideoModify.addActionListener(this);
		tfVideoSearch.addActionListener(this);
		
		tableVideo.addMouseListener(new MouseAdapter() {
	
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = tableVideo.getSelectedRow();
				int col = 0;
				String data = (String)tableVideo.getValueAt(row, col);			
				int no = Integer.parseInt(data);
				//JOptionPane.showMessageDialog(null, no);
				try {
					Video vo = model.selectbyPk(no);
					selectbyPk(vo);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}

			
		});
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object evt = e.getSource();
		
		if(evt==cbMultiInsert){ // 다중입고 체크박스 클릭시
			tfInsertCount.setEditable(cbMultiInsert.isSelected());
		}else if (evt ==bVideoInsert){
			//입고버튼이 눌렸을 때
			insertVideo();
		}else if (evt == tfVideoSearch){
			searchVideo();
		}else if (evt == bVideoModify){
			modify();
		}else if (evt == bVideoDelete){
			delete();
		}
	}
	
	private void delete() {
		Video vo = new Video();
		vo.setVideoNo(Integer.parseInt(tfVideoNum.getText()));
		vo.setVideoName(tfVideoTitle.getText());
		vo.setActor(tfVideoActor.getText());
		vo.setDirector(tfVideoDirector.getText());
		vo.setExp(taVideoContent.getText());
		vo.setGenre((String)comVideoJanre.getSelectedItem());
		
		try {
			model.delete(vo);
			JOptionPane.showMessageDialog(null, "삭제완료");
			tfVideoNum.setText(null);
			tfVideoActor.setText(null);
			tfVideoDirector.setText(null);
			tfVideoTitle.setText(null);
			taVideoContent.setText(null);
		} catch (Exception e) {
			System.out.println("삭제실패");
			e.printStackTrace();
		}
	}

	private void modify() {
		Video vo = new Video();
		vo.setVideoNo(Integer.parseInt(tfVideoNum.getText()));
		vo.setVideoName(tfVideoTitle.getText());
		vo.setActor(tfVideoActor.getText());
		vo.setDirector(tfVideoDirector.getText());
		vo.setExp(taVideoContent.getText());
		vo.setGenre((String)comVideoJanre.getSelectedItem());
		try {
			model.modifyVideo(vo);
			JOptionPane.showMessageDialog(null, "수정완료");
			tfVideoNum.setText(null);
			tfVideoActor.setText(null);
			tfVideoDirector.setText(null);
			tfVideoTitle.setText(null);
			taVideoContent.setText(null);
			
		} catch (Exception e) {
			System.out.println("수정실패 :"+ e.getMessage());
			e.printStackTrace();
		}
		
		
	}

	void selectbyPk(Video vo) {
		tfVideoNum.setText(String.valueOf(vo.getVideoNo()));
		tfVideoTitle.setText(vo.getVideoName());
		tfVideoDirector.setText(vo.getDirector()); 
		tfVideoActor.setText(vo.getActor());
		taVideoContent.setText(vo.getExp());
		comVideoJanre.setSelectedItem(vo.getGenre());

	}

	void searchVideo() {
		int idx = comVideoSearch.getSelectedIndex();
		String str = tfVideoSearch.getText();
		try {
			ArrayList data = model.searchVideo(idx, str);
			tbModelVideo.data = data;
			tableVideo.setModel(tbModelVideo);
			tbModelVideo.fireTableDataChanged();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void insertVideo() {
		Video vo = new Video();
		vo.setGenre((String)comVideoJanre.getSelectedItem());
		vo.setActor(tfVideoActor.getText());
		vo.setDirector(tfVideoDirector.getText());
		vo.setExp(taVideoContent.getText());
		vo.setVideoName(tfVideoTitle.getText());
		
		int count = Integer.parseInt(tfInsertCount.getText());
		
		try {
			model.insertVideo(vo, count);
			JOptionPane.showMessageDialog(null, "입고완료");
			tfVideoNum.setText(null);
			tfVideoActor.setText(null);
			tfVideoDirector.setText(null);
			tfVideoTitle.setText(null);
			taVideoContent.setText(null);
		} catch (Exception e) {
			System.out.println("입고실패 :"+ e.getMessage());
			e.printStackTrace();
		}
	}

	//  화면설계 메소드
	public void addLayout(){
		//멤버변수의 객체 생성
		tfVideoNum = new JTextField();
		tfVideoTitle = new JTextField();
		tfVideoDirector = new JTextField();
		tfVideoActor = new JTextField();
		
		String []cbJanreStr = {"멜로","엑션","스릴","코미디"};
		comVideoJanre = new JComboBox(cbJanreStr);
		taVideoContent = new JTextArea();
		
		cbMultiInsert = new JCheckBox("다중입고");
		tfInsertCount = new JTextField("1",5);
	
		bVideoInsert = new JButton("입고");
		bVideoModify = new JButton("수정");
		bVideoDelete = new JButton("삭제");
		
		String []cbVideoSearch = {"제목","감독"};
		comVideoSearch = new JComboBox(cbVideoSearch);
		tfVideoSearch = new JTextField(15);
		
		tbModelVideo = new VideoTableModel();
		tableVideo = new JTable(tbModelVideo);
		tableVideo.setModel(tbModelVideo);
		
		
		
		//************화면구성************
		//왼쪽영역
		JPanel p_west = new JPanel();
		p_west.setLayout(new BorderLayout());
		// 왼쪽 가운데
		JPanel p_west_center = new JPanel();	
		p_west_center.setLayout(new BorderLayout());
		// 왼쪽 가운데의 윗쪽
		JPanel p_west_center_north = new JPanel();
		p_west_center_north.setLayout(new GridLayout(5,2));
		p_west_center_north.add(new JLabel("비디오번호"));
		p_west_center_north.add(tfVideoNum);
		p_west_center_north.add(new JLabel("장르"));
		p_west_center_north.add(comVideoJanre);
		p_west_center_north.add(new JLabel("제목"));
		p_west_center_north.add(tfVideoTitle);
		p_west_center_north.add(new JLabel("감독"));
		p_west_center_north.add(tfVideoDirector);
		p_west_center_north.add(new JLabel("배우"));
		p_west_center_north.add(tfVideoActor);
		
		// 왼쪽 가운데의 가운데
		JPanel p_west_center_center = new JPanel();
		p_west_center_center.setLayout(new BorderLayout());
		// BorderLayout은 영역 설정도 해야함
		p_west_center_center.add(new JLabel("설명"),BorderLayout.WEST);
		p_west_center_center.add(taVideoContent,BorderLayout.CENTER);
		
		// 왼쪽 화면에 붙이기
		p_west_center.add(p_west_center_north,BorderLayout.NORTH);
		p_west_center.add(p_west_center_center,BorderLayout.CENTER);
		p_west_center.setBorder(new TitledBorder("비디오 정보입력"));
		
		// 왼쪽 아래
		JPanel p_west_south = new JPanel();		
		p_west_south.setLayout(new GridLayout(2,1));
		
		JPanel p_west_south_1 = new JPanel();
		p_west_south_1.setLayout(new FlowLayout());
		p_west_south_1.add(cbMultiInsert);
		p_west_south_1.add(tfInsertCount);
		p_west_south_1.add(new JLabel("개"));
		p_west_south_1.setBorder(new TitledBorder("다중입력시 선택하시오"));
		// 입력 수정 삭제 버튼 붙이기
		JPanel p_west_south_2 = new JPanel();
		p_west_south_2.setLayout(new GridLayout(1,3));
		p_west_south_2.add(bVideoInsert);
		p_west_south_2.add(bVideoModify);
		p_west_south_2.add(bVideoDelete);
		
		p_west_south.add(p_west_south_1);
		p_west_south.add(p_west_south_2);
		
		p_west.add(p_west_center,BorderLayout.CENTER);
		p_west.add(p_west_south, BorderLayout.SOUTH);   // 왼쪽부분완성
		
		// 화면구성 - 오른쪽영역
		JPanel p_east = new JPanel();
		p_east.setLayout(new BorderLayout());
		
		JPanel p_east_north = new JPanel();
		p_east_north.add(comVideoSearch);
		p_east_north.add(tfVideoSearch);
		p_east_north.setBorder(new TitledBorder("비디오 검색"));
		
		p_east.add(p_east_north,BorderLayout.NORTH);
		p_east.add(new JScrollPane(tableVideo),BorderLayout.CENTER);
		// 테이블을 붙일때에는 반드시 JScrollPane() 이렇게 해야함 
		
		
		// 전체 화면에 왼쪽 오른쪽 붙이기
		setLayout(new GridLayout(1,2));
		
		add(p_west);
		add(p_east);
		
	}
	
	//화면에 테이블 붙이는 메소드 
	class VideoTableModel extends AbstractTableModel { 
		  
		ArrayList data = new ArrayList();
		String [] columnNames = {"비디오번호","제목","장르","감독","배우"};

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
				ArrayList temp = (ArrayList)data.get( row );
		        return temp.get( col ); 
		    }
		    
		    public String getColumnName(int col){
		    	return columnNames[col];
		    }
	}

	
}


