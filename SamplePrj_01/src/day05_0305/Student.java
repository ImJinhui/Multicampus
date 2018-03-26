package day05_0305;

public class Student {
	

	// 변수, 메소드 둘 중 하나만 있거나 둘다 없어도 클래스 성립 가능 
	// 변수 멤버변수
	public String name;
	public int kor;
	public int math;
	public int eng;
	
	// 메소드
	public void display(){
		System.out.printf("이름:%s 국어:%d 수학:%d 영어:%d \n", name, kor, math, eng);
		return;
	}
}
