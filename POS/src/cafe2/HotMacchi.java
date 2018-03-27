package cafe2;


public class HotMacchi extends Menu{
	static int count=0;
	private int total=4500;
	public HotMacchi() {
		// TODO Auto-generated constructor stub
	}	
	public HotMacchi(String name, int price,int total) {
	super(name,price);
	
	this.total=count*price;
	
	}	
	
	@Override
	public String toString() {
		return String.format("%5d %17s %11d %23d %25d", index, super.getName(), super.getPrice(), count, super.getPrice()*count);
	}
}
