package bstack.list;

import java.util.Scanner;

import alist.asingle.Node;
import alist.asingle.SList;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		SList<Student> s = new SList();
		
		Student first = new Student(scan.nextLine(), null);
		
		Student a = new Student(scan.nextLine(), null);
		Student b = new Student(scan.nextLine(), null);
		
		if(a.compareTo(first) > 0){
			System.out.println(a + "가 크다");
		}else if(a.compareTo(first) < 0){
			System.out.println(a + "가 작다");
		}else if(a.compareTo(first) == 0){
			System.out.println(a + "와" +b+"는 같다");
		}
	}
	
	static class Student implements Comparable<Student>{
		String name;
		Student next;
		
		Student(String name, Student next){
			this.name = name;
			this.next = next;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Student getNext() {
			return next;
		}

		public void setNext(Student next) {
			this.next = next;
		}

		@Override
		public int compareTo(Student o) {
			
			return this.name.compareTo(o.name);
		}
		
	}

}
