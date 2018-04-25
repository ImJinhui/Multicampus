package collection;

import java.util.ArrayList; // 기존 배열의 길이를 초과하는 데이터가 들어오는 경우 기존 배열 길이의 두배가 늘어남 
import java.util.Vector;

//Object[] -> Vector -> ArrayList

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList data = dataSet();
		// 출력 
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i)/*.toString()*/);
		}

	}
	
	static ArrayList dataSet(){
		
		String name = "홍길순";
		int age = 25;
		double height = 170.99;
		
		/*Object[] data = new Object[3];
		data[0] = name;
		data[1] = new Integer(age);
//		data[1] = age; // int와 Integer가 자유롭게 호환됨 
		data[2] = new Double(height);*/
		
		ArrayList data = new ArrayList();
		data.add(name);
		data.add(new Integer(age));
		data.add(new Double(height));
		return data;
	}

}
