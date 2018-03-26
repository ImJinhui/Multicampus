package day02_0227;

public class P131 {

	public static void main(String[] args) {
		int jumsu = 8;
		
		boolean valid = 0<=jumsu && jumsu <=100; //점수의유효값 검사
		
		char c = valid ? 'O':'X' ;
		System.out.println("점수 유효성 여부 : " +c);
		
		System.out.println(jumsu >= 80 ? "합격" : "불합격");
		
		if(!valid){
			System.out.println("데이터 입력 오류");
			return;
		}
		
		System.out.println("우수?" + (jumsu >= 90));
		System.out.println("재시여부?" + (jumsu < 70));
		
		
		
	}

}
