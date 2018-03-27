package study01;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {

		char[] testCase = { 'O', 'O','O','O','X','O','O','O','O','X','O','O','O','O','X'};
		int[] testCaseNum = new int[testCase.length];
		int[] temp = new int[testCase.length];
		int sum = 0;
		
		for (int i = 0; i < testCase.length; i++) {
			if (testCase[i] == 'X') {
				testCaseNum[i] = 0;
			} else {
				testCaseNum[i] = 1;
			}

//			System.out.print(testCaseNum[i]);
		}
//		System.out.println();
		

		System.arraycopy(testCaseNum, 0, temp, 0, testCaseNum.length);
		
		

			for (int j = 0; j < testCase.length-1; j++) {
				if (testCaseNum[j] == 1 && testCaseNum[j + 1]==1) {
					temp[j+1] = temp[j]+1;
				}
				
			}
			
			System.arraycopy(temp, 0, testCaseNum, 0, temp.length);
		
			
			System.out.println("testCaseNum : " + Arrays.toString(testCaseNum));
			System.out.println("temp : " + Arrays.toString(temp));

		for (int i = 0; i < testCaseNum.length; i++) {
			sum += testCaseNum[i];
		}

		System.out.println(sum);
		
		
	}

}
