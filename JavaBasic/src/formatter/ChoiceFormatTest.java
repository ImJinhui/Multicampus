package formatter;

import java.text.ChoiceFormat;

public class ChoiceFormatTest {

	public static void main(String[] args) {
		// 국영수 점수로 학점출력
		
		int kor = 100, eng = 80, math=70;
		double sum = kor + eng + math;
		double avg = sum/3;
		
		double[] limits = {60,70,80,90};
		String[] grades = {"D", "C", "B","A"};
		
		ChoiceFormat cf = new ChoiceFormat(limits, grades);
		
		System.out.println(kor + ":" + cf.format(kor));
		System.out.println(eng + ":" + cf.format(eng));
		System.out.println(math + ":" + cf.format(math));
		System.out.println(avg + ":" + cf.format(avg));
		

	}

}
