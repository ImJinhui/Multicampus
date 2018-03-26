package day06_0306;

import java.util.Arrays;

import day07_0307.Car;

public class Student {
	
//	int kor, math, eng;
//	int[] sungjuk = new int[3];
	private int[] sungjuk;
	
	public void setSungjuk(int[] sungjuk){
		this.sungjuk = sungjuk;
	}
	
	public int[] getSungjuk(){
		 return this.sungjuk;
	}
	
	String name;
	
	
	private Car c;
	
	public void setCar(Car c){
		this.c = c;
	}
	public Car getCar(){
		return this.c;
	}
	
	
	double avg;
	char grade;
	
	public void print(){
		System.out.print("이름 : " + this.name);
		System.out.println("     성적 :" + Arrays.toString(sungjuk));
		System.out.printf("평균 : %5.2f   등급 : %c  \n" , this.calcAvg(), this.calcGrade());
		
	}
	
	public double calcAvg(){
		if(sungjuk == null || sungjuk.length == 0){
			return 0.0;
		}
		double sum = 0;
		for (int i = 0; i < sungjuk.length; i++) {
			sum += sungjuk[i];
		}
		this.avg = sum/sungjuk.length;
		return avg;
		
	}
	
	public char calcGrade(){
		
		double data = this.calcAvg();
		
//		switch ((int)(this.avg/10)) {
		switch((int)data/10){
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		
		}
		return grade;
	}
	
	
}
