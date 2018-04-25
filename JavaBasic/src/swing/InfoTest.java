package swing;

import java.awt.*; // *는 class만 의미
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Calendar;

import javax.swing.*;

class Info {

	// 1. 멤버 변수 선언
	JFrame f;

	JTextField tfName;
	JTextField tfTel;
	JTextField tfJumin;
	JTextField tfGender;
	JTextField tfAge;
	JTextField tfHome;

	JTextArea ta;

	JButton bInsert;
	JButton bModify;
	JButton bDelete;
	JButton bShow;
	JButton bExit;

	// 2. 생성자 함수(모든 객체 생성)
	Info() {
		f = new JFrame("나의 프로그램");

		tfName = new JTextField();
		tfTel = new JTextField();
		tfJumin = new JTextField();
		tfGender = new JTextField();
		tfAge = new JTextField();
		tfHome = new JTextField();

		ta = new JTextArea();

		// bInsert = new JButton("Insert");

		// bInsert.setPressedIcon(img1);
		bInsert = new JButton("Insert", new ImageIcon("src\\swing\\img\\1.png"));
		bModify = new JButton("Modify", new ImageIcon("src\\swing\\img\\2.png"));
		bDelete = new JButton("Delete", new ImageIcon("src\\swing\\img\\3.png"));
		bShow = new JButton("Show", new ImageIcon("src\\swing\\img\\4.png"));
		bExit = new JButton("Exit", new ImageIcon("src\\swing\\img\\5.png"));

		bInsert.setRolloverIcon(new ImageIcon("src\\swing\\img\\5.png"));
		bInsert.setPressedIcon(new ImageIcon("src\\swing\\img\\2.png"));
		bInsert.setToolTipText("삽입");
		bInsert.setMnemonic('i'); // 단축키 : alt+i
	}

	// 3. 화면구성
	void addLayout() {
		// 왼쪽영역
		JPanel pWest = new JPanel();
		pWest.setLayout(new GridLayout(6, 2));
		pWest.add(new JLabel("이름"));
		pWest.add(tfName);
		pWest.add(new JLabel("전화번호"));
		pWest.add(tfTel);
		pWest.add(new JLabel("주민번호"));
		pWest.add(tfJumin);
		pWest.add(new JLabel("성별"));
		pWest.add(tfGender);
		pWest.add(new JLabel("나이"));
		pWest.add(tfAge);
		pWest.add(new JLabel("출신지"));
		pWest.add(tfHome);

		// 아래쪽영역
		JPanel pSouth = new JPanel();
		pSouth.add(bInsert);
		pSouth.add(bModify);
		pSouth.add(bDelete);
		pSouth.add(bShow);
		pSouth.add(bExit);

		// 전체 영역 붙이기
		f.setLayout(new BorderLayout());
		f.add(pWest, BorderLayout.WEST);
		f.add(pSouth, BorderLayout.SOUTH);
		f.add(ta, BorderLayout.CENTER);

		// 화면출력
		f.setSize(800, 600);
		f.setVisible(true);
		// f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 누르면 닫힘
	}// addLayout()

	// 이벤트 등록하는 메소드
	void eventProc() {
		// 핸들러 객체 생성
		MyBtn bHdlr = new MyBtn();
		// 이벤트 등록
		bInsert.addActionListener(bHdlr);
		bModify.addActionListener(bHdlr);
		bExit.addActionListener(bHdlr);
		bDelete.addActionListener(bHdlr);
		bShow.addActionListener(bHdlr);

		MyTxt txtHdlr = new MyTxt();
		tfTel.addActionListener(txtHdlr);

		MyWin widHdlr = new MyWin();
		f.addWindowListener(widHdlr);
		
		MyFocus focHdlr = new MyFocus();
		tfJumin.addFocusListener(focHdlr);
		tfGender.addFocusListener(focHdlr);
	}// eventProc()

	class MyFocus implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
		}

		@Override
		public void focusLost(FocusEvent e) {
			String id = tfJumin.getText();
//			JOptionPane.showMessageDialog(null, id);
			
			// 주민번호에서 7번째 문자로 성별을 구해서 tfGender창에 출력 
			char gender = id.charAt(7);
			if (gender == '2' || gender == '4' || gender == '0') {
				tfGender.setText("여자");
			} else if (gender == '1' || gender == '3' || gender == '9') {

				tfGender.setText("남자");

			} else {

				JOptionPane.showMessageDialog(null, "오류");
			}
			
			// 8번째 문자로 출신지 구해서 tfHome창에 출력 
			
			char home = id.charAt(8);
			
			switch (home) {
			case '0':
				tfHome.setText("서울");
				break;
			case '1':
				tfHome.setText("인천");
				break;
			case '2':
				tfHome.setText("경기");
				break;
			case '9':
				tfHome.setText("제주");
				break;

			default:
				tfHome.setText("기타");
				break;
			}
			
			// 나이 구해서 tfAge출력 
			String halfBirthYear = id.substring(0, 2);
			int age ;
			int birthYear;
			
			switch (gender) {
			case '2': case '1':
				birthYear = 1900;
			
				break;
			case '4': case '3':
				birthYear = 2000;
				
				break;
			case '0': case '9':
				birthYear = 1800;
				
				break;

			default:
			
				break;
				
				
			}
			Calendar c = Calendar.getInstance();
			int year = c.get(Calendar.YEAR);
			
			age = 2018 - (1900 + Integer.parseInt(halfBirthYear)) +1;
			tfAge.setText(Integer.toString(age));
			
			
		}

	}// MyFocus

	class MyWin implements WindowListener {
		/*
		 * class MyWin extends WidowAdapter{ // 이건 오버라이딩할 많은 메소드 중에서 하나만 오버라이딩
		 * 하고싶을때 이걸로 하면 됨 }
		 */
		@Override
		public void windowOpened(WindowEvent e) {

		}

		@Override
		public void windowClosing(WindowEvent e) {

			int result = JOptionPane.showConfirmDialog(null, "진짜?ㅜㅠㅠㅠ");
			if (result == JOptionPane.OK_OPTION) {
				System.exit(0);
			} else {
				f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}

		}

		@Override
		public void windowClosed(WindowEvent e) {

		}

		@Override
		public void windowIconified(WindowEvent e) {

		}

		@Override
		public void windowDeiconified(WindowEvent e) {

		}

		@Override
		public void windowActivated(WindowEvent e) {

		}

		@Override
		public void windowDeactivated(WindowEvent e) {

		}

	}// MyWin

	class MyTxt implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, tfTel.getText() + "검색");

		}

	} // MyTxt

	class MyBtn implements ActionListener {
		// 이벤트 관련 클래스 - EventHandler
		@Override
		public void actionPerformed(ActionEvent ev) {
			JButton evt = (JButton) ev.getSource();
			if (evt == bInsert) {
				JOptionPane.showMessageDialog(null, "저장");
			} else if (evt == bModify) {
				JOptionPane.showMessageDialog(null, "수정");
			} else if (evt == bExit) {
				JOptionPane.showMessageDialog(null, "종료");
				System.exit(0);
			} else if (evt == bShow) {
				JOptionPane.showMessageDialog(null, "조회");
			} else if (evt == bDelete) {
				JOptionPane.showMessageDialog(null, "삭제");
			}
		}
	}

}

public class InfoTest {

	public static void main(String[] args) {

		Info info = new Info();
		info.addLayout();

		info.eventProc();
	}

}
