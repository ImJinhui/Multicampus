package swing;

import java.awt.*; // 레이아웃때문에
import java.awt.event.*;
import javax.swing.*;

public class SampleEvent2 {
	
	JFrame f = new JFrame();
	JButton b1 = new JButton("눌러라");
	JButton b2 = new JButton("누르시오");

	// 생성자함수
	SampleEvent2(){
		
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
	// 2. 이벤트핸들러 객체 생성
//		MyListener ml = new MyListener();
		
	// 3. 이벤트 대상과 2번의 객체와 연결 : 객체 생성 안하고 함수 선언과 동시에 
	
		b1.addMouseListener(new MouseListener(){

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
				
				JOptionPane.showMessageDialog(null, "Bye~");
			}
			
		});
	
		b2.addMouseListener(new MouseListener(){

		@Override
		public void mouseClicked(MouseEvent e) {
			
			
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			JOptionPane.showMessageDialog(null, "안뇽~");
			
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
		
	});
	}
	
	// 1.이벤트 핸들러 만들기
		// (1) Listener 구현
	class MyListener implements MouseListener
	{

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
			
			JOptionPane.showMessageDialog(null, "Bye~");
		}
		
	}
		// (2) overriding 
	
	public static void main(String[] args) {
		
		SampleEvent2 se = new SampleEvent2();
		se.addLayout();
		se.eventProc();

	}

}
