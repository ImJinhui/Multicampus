package swing;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class NumberGameMain2 {
	public static void main(String[] args) {
		// 1. 화면 구성
		NumberGameFrame2 gameFrm = new NumberGameFrame2();

		// 2. 랜덤 문자 지정하기
		gameFrm.initChar();

		// 3. 버튼에 문자 보여주기
		gameFrm.showAnswer();
	}
}

class NumberGameFrame2 extends JFrame implements ActionListener {
	// 1. 화면 구성
	int getsu = 4;
	JButton[][] la = new JButton[getsu][getsu];

	// 2. 버튼에 지정할 문자변수 선언
	ImageIcon[][] answers = new ImageIcon[getsu][getsu];

	// 5. 첫번째 선택된 버튼을 저장할 변수와 위치 변수
	JButton firstClick = null;
	int firstRow, firstCol;

	/***********************************************
	 * 1. 화면 구성
	 */
	NumberGameFrame2() {
		setLayout(new GridLayout(getsu, getsu));

		for (int row = 0; row < getsu; row++) {
			for (int col = 0; col < getsu; col++) {

				la[row][col] = new JButton();
				add(la[row][col]);

				// 버튼 각각에 이벤트 등록
				la[row][col].addActionListener(this);

				// answers[][] 초기화
				answers[row][col] = null;
			}
		}

		setSize(300, 300);
		setVisible(true);

	}

	/***********************************************
	 * 2. 문자 지정
	 */
	int imgNum;
	void initChar() {

		BACK: for (int i = 0; i < getsu * getsu;) {
			// 임의의 문자 선택 (i가 짝수일때만 선택 : 총 8번)
			if (i % 2 == 0) {
				imgNum = (int)(Math.random()*8+1);
				
				// 중복처리
				 for (int r = 0; r < getsu; r++) {
						for (int c = 0; c < getsu; c++) {
//							if () {
//								continue BACK;
//							}
						}
					}
				 
				 
			}
			// 위치 선택
			boolean ok = false;
			do {
				int row = (int) (Math.random() * getsu);
				int col = (int) (Math.random() * getsu);
				if (answers[row][col] == null) {
					answers[row][col] = new ImageIcon("src\\swing\\img\\" + imgNum + ".png");
					ok = true;
					i++;// 완벽하게 문자가 배치되었을때만 카운팅함
				}
			} while (!ok);
	
		}
	}

	/***********************************************
	 * 3. 지정된 문자를 버튼에 보여주기
	 */
	void showAnswer() {
		// 화면에 그림 보이기
		for (int row = 0; row < getsu; row++) {
			for (int col = 0; col < getsu; col++) {
				la[row][col].setIcon(answers[row][col]);
			}
		}

		/*
		 * // 처음에 답 보여주고 답을 가림 try { Thread.sleep(1000);//1초 쉼 } catch
		 * (Exception e) { }
		 * 
		 * for(int row=0; row<getsu; row++){ for(int col=0;col<getsu;col++){
		 * la[row][col].setText(null); } }
		 */
	}

	/***********************************************
	  4. 이벤트 처리
	*/
	public void actionPerformed( ActionEvent ev )
	{
		JButton evtBtn = (JButton)ev.getSource(); // 이벤트가 발생한 객체를 evtBtn에 저장 
		
		for( int i=0; i< getsu; i++ )
		{
			for( int j=0; j < getsu; j++ )
			{
				if( evtBtn == la[i][j] )
				{
					//첫번째 선택한 버튼 
					if(firstClick == null){
						firstClick = evtBtn;
						firstRow = i;
						firstCol = j;
						firstClick.setBackground(new Color(217, 65, 140));
					}else{ // 두번째 선택한 버튼 
						if(firstRow == i && firstCol == j){ // 같은 버튼 선택하면 리턴 
							return;
						}
						if(answers[firstRow][firstCol] == answers[i][j]){ // 정답인 경우 
//							JOptionPane.showMessageDialog(null, "정답!");
							firstClick.setBackground(new Color(255, 178, 245));
							evtBtn.setBackground(new Color(255, 178, 245));
							
							/*if(firstClick.equals(evtBtn)){
								JOptionPane.showMessageDialog(null, "같은것 클릭 금지!");
								firstClick.setBackground(null);
							}*/
							
						}
							
						else{ // 정답이 아닌 경우
//							JOptionPane.showMessageDialog(null, "오답!");							
							firstClick.setBackground(null);
						}
						firstClick = null; // 세번째 클릭을 다시 첫번째 클릭으로 만들기 위해
					}


//				System.out.println("<" + i + "," + j +">에 이벤트");
				}
			}

		}

	}
}