package formatter;

import java.text.MessageFormat;

public class MessageFormatTest {

	public static void main(String[] args) {
		
		String message = "친애하는 <{0}> {1}님 ......" + "아무쪼록 감사";
		
		String [][] data = {
				{"가나다", "사원"},
				{"나나나", "부장"},
				{"다다다", "과장"},
				{"라라라", "대리"},
				{"마마마", "사장"},
				{"사사사", "회장"},
				
		};
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(MessageFormat.format(message, data[i]));
		}

	}

}
