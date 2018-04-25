package formatter;

import java.text.DecimalFormat;

public class DecimalFormatTest {

	public static void main(String[] args) {
		double[] data = {12345.6789, 2222.22 , 99.999999, 461353467343532468.156, 46852.7836};
		
		// 1. 소수점 세자리까지만 출력 
		// 2. 정수부분 세자리마다 콤마 출력 
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		for (int i = 0; i < data.length; i++) {
			System.out.println(df.format(data[i]));
		}

	}

}
