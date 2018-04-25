package basic;

public class LottoTest2 {

	public static void main(String[] args) {
		
		int[][] lotto = new int [5][6];
		
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto[i].length; j++) {
				lotto[i][j] =(int)(Math.random() * 45+ 1);
				System.out.printf("%4d",lotto[i][j]);
			}
			System.out.println();
		}
		
		// 1. 총 6개 수를 합산 값이 106~170이면 "좋은 번호"라고 출력
				int sum = 0;
				for (int i = 0; i < lotto.length; i++) {
					
				}

		
		
		

	}

}
