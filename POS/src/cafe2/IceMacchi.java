package cafe2;


public class IceMacchi extends Menu{
	static int count=1;
	private int total;
	public IceMacchi() {
		// TODO Auto-generated constructor stub
	}	
	public IceMacchi(String name, int price,int total) {
	super(name,price);
	
	this.total=price*count;
	
	}	
	
	@Override
	public String toString() {
		return String.format(" %17s %11d %23d %25d",  super.getName(), super.getPrice(), count, super.getPrice()*count);
	}
}
