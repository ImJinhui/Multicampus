package dtree.binary;

import java.util.*;

public class BinaryTree<Key extends Comparable<Key>> {
	private Node root;

	public BinaryTree() {
		root = null;
	} // 트리 생성자

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node newRoot) {
		root = newRoot;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void preorder(Node n) { // 전위 순회
		if(n!=null){
			System.out.print(n.getKey() + "\t");
			preorder(n.getLeft());
			preorder(n.getRight());
		}
	}

	public void inorder(Node n) { // 중위 순회
		if(n!=null){
		inorder(n.getLeft());
		System.out.print(n.getKey() + "\t");
		inorder(n.getRight());
		}

	}

	public void postorder(Node n) { // 후위 순회
		if(n!=null){
			postorder(n.getLeft());
			postorder(n.getRight());
			System.out.print(n.getKey() + "\t");
					
		}
	}

	public void levelorder(Node root) { // 레벨 순회
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()){
			Node temp = q.remove();
			System.out.print(temp.getKey() + "\t");
			if(temp.getLeft() != null){
				q.add(temp.getLeft());
			}
			if(temp.getRight() != null){
				q.add(temp.getRight());
			}
		}
		
	}
	public static boolean isEqual(Node n, Node m){
		if(n==null || m==null){
			return n==m;
		}
		
		if(n.getKey().compareTo(m.getKey()) !=0 ){
			return false;
		}
		
		return isEqual(n.getLeft(), m.getLeft()) && isEqual(n.getRight(), m.getRight());
	}

	public int size(Node n) { // n를 루트로하는 (서브)트리에 있는 노드 수
		if (n == null)
			return 0; // null이면 0 리턴
		else
			return (1 + size(n.getLeft()) + size(n.getRight()));
	}

	public int height(Node n) { // n를 루트로하는 (서브)트리의 높이
		if (n == null)
			return 0; // null이면 0 리턴
		else
			return (1 + Math.max(height(n.getLeft()), height(n.getRight())));
	}

}
