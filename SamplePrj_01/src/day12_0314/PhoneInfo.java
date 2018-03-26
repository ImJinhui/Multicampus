package day12_0314;

public class PhoneInfo<T> {
	private String name;
	private T year;
	
	
	
	public PhoneInfo() {
		super();
	}

	public PhoneInfo(String name, T year) {
		super();
		this.name = name;
		this.year = year;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getYear() {
		return year;
	}

	public void setYear(T year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "PhoneInfo [name=" + name + ", year=" + year + "]";
	}
	
	
	
	
	
	
	
}
