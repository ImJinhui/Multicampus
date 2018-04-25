package awt;

import java.awt.*;
import javax.swing.*;

public class MyPro2 extends JFrame{
	// 1. 멤버변수 선언 
	JButton b1;
	JButton b2;
	
	JTextField tf;
	JTextArea ta;

//	JCheckBox cb1;
//	JCheckBox cb2;
	JRadioButton cb1, cb2;
	
//	Choice c;
	JComboBox jcb;
	JList l;
	
	public MyPro2(){
		super("나의 첫 화면2");
		// 2. 멤버변수 객체생성
		b1 = new JButton("OK");
		b2 = new JButton("Cancel");
		tf = new JTextField("text field", 20);
		ta = new JTextArea("text area");
		
		CheckboxGroup cbg = new CheckboxGroup();
//		cb1 = new JCheckBox("Female", true, cbg);
//		cb2 = new JCheckBox("Male", false, cbg);
		
		cb1 = new JRadioButton("Female", true);
		cb2 = new JRadioButton("Male",false);
		
//		c = new JChoice();
		String[] data = {"초졸", "중졸", "고졸"};
		jcb = new JComboBox(data);
		l = new JList(data);

		// 3. 화면구성
//		FlowLayout fl = new FlowLayout();
//		setLayout(fl);
		setLayout(new FlowLayout()); // 윗줄 상단부터 배치(컴포넌트 크기 중심)
//		setLayout(new GridLayout(3,2)); // 행렬에 맞춰 배치(컨테이너 크기 중심)
//		setLayout(new BorderLayout()); // 동, 서, 남, 북, 중앙 배치 (컨테이너 크기 중심)
		
		add(jcb);
		add(l);
//		add(b1, BorderLayout.WEST);
//		add(b2, BorderLayout.EAST);
//		add(tf, BorderLayout.NORTH);
//		add(ta, BorderLayout.CENTER);
//		
//		Panel p = new Panel();
//			p.add(cb1);
//			p.add(cb2);
//		add(p, BorderLayout.SOUTH);
//		add(cb1, BorderLayout.SOUTH);
//		add(cb2);
//		add(c);
//		add(l);
//		c.addItem("Kindergarden");
//		c.addItem("Elementary School");
//		c.addItem("Middle School");
//		c.addItem("High School");
//		
//		l.add("Kindergarden");
//		l.add("Elementary School");
//		l.add("Middle School");
//		l.add("High School");
		
	
		
		
		setSize(600,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyPro2 f = new MyPro2();

	}

}
