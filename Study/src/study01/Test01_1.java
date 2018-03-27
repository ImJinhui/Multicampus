package study01;

import java.util.*;

public class Test01_1 {

	public static void main(String[] args) {
		//Scanner 입력받기
		Scanner scan = new Scanner(System.in);

		System.out.println("입력");
		String str = scan.nextLine();

		// 배열 3개 선언 
		char[] testCase = new char[str.length()];
		int[] testCaseNum = new int[testCase.length];
		int[] result = new int[testCaseNum.length];
		
		// testCase에 입력받은 문자들을 저장하고, 이를 변환해 testCaseNum에 저장
		for (int i = 0; i < testCase.length; i++) {
			testCase[i] = str.charAt(i);
			if (testCase[i] == 'O') {
				testCaseNum[i] = 1;
			} else {
				testCaseNum[i] = 0;

			}
		}
		
		// testCaseNum을 result배열에 복사
		System.arraycopy(testCaseNum, 0, result, 0, testCaseNum.length);
		
		
		// testCaseNum배열의 값들을 비교한 후 연산을 거쳐 result에 저장 
		for (int j = 0; j < testCase.length-1; j++) {
			if (testCaseNum[j] == 1 && testCaseNum[j + 1]==1) {
				result[j+1] = result[j]+1;
			}
			
		}
		
		// result배열에 있는 값을 더함
		int sum=0;
		for (int i = 0; i < result.length; i++) {
			sum += result[i];
		}
	
		System.out.println(Arrays.toString(testCase));
		System.out.println(Arrays.toString(testCaseNum));
		System.out.println(Arrays.toString(result));
		System.out.println(sum);

	}

}
