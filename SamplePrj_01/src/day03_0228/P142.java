package day03_0228;

import java.util.Scanner;

public class P142 {

	public static void main(String[] args) {
		
		System.out.println("< 성적처리 >");
		
		String name = null;
		int jumsu = 0;
		char grade = ' ';
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("성적처리를 끝내려면 q를 입력해주세요. 그렇지 않으면 다른키를 입력해주세요.");
		String quit = scanner.nextLine();
		
		if(quit.equals("q")){
			System.out.println("성적처리를 종료합니다.");			
		}
		
		System.out.print("이름을 입력하세요 : ");
		name = scanner.nextLine(); 
		System.out.print("점수를 입력하세요 : (예시 : 99)");
		jumsu = Integer.parseInt(scanner.nextLine());
//		jumsu = scanner.nextInt();
//		scanner.nextLine();
		
		if(name==null || name.length() == 0 || !(jumsu>=0 && jumsu<=100)){
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		
			
		if(jumsu>=80){
			System.out.println("열심히 하셨네요!");
		} else {
			System.out.println("분발하세요!");
		}
//		System.out.println(jumsu>80 ? "열심히 하셨네요!" : "분발하세요!");
		
		
		
		if(jumsu>=90 && jumsu<=100){
			grade = 'A'; 
		}else if(jumsu>=80 && jumsu<90){
			grade = 'B';
		}else if(jumsu>=70 && jumsu<80){
			grade = 'C';
		}else if(jumsu>=60 && jumsu<70){
			grade = 'D';
		}else{
			grade = 'F';
		}
		//삼항연산자로 표현 가능 
		
			
		System.out.printf("이름: %s \n점수: %d \n등급: %c \n\n", name, jumsu, grade);
		System.out.println("성적처리 종료");
		return;
	}

}
