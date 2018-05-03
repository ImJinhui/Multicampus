package dtree.binary;

public class MainTest {

	public static void main(String[] args) {

		Node n1 = new Node("우리한국대학교", null, null);
		Node n2 = new Node("공과대학", null, null);
		Node n3 = new Node("컴퓨터공학과", null, null);
		Node n4 = new Node("정보통신학과", null, null);
		Node n5 = new Node("정보통신", null, null);
		Node n6 = new Node("정보보안", null, null);
		Node n7 = new Node("사회대학", null, null);
		Node n8 = new Node("경영학과", null, null);
		Node n9 = new Node("경제학과", null, null);
		Node n10 = new Node("경제정보", null, null);

		n1.setLeft(n2);
		n1.setRight(n7); // n1의 왼쪽 자식-> n2, n1의 오른쪽 자식-> n3
		n2.setLeft(n3);
		n2.setRight(n4); // n2의 왼쪽 자식-> n4, n2의 오른쪽 자식-> n5
		n4.setLeft(n5);
		n4.setRight(n6); // n3의 왼쪽 자식-> n6, n3의 오른쪽 자식-> n7
		n7.setLeft(n8);
		n7.setRight(n9); // n3의 왼쪽 자식-> n6, n3의 오른쪽 자식-> n7
		n9.setRight(n10); // n4의 왼쪽 자식-> n8

		Node m1 = new Node("우리한국대학교", null, null);
		Node m2 = new Node("공과대학", null, null);
		Node m3 = new Node("컴퓨터공학과", null, null);
		Node m4 = new Node("정보통신학과", null, null);
		Node m5 = new Node("정보통신", null, null);
		Node m6 = new Node("정보보안", null, null);
		Node m7 = new Node("사회대학", null, null);
		Node m8 = new Node("경영학과", null, null);
		Node m9 = new Node("경제학과", null, null);
		Node m10 = new Node("경제정보", null, null);

		m1.setLeft(m2);
		m1.setRight(m7); // n1의 왼쪽 자식-> n2, n1의 오른쪽 자식-> n3
		m2.setLeft(m3);
		m2.setRight(m4); // n2의 왼쪽 자식-> n4, n2의 오른쪽 자식-> n5
		m4.setLeft(m5);
		m4.setRight(m6); // n3의 왼쪽 자식-> n6, n3의 오른쪽 자식-> n7
		m7.setLeft(m8);
		m7.setRight(m9); // n3의 왼쪽 자식-> n6, n3의 오른쪽 자식-> n7
		m9.setRight(m10);

		BinaryTree t = new BinaryTree(); // 이진 트리 객체 t 생성
		BinaryTree t2 = new BinaryTree(); // 이진 트리 객체 t 생성
		t.setRoot(n1); // t의 루트 노드를 n1으로
		t2.setRoot(m1);
		System.out.print("트리 노드 수  = " + t.size(t.getRoot()) + "\n트리 높이      = " + t.height(t.getRoot()));
		System.out.printf("\n전위 순회:  ");
		t.preorder(t.getRoot());
		System.out.printf("\n중위 순회:  ");
		t.inorder(t.getRoot());
		System.out.printf("\n후위 순회:  ");
		t.postorder(t.getRoot());
		System.out.printf("\n레벨 순회:  ");
		t.levelorder(t.getRoot());
		System.out.println();

		System.out.println("동일성 검사:" + BinaryTree.isEqual(t.getRoot(), t2.getRoot()));

	}
}

// -------------------------------------------------------------------------------
// [ 추가 ] 아래와 같이 출력되도록
// 중위 순회: 컴퓨터공학과 공과대학 정보통신 정보통신학과 정보보안 우리한국대학교 경영학과 사회대학 경제학과 경제정보
// 후위 순회: 컴퓨터공학과 정보통신 정보보안 정보통신학과 공과대학 경영학과 경제정보 경제학과 사회대학 우리한국대학교
