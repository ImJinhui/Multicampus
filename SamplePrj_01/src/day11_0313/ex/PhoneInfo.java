package day11_0313.ex;

public class PhoneInfo {
	
	private String name;
	private String phoneNumber;
	
	
	
	public PhoneInfo() {
		super();
	}
	public PhoneInfo(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof PhoneInfo)){
			return false;
		}
		
		PhoneInfo p = (PhoneInfo)obj;
		
		if(this.name.equals(p.name) && this.phoneNumber.equals(p.phoneNumber)){
			return true;
		}
		return false;
	}
	
	
	
	@Override
	public String toString() {
		
		return this.name + " : " + this.phoneNumber;
	}
	
	
	
	
	
	
	

}
