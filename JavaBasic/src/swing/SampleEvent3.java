package swing;

import java.awt.*; // 레이아웃때문에
import java.awt.event.*;
import javax.swing.*;

// 코딩 중복 피하기 위해 아예 통으로 상속을 받아버림 
public class SampleEvent3 implements MouseListener{
	
	JFrame f = new JFrame();
	JButton b1 = new JButton("눌러라");
	JButton b2 = new JButton("누르시오");

	// 생성자함수
	SampleEvent3(){
		
	}
	
	// 화면 구성 및 화면 띄우기
	void addLayout(){
		f.setLayout(new FlowLayout());
		f.add(b1);
		f.add(b2);
		
		f.setSize(500, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//이벤트 등록 
	void eventProc(){

	// 3. 이벤트 대상과 2번의 객체와 연결 
		b1.addMouseListener(this);
		
	}
	
	// 1.이벤트 핸들러 만들기
		// (1) Listener 구현
	
		// (2) overriding 
	
	public static void main(String[] args) {
		
		SampleEvent3 se = new SampleEvent3();
		se.addLayout();
		se.eventProc();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		JOptionPane.showMessageDialog(null, "Hi~");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}
	

}

