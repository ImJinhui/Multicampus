package swing.ex;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class CalendarEx {

	// 1. 멤버변수 선언
	JFrame f;

	JComboBox cbY;
	JComboBox cbM;
	JComboBox cbD;

	JButton btn;

	JTextField la;

	Integer[] strY = new Integer[11];
	Integer[] strM = new Integer[12];

	int[] lastDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	Calendar c = Calendar.getInstance();
	
	
	// 2. 생성자함수 (모든 객체 선언)

	CalendarEx() {
		f = new JFrame("Calendar Test");

		int first = c.get(Calendar.YEAR) - 5;
		for (int i = 0, j = first; i < 11; i++, j++) {
			strY[i] = j;
		}

		cbY = new JComboBox(strY);

		for (int i = 0; i < 12; i++) {
			// strM[i-1] = Integer.toString(i);
			// strM[i-1] = String.valueOf(i);
			strM[i] = i + 1;
		}
		cbM = new JComboBox(strM);
		cbD = new JComboBox();

		btn = new JButton("▶▶");

		la = new JTextField(5);

		setDay();
	}

	// 3. 화면구성
	void addLayout() {
		f.setLayout(new FlowLayout());
		f.add(cbY);
		f.add(new JLabel("년"));
		f.add(cbM);
		f.add(new JLabel("월"));
		f.add(cbD);
		f.add(new JLabel("일"));
		f.add(btn);
		f.add(la);
		f.add(new JLabel("요일"));

		// 화면출력
		f.setSize(800, 600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 오늘 날짜 셋팅하기
		cbY.setSelectedItem(c.get(Calendar.YEAR));
		cbM.setSelectedItem(c.get(Calendar.MONTH)+1);
		cbD.setSelectedItem(c.get(Calendar.DATE));
	}

	// 4. 이벤트 등록
	void eventProc() {
		MyEvent eHdlr = new MyEvent();

		cbY.addActionListener(eHdlr);
		cbM.addActionListener(eHdlr);
		cbD.addActionListener(eHdlr);
		btn.addActionListener(eHdlr);

	}

	class MyEvent implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			Object evt = e.getSource();
			if (evt == cbM || evt == cbY) {
				setDay();
			} else if (evt == btn) {
				setDate();
			}

		}
	}

	void setDate() {
		// 일 구하기
		int year = (Integer) cbY.getSelectedItem();
		int month = (Integer) cbM.getSelectedItem();
		int date = (Integer) cbD.getSelectedItem();

		// 요일 구하기

		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, date);

		int dayNum = cal.get(Calendar.DAY_OF_WEEK);
		String dayOfWeek = null;
		switch (dayNum) {
		case 1:
			dayOfWeek = "일";
			break;
		case 2:
			dayOfWeek = "월";
			break;
		case 3:
			dayOfWeek = "화";
			break;
		case 4:
			dayOfWeek = "수";
			break;
		case 5:
			dayOfWeek = "목";
			break;
		case 6:
			dayOfWeek = "금";
			break;
		case 7:
			dayOfWeek = "토";
			break;

		default:
			break;
		}

		// System.out.printf("년:%d 월:%d 일:%d 요일:%s
		// \n",year,month,date,dayOfWeek);
		la.setText(dayOfWeek);

	}

	void setDay() {
		// 윤년 구하기
		int year = (Integer) cbY.getSelectedItem();
		if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
			lastDays[1] = 29;
		} else {
			lastDays[1] = 28;

		}

		// 선택한 월 값 불러오기
		int month = cbM.getSelectedIndex();
		cbD.removeAllItems();
		for (int i = 1; i <= lastDays[month]; i++) {
			cbD.addItem(i);
		}

	}
}

public class CalendarTest {
	public static void main(String[] args) {

		CalendarEx cal = new CalendarEx();

		cal.addLayout();
		cal.eventProc();

	}
}
