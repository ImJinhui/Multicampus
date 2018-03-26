package day04_0302;

public class P189 {

	public static void main(String[] args) {
		
//		int jumsu[] = null;
		int[] jumsu = null;
		jumsu = new int[5];
		
		System.out.println(jumsu); // 주소값
		System.out.println(jumsu.length); // 배열의 사이즈
//		System.out.println(jumsu[0]); // 0 => 디폴트 초기화됨
//		System.out.println(jumsu[1]);
//		System.out.println(jumsu[2]);
//		System.out.println(jumsu[3]);
//		System.out.println(jumsu[4]);
//		System.out.println(jumsu[5]);
		
		jumsu[0] = 88;
		jumsu[1] = 98;
		jumsu[2] = 89;
		jumsu[3] = 78;
		jumsu[4] = 100;
		
		String[] name = {"홍길동", "김길동", "고길동", "박길동", "강길동"};
		
		char[] grade = new char[jumsu.length];
		
		for (int i = 0; i < jumsu.length; i++) {
			grade[i] = 
			jumsu[i]>=90 ? 'A' : 
				jumsu[i]>=80 ? 'B' : 
					jumsu[i]>=70 ? 'C' : 
						jumsu[i]>=60 ? 'D' : 'F';     
						
			System.out.printf("%s**   점수 : %3d   등급: %c \n",name[i].charAt(0), jumsu[i], grade[i]); 
		}
	}

}
