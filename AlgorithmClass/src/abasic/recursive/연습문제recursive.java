package abasic.recursive;

public class 연습문제recursive {
	
	public static void main(String[] args) {
		abc(78);
	}

	// 19. f(4)를 호출한다면?
	public static void f ( int N ) {
		System.out.println(N);
		if( N > 0 ) f ( N-1);
	}
	
	// 20. g(4)를 호출한다면?
	public static void g ( int N) {
		if( N > 0 ) g( N-1);
		System.out.println(N);
	}
	
	// 21. h(4)를 호출한다면?
	public static void h ( int N ) {
		System.out.println(N);
		if( N > 0 ) h ( N -2 );
		System.out.println(N);
	}
	
	// 22. hh(4)를 호출한다면?
	public static void hh ( int N ) {
		if( N > 0 ) {
			hh ( N-1);
			System.out.println(N);
		}
	}
	
	// 23. abc(78)을 호출한다면?
	public static void abc( int N) {
		int r = N % 2;
		System.out.println("*");
		if( N >= 2 ) abc ( N/2);
		System.out.printf("%d", r);
		return;
	}
	
	// 24. test ("110100111", 4 )호출한다면?
	public static  int test( String s, int last ) {
		if( last < 0 ) return 0;
		if( s.charAt(last) == '0') return 2 * test ( s, last -1 );
		return 1 + 2 * test ( s, last - 1);
	}
	
	// 25. 무엇을 계산하는 함수인가???
	public static void t ( int N ) {
		if( N > 0 ) t ( N/2);
		System.out.println( N % 2);
	}
}
