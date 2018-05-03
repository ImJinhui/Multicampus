package cqueue.list;

import java.util.NoSuchElementException;

public class ListQueue<E> {
	private Node<E> front, rear;
	private int size;

	public ListQueue() { // 생성자
		front = rear = null;
		size = 0;
	}

	public int size() {
		return size;
	} // 큐의 항목의 수를 리턴

	public boolean isEmpty() {
		return size() == 0;
	} // 큐가 empty이면 true 리턴

	// --------------------------------------------
	public void add(E newItem) {
		// 새 노드 생성
		// 큐가 비어있다면 새 노드를 front와 rear로 지정
		// 비어있지 않다면 rear의 next에 새 노드 지정
		// size 증가
		Node newNode = new Node<E>(newItem, null);
		// ListQueue q = new ListQueue<>();

		if (isEmpty()) {
			front = rear = newNode;

		} else {
			rear.setNext(newNode);
			rear = newNode;
		}
		size++;

	}

	// --------------------------------------------
	public E remove() {
		if (isEmpty()) {
			throw new NoSuchElementException(); // underflow 경우에 프로그램 정지
		}

		E item = front.getItem();
		front = front.getNext();
		if (front == rear) {
			front = rear = null;
		}

		return null;
	}

	public void print() { // 큐의 항목들을 front부터 차례로 출력
		if (isEmpty())
			System.out.print("큐가 empty임");
		else
			for (Node p = front; p != null; p = p.getNext())
				System.out.print(p.getItem() + "\t ");
		System.out.println();
	}

}
