package alist.doubly;

public class MainTest {
	public static void main(String[] args) {
		DList<String> s = new DList<String>(); // 이중 연결 리스트 객체 s 생성

		s.insertAfter(s.head, "apple");
		s.insertBefore(s.tail, "orange");
		s.insertBefore(s.tail, "cherry");
		s.print();
		s.insertAfter(s.head.getNext(), "pear");
		s.print();

		 s.delete(s.tail.getPrevious());
		 s.print(); 

		// s.insertBefore(s.tail,"grape");
		// s.print(); System.out.println();
		// s.delete(s.head.getNext()); s.print();
		// s.delete(s.head.getNext());s.print();
		// s.delete(s.head.getNext()); s.print();
		// s.delete(s.head.getNext());s.print();
	}
}
