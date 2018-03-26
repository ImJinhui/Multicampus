package day08_0308;

import java.util.Arrays;

public class Student {
	
	private String name;
	private int[] sungjuk;
	boolean flag;
	
	
	//생성자함수	
	public Student() {
		super();
	}
	public Student(String name) {
		super();
		this.name = name;
	}
	public Student(String name, int[] sungjuk) { 
		super();
		this.name = name;
		this.sungjuk = sungjuk;
	}
	
	
	//set get메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int[] getSungjuk() {
		return sungjuk;
	}
	public void setSungjuk(int[] sungjuk) {
		this.sungjuk = sungjuk;
	}
	
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	
	
	public void print(){
		System.out.printf("Student[이름:%s , 성적:%s] \n" , 
							name, Arrays.toString(sungjuk));		
	}
	

}
