package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx3 {

	public static void main(String[] args) {
		
		ArrayList<Student> data = dataSet();
		
		// 오리지널 for문
		/*for (int i = 0; i < data.size(); i++) {
			Student s = (Student)data.get(i);
			System.out.println(data.get(i));
			
		}*/
		
		// 향상된 for문 : 제너릭 선언시 사용가능, 일일이 형변환해줄 필요가 없음 
		/*for (Student s : data) {
			System.out.println(s);
		}*/
		
		// Collection 전체 표준 출력 방식 (Enumeration -> Iterator)
		
		Iterator<Student> it = data.iterator();
		while (it.hasNext()){
			Student s =it.next();
			System.out.println(s);
		}
		

	}

	static ArrayList<Student> dataSet() {
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("송혜교", 25));
		list.add(new Student("아이유", 27));
		list.add(new Student("아이린", 22));
		
		return list;
		
	}

}

