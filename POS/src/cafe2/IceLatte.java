package cafe2;


public class IceLatte extends Menu{
	static int count=1;
	private int total;
	public IceLatte() {
		// TODO Auto-generated constructor stub
	}	
	public IceLatte(String name, int price,int total) {
	super(name,price);
	
	this.total=count*price;
	
	}	
	
	@Override
	public String toString() {
		return String.format(" %17s %11d %23d %25d",  super.getName(), super.getPrice(), count, this.total);
	}
}
