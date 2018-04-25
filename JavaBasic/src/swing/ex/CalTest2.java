package swing.ex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CalTest2 {

	
	// 1. 멤버변수 선언
	JFrame f;
	JTextArea tf;
	
	JButton bPlus;
	JButton bMinus;
	JButton bMul;
	JButton bEqual;
	JButton bDivide;
	JButton[] jbutton = null ;	
	
	int num1, num2;
	char op;
	
	// 2. 객체 생성
	CalTest2() {
		
		f = new JFrame("MyCalc");
		tf = new JTextArea(10,30);
		
		bPlus = new JButton("+");
		bMinus = new JButton("-");
		bMul = new JButton("*");
		bEqual = new JButton("=");
		bDivide = new JButton("/");
		
		jbutton = new JButton[10];
		for (int i = 0; i < jbutton.length; i++) {
			jbutton[i] = new JButton(Integer.toString(i));	
		}
		
		
		
	}
	// 3. 화면 구성 및 띄우기
	void addLayout() {
		
		// 중간영역 
		JPanel pnums = new JPanel();
		pnums.setLayout(new GridLayout(5,3));
		for (int i = 1; i < jbutton.length; i++) {
			pnums.add(jbutton[i]);
		}
		pnums.add(bPlus);
		pnums.add(jbutton[0]);
		pnums.add(bEqual);
		pnums.add(bMinus);
		pnums.add(bMul);
		pnums.add(bDivide);
		
		// 전체영역붙이기
		f.setLayout(new BorderLayout());
		f.add(tf, BorderLayout.NORTH);
		f.add(pnums, BorderLayout.CENTER);
		
		// 화면출력 
		f.setSize(800, 600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	// 4. 이벤트등록
	void eventProc() {
		
		// 핸들러 객체 생성
		Mybtn mybtn = new Mybtn();
	
		// 이벤트 등록
		
			for (int i = 0; i < jbutton.length; i++) {
				jbutton[i].addActionListener(mybtn);
			}
			
			bDivide.addActionListener(mybtn);
			bEqual.addActionListener(mybtn);
			bMinus.addActionListener(mybtn);
			bMul.addActionListener(mybtn);
			bPlus.addActionListener(mybtn);
		
		
	}
	
	class Mybtn implements ActionListener{
		

		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			// e가 버튼 누른것을 가지고온다
			JButton event = (JButton)e.getSource();
			
			for (int i = 0; i < jbutton.length; i++) {
				if(event == jbutton[i]){
					String num = jbutton[i].getText();
					tf.setText(num);
				}
			}
			
			if (event == bPlus){
				num1 = Integer.parseInt(tf.getText());
				op = bPlus.getText().charAt(0);
			} else if (event == bMinus){
				num1 = Integer.parseInt(tf.getText());
				op = bMinus.getText().charAt(0);
			} else if (event == bMul){
				num1 = Integer.parseInt(tf.getText());
				op = bMul.getText().charAt(0);
			} else if (event == bDivide){
				num1 = Integer.parseInt(tf.getText());
				op = bDivide.getText().charAt(0);
			} else if (event == bEqual){
				num2 = Integer.parseInt(tf.getText());
				int result = 0; 
				
				switch (op) {
				case '+':
					result = num1+num2;
					break;
				case '-':
					result = num1-num2;
					break;
				case '*':
					result = num1*num2;
					break;
				case '/':
					result = num1/num2;
					break;
				}
				
				
				tf.setText(Integer.toString(result));
			}
			
			
				
			
				
			
		}
	}
	
	
	public static void main(String[] args) {
		CalTest2 cal = new CalTest2();
		cal.addLayout();
		cal.eventProc();
		
		
	}
	

	
	
}
