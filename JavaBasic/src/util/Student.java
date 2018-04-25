package util;

public class Student {

	private String name, id;
	private int kor, eng, math;
	
	double sum, avg;
	
	public Student() {
		super();
	}
	
	
	
	public Student(String name, String id, int kor, int eng, int math) {
		super();
		this.name = name;
		this.id = id;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}








	public void calcSum(){
		this.sum = this.kor + this.eng + this.math;
		
	}
	
	public void calcAvg(){
		this.avg = sum/3;
		
	}
	
	

	
	
	
	
	
}
