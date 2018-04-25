package basic;

public class BlockStopTest {

	public static void main(String[] args) {
		END: for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 1) {
					break;
					// continue; // 블럭의 끝으로
				}
				System.out.println("<" + i + "," + j + ">");
				// continue
			} // break
			System.out.println("데이터");
		}

	}

}
