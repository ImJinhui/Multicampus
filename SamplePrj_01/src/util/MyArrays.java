package util;

public class MyArrays {
	
	/**
	 * 
	 * @param src 정렬할 배열의 주소
	 * @return 정렬된 결과
	 */
	
	/*
	public static void sort(int[] data) { // 내림차순

		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] < data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
	}
	*/
	
	public static int[] sort(int[] src) { // 내림차순
		int[] data = new int[src.length];
		System.arraycopy(src, 0, data, 0, src.length); // 데이터 복사 
		
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] < data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		
		return data;
	}
	
	
	public static void print(int[] data){
		
		System.out.print("[");
		
		for (int i = 0; i < data.length; i++) {
			
			System.out.print(data[i] + ",");
			
			if(i == data.length-1){
				System.out.print(data[i]);
			}
			
		}
		
		
		System.out.println("]");
	}

}
