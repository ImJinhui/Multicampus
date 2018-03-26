package day01_0226;

public class Test01 {

	public static void main(String[] args) {
		
		//자바 컴파일러는 연산자를 기준으로 양 옆의 데이터의 타입을 일치시키려고함 
		
		//int money = 500; // 변수선언
		int money = (int)500.5; // 캐스팅(실수형을 정수형으로 바꾸면서 소수점 이하를 잘라버림)
		money = money + 700;
		System.out.println("money : "+ money);
		
		System.out.println(300+300+300+"원"); //(스트링+인트) 스트링머지
		
		System.out.println("원"+300+300+300);
		System.out.println("원"+(300+300+300)); // 우선순위 지정은 ()로 함 
		
		double pi = 3.14;
		System.out.println("반지름이 3인 원의 면적 : " + pi*3*3); //*가 +보다 우선순위 & 3이 double로 바뀜
		
		String name = new String("hong gil dong");
		System.out.println(name);
		System.out.println(name.toUpperCase());
		System.out.println(name.length());
	}

}
