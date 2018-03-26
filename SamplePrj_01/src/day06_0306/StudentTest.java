package day06_0306;

import java.util.Arrays;

public class StudentTest {

	public static void main(String[] args) {
//		day05_0305.Student s1;
		Student s = new Student();
		s.name = "홍길동";
//		s.print();
		s.setSungjuk(new int[] {99, 99, 99, 99, 99});
		
		//평균을 계산하는 메소드를 호출한 후에야만 avg값을 출력할 수 있음 
		
//		System.out.println("평균 : " + s.calcAvg());
//		System.out.println("등급 : " + s.calcGrade());
		
		s.print();
		
		System.out.println("==================================");
		Student s1 = new Student();
		s1.name = "고길동";
		s1.setSungjuk(new int[]{29,38,21});
		
		Student s2 = new Student();
		s2.name = "김뿅뿅";
		s2.setSungjuk(new int[]{39,34,67});
		
		Student[] students = {s, s1, s2};
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		
		System.out.println("======");
		for (int i = 0; i < students.length-1; i++) {
			for (int j = 1; j < students.length; j++) {
				if(students[i].avg < students[j].avg){
					Student st;
					st = students[i];
					students[i] = students[j];
					students[j] = st;
				}
			}
		}
		System.out.println();
		
		
	
	
		
		
	}

}
