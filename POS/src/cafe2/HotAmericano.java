package cafe2;


public class HotAmericano extends Menu{
	static int count=1;
	private int total;
	public HotAmericano() {
		// TODO Auto-generated constructor stub
	}	
	public HotAmericano(String name, int price,int total) {
	super(name,price);
	
	this.total=count*price;
	
	}	
	
	@Override
	public String toString() {
		return String.format(" %17s %11d %23d %25d", super.getName(), super.getPrice(), count, this.total);
	}
}
