package basic;

import java.util.Arrays;

public class LottoTest {

	public static void main(String[] args) {

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
		}

		System.out.println(Arrays.toString(lotto));
		// for (int i = 0; i < lotto.length; i++) {
		// System.out.print(lotto[i] + "/");
		// }

		// 0. 5줄의 2차원배열

		// 1. 총 6개 수를 합산 값이 106~170이면 "좋은 번호"라고 출력
		int sum = 0;
		for (int i = 0; i < lotto.length; i++) {
			sum += lotto[i];
		}

		if (sum <= 170 && sum >= 106) {
			System.out.println(sum + " : 좋은 번호");
		} else {
			System.out.println(sum + " : 나쁜 번호");
		}
		
		// 3. 중복 숫자 배제
		
		
				lotto[0] = (int) (Math.random() * 45 + 1);
				
				for (int i = 1; i < lotto.length; i++) {
					lotto[i] = (int) (Math.random() * 45 + 1);
					for (int j = 0; j < i; j++) {
						if(lotto[i] == lotto[j]){
							i--;
							break;
						}
					}
				}
				

				System.out.println(Arrays.toString(lotto));

		// 2. 버블 정렬을 이용하여 작은수부터 정렬
		/*for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					int temp;
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;

				}
			}
		}*/
		
	/*	for (int i = 0; i < lotto.length-1; i++) {
			
			for (int j = i+1 ; j < lotto.length; j++) {
				
				if (lotto[i] > lotto[j]) {
					int temp;
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;

				}
				
				
			}
		}
		*/
				
				for(int i = lotto.length-1; i > 0; i--){
					for(int j = 0; j <= i-1; j++){
						if(lotto[j] > lotto[j+1]){
							int temp = lotto[j];
							lotto[j] = lotto[j+1];
							lotto[j+1] = temp;
						}
					}
				}
			
				
				
		System.out.println("lotto" + Arrays.toString(lotto));
		System.out.println("====================");

		// 3. 중복 숫자 배제
		
		
		lotto[0] = (int) (Math.random() * 45 + 1);
		
		for (int i = 1; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]){
					i--;
					break;
				}
			}
		}
		

		System.out.println(Arrays.toString(lotto));
	}

}
