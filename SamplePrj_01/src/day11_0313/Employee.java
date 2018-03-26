package day11_0313;

public class Employee {
	
	private String name;
	private String dept;
	
	// 생성자
	public Employee() {
		super();
	}
	public Employee(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}
	
	
	// set get
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	// Object class의 toString(), equals() 오버라이딩 
	
	@Override
	public String toString() {
		
		return name + " : " + dept;
	}

	@Override
	public boolean equals(Object obj) {
		
		/*if(obj.toString().equals(this.toString())){
			return true;
		} return false;*/
		
		System.out.println(obj.toString());
		
		//다운캐스팅 후 비교
		if(!(obj instanceof Employee)){
			return false;
		}
		
		Employee target = (Employee)obj;
		
		if(this.name.equals(target.name) && dept.equals(target.dept)){
			return true;
		}
		return false;
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("finalize()수행");
	}
	
	public void close(){
		System.out.println("close()수행");
	}
	
	
}
