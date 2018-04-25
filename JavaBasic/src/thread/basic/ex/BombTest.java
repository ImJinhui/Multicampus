package thread.basic.ex;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BombTest extends JFrame{

	private JPanel p1, p2;
	private JButton btn1, btnimg;
	private JTextArea res;
	private JLabel lb;
	private boolean inputChk;
	
	ImageIcon icBomb = new ImageIcon("src\\swing\\img\\bomb.png");
	ImageIcon icBomb2 = new ImageIcon("src\\swing\\img\\bomb2.png");
	ImageIcon icExpl = new ImageIcon("src\\swing\\img\\explosion.png");
	
	public BombTest() {
		setTitle("단일 스레드 테스트!");
		p1 = new JPanel();
		p1.add(btn1 = new JButton("Click"));
		p1.add(lb = new JLabel("Count!"));// 추가
		add(p1, "North");
		p2 = new JPanel();
		btnimg = new JButton(new ImageIcon("src\\swing\\img\\bomb.png"));
		res = new JTextArea(20, 50);
		p2.add(btnimg);
		p2.add(res);
		add(p2);
		setBounds(200, 200, 1000, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {
					@Override
					public void run() {
						for (int i = 1; i <= 10; i++) {
							if(inputChk){
								lb.setText("멈춤");
								btnimg.setIcon(icBomb2);
								inputChk = false;
								return; // 메소드 자체를 종료 
							}
							lb.setText(String.valueOf(i));
							
							if(i==10){
								btnimg.setIcon(icExpl);
							}
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				}).start();

				new Thread(new Runnable() {
					@Override
					public void run() {
						int check = JOptionPane.showConfirmDialog(null, "10초안에 확인을 누르지 않으면 폭탄이 터집니다!");
						if(check == 0){
							inputChk = true;
						}
					}
				}).start();
			}
		});
	}

	
	
	public static void main(String[] args) {
		new BombTest();
	}

}
