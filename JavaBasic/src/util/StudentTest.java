package util;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Student std = new Student();
		
		System.out.println("입력할 학생 수를 입력하세요 : ");
		int snum = scan.nextInt();
		scan.nextLine();
		
		Student[] s = new Student[snum];
		
		
		
		for (int i = 0; i < snum; i++) {
			System.out.println((i+1) + "째 학생의 성적정보를 입력");
			String info = scan.nextLine();
			
			String[] tokens = info.split(" ");
			
			s[i] = new Student(tokens[0], tokens[1], 
					Integer.parseInt(tokens[2]), 
					Integer.parseInt(tokens[3]), 
					Integer.parseInt(tokens[4]));
			s[i].calcSum();
			s[i].calcAvg();
			
			
			
		}
		
		System.out.println();
		System.out.println("[결과]");
		
		for (int i = 0; i < s.length; i++) {
			
			System.out.printf("%d째 학생의 총점은 %.2f이고, 평균은 %.2f 입니다 \n", i+1, s[i].getSum(), s[i].getAvg());
		}
		
		int sumKor=0, sumEng=0, sumMath=0;
		double avgKor=0, avgEng=0, avgMath=0;
		
		for (int i = 0; i < s.length; i++) {
			sumKor += s[i].getKor();
			sumEng += s[i].getEng();
			sumMath += s[i].getMath();
		}
		avgKor= sumKor/snum;
		avgEng= sumEng/snum;
		avgMath= sumMath/snum;
		
		
		System.out.printf("국어과목 총점은 %d이고 평균은 %.2f 입니다 \n",sumKor,avgKor);
		System.out.printf("영어과목 총점은 %d이고 평균은 %.2f 입니다 \n",sumEng,avgEng);
		System.out.printf("수학과목 총점은 %d이고 평균은 %.2f 입니다 \n",sumMath,avgMath);
		
	
	
		
		
	}

}
