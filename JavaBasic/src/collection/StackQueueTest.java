package collection;

import java.util.*;

public class StackQueueTest {

	public static void main(String[] args) {
		
	
		Stack s = new Stack();
		s.push("이효리");
		s.push("박보검");
		s.push("윤아");
		System.out.println(s);
		int num1 = s.size();
		for (int i = 0; i < num1; i++) {
			s.pop();
			System.out.println("결과 : " + s);
		}
		
		
		Queue q = new LinkedList();
		q.offer("가");
		q.offer("나");
		q.offer("다");
		
		System.out.println(q);
		int num2 = q.size();
		for (int i = 0; i < num2; i++) {
			q.poll();
			System.out.println("결과 : " + q);
		}
	}
	

}
