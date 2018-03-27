package cafe2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pos implements ActionListener {

	Pos[] orderlist = new Pos[5];
	private String name;
	private int price, count, total, change; // 상품가격, 추가된 상품 개수, 상품항목당 금액, 거스름돈

	ArrayList<IceAmericano> ia= new ArrayList<IceAmericano>();
	
	
	
	JFrame f;

	// menu btn
	JButton[] menuBtn;

	// 결제 버튼
	JButton cashBtn;
	JButton cardBtn;

	// 영수증 출력 버튼
	JButton reciBtn;

	// orderList title label
	JLabel lNo, lName, lPrice, lCount, lTotal;

	// orderList label 5개
	JLabel lorder0, lorder1, lorder2, lorder3, lorder4;
	/* jin */JLabel[] olls;

	// 총금액 받은돈 거스름돈 label
	JLabel lTotal1, lTotal2, lMoney1, lMoney2, lChange1, lChange2;

	public Pos() {
		f = new JFrame();

		// 음료 메뉴
		String[] drinkMenu = { "ice아메리카노", "아메리카노", "ice카페라떼", "카페라떼", "ice코코아", "코코아", "ice마끼아또", "마끼아또" };
		menuBtn = new JButton[drinkMenu.length];

		// 메뉴버튼에 지정
		for (int i = 0; i < drinkMenu.length; i++) {
			menuBtn[i] = new JButton(drinkMenu[i]);
		}

		cashBtn = new JButton("현금");
		cardBtn = new JButton("카드");
		reciBtn = new JButton("영수증출력");

		// orderList label
		lorder0 = new JLabel("");
		lorder1 = new JLabel("");
		lorder2 = new JLabel("");
		lorder3 = new JLabel("");
		lorder4 = new JLabel("");

		/* jin */
		olls = new JLabel[] { lorder0, lorder1, lorder2, lorder3, lorder4 };

		// JLabel lNo,lName,lPrice,lCount,lTotal;
		lNo = new JLabel("번호");
		lName = new JLabel("품명");
		lPrice = new JLabel("단가");
		lCount = new JLabel("갯수");
		lTotal = new JLabel("총금액");

		// lTotal1,lTotal2,lMoney1,lMoney2,lChange1,lChange2;
		lTotal1 = new JLabel("총금액");
		lTotal2 = new JLabel("");
		lMoney1 = new JLabel("받은금액");
		lMoney2 = new JLabel("");
		lChange1 = new JLabel("거스름돈");
		lChange2 = new JLabel("");
	}

	public Pos(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}

	void addLayout() {
		// 메뉴
		JPanel pMenuList = new JPanel();
		// 카테고리

		// 메뉴
		pMenuList.setLayout(new GridLayout(2, 4));
		for (int i = 0; i < menuBtn.length; i++) {
			pMenuList.add(menuBtn[i]);
		}

		// 주문목록있는 panel
		JPanel pOderList = new JPanel();
		pOderList.setLayout(new BorderLayout());

		JPanel pNorth = new JPanel();
		pNorth.setLayout(new GridLayout(1, 5));
		pNorth.add(lNo);
		pNorth.add(lName);
		pNorth.add(lPrice);
		pNorth.add(lCount);
		pNorth.add(lTotal);

		JPanel pCenter = new JPanel();
		pCenter.setLayout(new GridLayout(5, 1));
		pCenter.add(lorder0);
		pCenter.add(lorder1);
		pCenter.add(lorder2);
		pCenter.add(lorder3);
		pCenter.add(lorder4);
		pCenter.setBackground(Color.CYAN);

		pOderList.add(pNorth, new BorderLayout().NORTH);
		pOderList.add(pCenter, new BorderLayout().CENTER);

		// 결제총금액 panel
		JPanel pTotal = new JPanel();
		pTotal.setLayout(new GridLayout(3, 2));
		pTotal.add(lTotal1);
		pTotal.add(lTotal2);
		pTotal.add(lMoney1);
		pTotal.add(lMoney2);
		pTotal.add(lChange1);
		pTotal.add(lChange2);

		// 결제 버튼 panel
		JPanel pPayment = new JPanel();
		pPayment.setLayout(new GridLayout(3, 1));
		pPayment.add(cashBtn);
		pPayment.add(cardBtn);
		pPayment.add(reciBtn);

		// 전체 영역 붙이기 panel
		f.setLayout(new GridLayout(2, 2));
		f.add(pOderList);
		f.add(pMenuList);
		f.add(pTotal);
		f.add(pPayment);
		// 화면출력
		f.setSize(800, 600);
		f.setVisible(true);

	}

	void realCreate() {

		for (int i = 0; i < orderlist.length; i++) {
			orderlist[i] = new Pos("메뉴" + i, 0);
		}
	}

	// void create(){
	//
	// for(int i=0;i<orderlist.length;i++){
	//
	// if(orderlist[i].getName().equals(menuBtn[i].getText())/*메뉴이름*/)
	// {
	//
	// int count =orderlist[i].getCount();
	// count++;
	// orderlist[i].setCount(count);
	// System.out.println(orderlist[i].getCount());
	// continue;
	// }
	//
	// orderlist[i].setName(menuBtn[i].getText());
	// orderlist[i].setPrice(3000);
	// orderlist[i].setCount(1);
	// System.out.println(orderlist[i].getName());
	// System.out.println(orderlist[i].getPrice());
	// }
	//
	// }

	void eventProc() {
		for (int i = 0; i < menuBtn.length; i++) {
			menuBtn[i].addActionListener(this);
		}
		reciBtn.addActionListener(this);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton ev = (JButton) e.getSource();
		// System.out.println("입력");
		
		if (ev == menuBtn[0]) {
		IceAmericano p = new IceAmericano("Ice아메리카노",3000,0);			
		LIST:	for (int i = 0; i < olls.length; i++) {
			IceAmericano.count++;
				if(!(olls[i].getText().equals(""))){
					if (olls[i].getText().contains("Ice아메리카노")) {
						olls[i].setText("  "+(i+1) + p.toString());
						lTotal2.setText("");
						break LIST;
					}else{						
						continue LIST;
					}	
				}else{
					Menu.index++;
					olls[i].setText("  "+(i+1)+ p.toString());
					break;
				}
			}
		}
		if (ev == menuBtn[1]) {
			HotAmericano p = new HotAmericano("Hot아메리카노",3000,0);			
			LIST:	for (int i = 0; i < olls.length; i++) {
					if(!(olls[i].getText().equals(""))){
						if (olls[i].getText().contains("Hot아메리카노")) {
							HotAmericano.count++;
							olls[i].setText("  "+(i+1)+p.toString());
							break LIST;
						}else{						
							continue LIST;
						}	
					}else{
						olls[i].setText("  "+(i+1)+p.toString());
						break;
					}
				}
		}
		if (ev == menuBtn[2]) {
			IceLatte p = new IceLatte("Ice카페라떼",4000,0);			
			LIST:	for (int i = 0; i < olls.length; i++) {
					if(!(olls[i].getText().equals(""))){
						if (olls[i].getText().contains("Ice카페라떼")) {
							IceLatte.count++;
							olls[i].setText("  "+(i+1)+p.toString());
							break LIST;
						}else{						
							continue LIST;
						}	
					}else{
						olls[i].setText("  "+(i+1)+p.toString());
						break;
					}
				}
		}
		if (ev == menuBtn[3]) {
			HotLatte p = new HotLatte("Hot카페라떼",4000,0);			
			LIST:	for (int i = 0; i < olls.length; i++) {
					if(!(olls[i].getText().equals(""))){
						if (olls[i].getText().contains("Hot카페라떼")) {
							HotLatte.count++;
							olls[i].setText("  "+(i+1)+p.toString());
							break LIST;
						}else{						
							
							continue LIST;
						}	
					}else{
						olls[i].setText("  "+(i+1)+p.toString());
						break;
					}
				}
		}

		if (ev == menuBtn[4]) {
			IceChoco p = new IceChoco("Ice초코",5000,0);			
			LIST:	for (int i = 0; i < olls.length; i++) {
					if(!(olls[i].getText().equals(""))){
						if (olls[i].getText().contains("Ice초코")) {
							IceChoco.count++;
							olls[i].setText("  "+(i+1)+p.toString());
							break LIST;
						}else{						
							continue LIST;
						}	
					}else{
						olls[i].setText("  "+(i+1)+p.toString());
						break;
					}
				}
		}
		
		if (ev == menuBtn[5]) {
			HotChoco p = new HotChoco("Hot초코",5000,0);			
			LIST:	for (int i = 0; i < olls.length; i++) {
					if(!(olls[i].getText().equals(""))){
						if (olls[i].getText().contains("Hot초코")) {
							HotChoco.count++;
							olls[i].setText("  "+(i+1)+p.toString());
							break LIST;
						}else{						
							continue LIST;
						}	
					}else{
						olls[i].setText("  "+(i+1)+p.toString());
						break;
					}
				}
		}
		if (ev == menuBtn[6]) {
			IceMacchi p = new IceMacchi("Ice마끼야또",4500,0);			
			LIST:	for (int i = 0; i < olls.length; i++) {
					if(!(olls[i].getText().equals(""))){
						if (olls[i].getText().contains("Ice마끼야또")) {
							IceMacchi.count++;
							olls[i].setText("  "+(i+1)+p.toString());
							break LIST;
						}else{						
							continue LIST;
						}	
					}else{
						olls[i].setText("  "+(i+1)+p.toString());
						break;
					}
				}
		}
		if (ev == menuBtn[7]) {
			HotMacchi p = new HotMacchi("Hot마끼야또",4500,0);			
			LIST:	for (int i = 0; i < olls.length; i++) {
					if(!(olls[i].getText().equals(""))){
						if (olls[i].getText().contains("Hot마끼야또")) {
							HotMacchi.count++;
							olls[i].setText("  "+(i+1)+p.toString());
							break LIST;
						}else{						
							continue LIST;
						}	
					}else{
						olls[i].setText("  "+(i+1)+p.toString());
						break;
					}
				}
		}// if btn7 종료
		
		if(ev==reciBtn){
			
			for(int i=0;i<olls.length;i++){
				StringTokenizer st= new StringTokenizer(olls[i].getText(), " ");
				while(st.hasMoreTokens()){
					String temp=st.nextToken();
					System.out.println(temp);
				}
				
			}
		}
		
		
		
		
	}// ActionListener

	public static void main(String[] args) {

		Pos p = new Pos();
		p.realCreate();

		p.addLayout();
		p.eventProc();

	}

}
