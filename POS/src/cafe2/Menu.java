package cafe2;

import java.util.Arrays;
import java.util.Scanner;
public class Menu {
	public static int index=1;
	Menu[] orderlist = new Menu[5];
	private String name = "메뉴";
	private int price, change; // 상품가격, 추가된 상품 개수, 상품항목당 금액, 거스름돈
	
	private int[] getMoney = {5000,10000,50000}; // 받은돈 : 5000, 10000, 50000원
		String list = "";
	public Menu() {
		super();
	}
	
	public Menu(String name, int price) {
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

	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}
	
	int total(){
		
		return 0;
	}
	void realCreate(){
		
		
	}
	
//	void create(){
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("메뉴이름");
//		String tempname= sc.nextLine();
//		for(int i=0;i<orderlist.length;i++){
//		
//			if(orderlist[i].getName().equals(tempname)/*메뉴이름*/)
//			{
//			
//				int count =orderlist[i].getCount();
//				count++;
//				orderlist[i].setCount(count);
//				System.out.println(orderlist[i].getCount());
//				continue;
//			}
//						
//			orderlist[i].setName(tempname);
//			orderlist[i].setPrice(3000);
//			orderlist[i].setCount(1);
//			System.out.println(orderlist[i].getName());
//			System.out.println(orderlist[i].getPrice());
//		}
//		
//	}
	public static void main(String[] args) {

		Menu p = new Menu();
		p.realCreate();
		//p.create();
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
//		return  this.getName()+this.price+this.count+this.total;
}
	
