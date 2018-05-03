package dtree.binary;

public class Node<Key extends Comparable<Key>> {
	// compareTo() 를 overriding 하여 두 노드 값 비교 필요
	// key의 자료형은 comparable을 구현한 클래스만 올 수 있음 
	// 예 ) String, Integer ...+ 우리가 comparable구현한 클래스 
	private Key item;
	private Node<Key> left;
	private Node<Key> right;

	public Node(Key newItem, Node lt, Node rt) { // 노드 생성자
		item = newItem;
		left = lt;
		right = rt;
	}

	public Key getKey() {
		return item;
	}

	public Node<Key> getLeft() {
		return left;
	}

	public Node<Key> getRight() {
		return right;
	}

	public void setKey(Key newItem) {
		item = newItem;
	}

	public void setLeft(Node<Key> lt) {
		left = lt;
	}

	public void setRight(Node<Key> rt) {
		right = rt;
	}
}
