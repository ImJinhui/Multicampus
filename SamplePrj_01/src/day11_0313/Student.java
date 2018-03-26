package day11_0313;

public class Student {
	
	private String name;
	private int id;
	
	// 생성자
	public Student() {
		super();
	}

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	// toString() 자동생성
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	// equals()자동생성
	@Override
	public boolean equals(Object obj) {
		// instanseof 연산자 대신 
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) 
			return false;
		
		Student other = (Student) obj; 
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	


	
	
	
	
	
	
	
}
