package basic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CardLayoutEx extends JFrame {

	PanA panA = new PanA();
	PanB panB = new PanB();
	PanC panC = new PanC();
	
	JPanel pan = new JPanel();
	CardLayout card;
	
	JButton btn = new JButton("확인");
	JButton btn2 = new JButton("확인2");
	
	
	CardLayoutEx() {
		card = new CardLayout();

		pan.setLayout(card);
		pan.add("1", panA);
		pan.add("2", panB);
		pan.add("3", panB);
		panA.add(btn2);
		

		add(pan, BorderLayout.CENTER);
		add(btn, BorderLayout.NORTH);
		setSize(300, 400);
		setVisible(true);

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				card.previous(pan);
				
				card.show(pan, "2");
				
				

			}
		});
	}

	public static void main(String[] args) {
		new CardLayoutEx();
	}
}

class PanA extends JPanel {
	PanA() {
		setBackground(Color.red);
	}
}

class PanB extends JPanel {
	PanB() {
		setBackground(Color.yellow);
	}
}

class PanC extends JPanel {
	PanC() {
		setBackground(Color.green);
	}
}