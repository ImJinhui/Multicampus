package day03_0228;

public class P147 {

	public static void main(String[] args) {
		System.out.println("< 성적처리 >");

		String name = "홍길동";
		int jumsu = 99;
		String grade = null;

		if(name==null || name.length() == 0 || !(jumsu>=0 && jumsu<=100)){
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		
		//등급처리 
		
		switch (jumsu/10) {
		case 10: case 9:
			grade = "A 입니다";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		}
		
		System.out.printf("이름: %s \n점수: %d \n등급: %s \n", name, jumsu, grade);
		
		switch (grade) {
		case "A 입니다":
			System.out.println("우등");
			break;
		case "F":
			System.out.println("학사경고");
			break;
		default:
			break;
		}
		
	
		
		System.out.println("성적처리 종료");
		return;
	}

}
