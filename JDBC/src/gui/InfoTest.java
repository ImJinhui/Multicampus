package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

class InfoTest implements ActionListener{
	
	JFrame frame;
	JTextField tf_name, tf_id, tf_tel, tf_age, tf_gender, tf_home ;
	JButton b_add, b_modify, b_search, b_delete, b_cancel, b_exit;
	JTextArea ta;	
	
	Database db;
	
	public InfoTest() {
		
		frame		= new JFrame("DBTest");
		
		tf_name		= new JTextField(15);
		tf_id		= new JTextField(15);
		tf_tel		= new JTextField(15);
		tf_age		= new JTextField(15);
		tf_gender	= new JTextField(15);
		tf_home		= new JTextField(15);
		
		b_add		= new JButton("Add", new ImageIcon("src/gui/img/add.gif"));
		b_add.setVerticalTextPosition(SwingConstants.BOTTOM);
		b_add.setHorizontalTextPosition(SwingConstants.CENTER);		
		b_add.setBorder(new BevelBorder(BevelBorder.RAISED));
		b_add.setToolTipText("입력합니다");
		
		b_modify	= new JButton("Modify");
		b_search	= new JButton("Search");
		b_delete	= new JButton("Delete");
		b_cancel	= new JButton("Cancel");
		b_exit		= new JButton("Exit");
		ta			= new JTextArea(20, 70);
		
		try {
			db = new Database();
			ta.setText("연결성공");
		} catch (Exception e) {
			ta.setText("연결실패:"+e.getMessage());
		
		}
	}
	
	void setup(){
		
		JPanel p_center  = new JPanel();
		JPanel p_west	 = new JPanel();
		JPanel p_south 	 = new JPanel();

		JLabel ll_name = new JLabel("Name", new ImageIcon("src/gui/img/cute/1.gif"),JLabel.CENTER);		
		JLabel ll_id   = new JLabel("ID",   new ImageIcon("src/gui/img/cute/2.gif"),SwingConstants.CENTER);
		JLabel ll_tel  = new JLabel("Tel",  new ImageIcon("src/gui/img/cute/3.gif"),SwingConstants.CENTER);
		JLabel ll_sex  = new JLabel("Sex",  new ImageIcon("src/gui/img/cute/4.gif"),SwingConstants.CENTER);
		JLabel ll_age  = new JLabel("Age",  new ImageIcon("src/gui/img/cute/5.gif"),SwingConstants.CENTER);
		JLabel ll_home = new JLabel("Home", new ImageIcon("src/gui/img/cute/6.gif"),SwingConstants.CENTER);
		
		
		p_west.setLayout( new GridLayout(6,2));
		p_west.add( ll_name);
		p_west.add( tf_name );
		p_west.add( ll_id);
		p_west.add( tf_id );
		p_west.add( ll_tel);
		p_west.add( tf_tel );
		p_west.add( ll_sex);
		p_west.add( tf_gender );
		p_west.add( ll_age);
		p_west.add( tf_age );
		p_west.add( ll_home);
		p_west.add( tf_home );
		

		p_center.setLayout(new BorderLayout());
		p_center.add("Center", ta );

		p_south.setLayout( new GridLayout(1,6));
		p_south.add( b_add );
		p_south.add( b_modify );
		p_south.add( b_search );
		p_south.add( b_delete );
		p_south.add( b_cancel );
		p_south.add( b_exit );
		
		frame.getContentPane().setLayout( new BorderLayout() );
		frame.getContentPane().add("West", p_west );
		frame.getContentPane().add("Center", p_center );
		frame.getContentPane().add("South", p_south );
		
		frame.pack();
		frame.setTitle("DBTest");
		frame.setVisible(true);	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void eventProc(){

		b_add.addActionListener( this );
		b_modify.addActionListener( this );
		b_search.addActionListener( this );
		b_delete.addActionListener( this );
		b_cancel.addActionListener( this );
		b_exit.addActionListener( this );
		
		tf_id.addActionListener(this);
		tf_tel.addActionListener(this);
	}

	/* 이벤트 처리 */
	public void actionPerformed( ActionEvent ev ){
		
		Object evt = ev.getSource();
		if(evt == b_add){ // 입력버튼이 눌렸을 때 
			insert();
		}else if(evt == tf_tel){ // tf_tel 에서 엔터쳤을때 
			selectByTel();
		}else if(evt == b_modify){
			modify();
		}else if(evt == b_delete){
			delete();
		}else if(evt == b_search){
			search();
		}
	}
	
	
	// 호출되는 함수들 
	
// search버튼 
	void search() {
//		JOptionPane.showMessageDialog(null, "조회");
	
		try {
			ArrayList<InfoVO> list = db.selectAll();
			ta.setText("검색결과 \n");
			for(InfoVO vo : list){
				ta.append(vo.getName() + "\t");
				ta.append(vo.getGender() + "\t");
				ta.append(vo.getTel() + "\t \t");
				ta.append(vo.getId() + "\t");
				ta.append(vo.getAge() + "\t");
				ta.append(vo.getHome() + "\n");
			}
		} catch (Exception e) {
			ta.setText("조회실패 : " + e.getMessage());
		}
	}

// 삭제버튼 	
	void delete() {
		JOptionPane.showMessageDialog(null, "삭제");
		// 1. 입력한 전화번호 얻어오기
		String tel = tf_tel.getText();
		// 2. 1번에서 입력받은 값을 Database에 delete() 전송
		try {
			db.delete(tel);
			ta.setText("삭제성공");
		} catch (Exception e) {
			ta.setText("삭제실패 : " + e.getMessage());
		}
	}

// 수정버튼 
	void modify() {
		JOptionPane.showMessageDialog(null, "수정");
		// 1. 화면에서 각각의 입력값 얻어오기
		String name = tf_name.getText();
		String id = tf_id.getText();
		String tel = tf_tel.getText();
		String gender = tf_gender.getText();
		String age = tf_age.getText();
		String home = tf_home.getText();
		
		// 2. 1번의 값들을 InfoVO 객체로 저장 : 생성자 or setter 사용 
		InfoVO info = new InfoVO(name, id, tel, gender, Integer.parseInt(age), home);
		
		// 3. Database클래스의 insertData() 호출 
		try {
			db.updateData(info);
			ta.setText("입력성공");
		} catch (Exception e) {
			ta.setText("입력실패 : "+e.getMessage());
		}
	}

// 조회버튼 
	void selectByTel() {
		// 1. 입력한 전화번호 얻어오기
		String tel = tf_tel.getText();
		// 2. 1번에서 입력받은 값을 Database에 selectBuPk() 전송
		try {
			InfoVO vo = db.selectByPk(tel);
			// 3. 2번의 결과를 화면 출력
			tf_name.setText(vo.getName());
			tf_id.setText(vo.getId());
			tf_gender.setText(vo.getGender());
			tf_home.setText(vo.getHome());
			tf_age.setText(String.valueOf(vo.getAge()));
			tf_tel.setText(vo.getTel());
		} catch (Exception e) {
			ta.setText("전화번호 검색 실패 : " + e.getMessage());
		}
	}
	
//입력버튼 
	void insert() {
		JOptionPane.showMessageDialog(null, "입력");
		// 1. 화면에서 각각의 입력값 얻어오기
		String name = tf_name.getText();
		String id = tf_id.getText();
		String tel = tf_tel.getText();
		String gender = tf_gender.getText();
		String age = tf_age.getText();
		String home = tf_home.getText();
		
		// 2. 1번의 값들을 InfoVO 객체로 저장 : 생성자 or setter 사용 
		InfoVO info = new InfoVO(name, id, tel, gender, Integer.parseInt(age), home);
		
		// 3. Database클래스의 insertData() 호출 
		try {
			db.insertData(info);
			ta.setText("입력성공");
		} catch (Exception e) {
			ta.setText("입력실패 : "+e.getMessage());
		}
	}

	public static void main(String args[]) {
		InfoTest mainFrame = new InfoTest();
		mainFrame.setup();
		mainFrame.eventProc();
	}
}
