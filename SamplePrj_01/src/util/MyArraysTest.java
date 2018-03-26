package util;

public class MyArraysTest {

	public static void main(String[] args) {
		
		int[] sungjuk = {90, 88, 33,66,74,34,100,34,42};
		MyArrays.print(sungjuk);
		
		MyArrays.sort(sungjuk); // 데이터 원본 자체를 바꾸어버림  (바꾸고 싶지 않으면 메소드를 다시 작성)
		MyArrays.print(sungjuk);
		MyArrays.print(MyArrays.sort(sungjuk));// 복사본출력
	}

}
