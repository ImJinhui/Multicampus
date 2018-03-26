package day04_0302;

public class P194 {

	public static void main(String[] args) {
		
		int[] num = {77,99,88,40,100};
		
		// 위치인덱스가 있는 경우에만 사용가능 
		for (int i = 0; i < num.length; i++) { 
			System.out.printf("%3d ",num[i]);			
		}
		
		System.out.println("\n======================================");
		// 위치 인덱스가 없는 경우에도 사용가능
//		for(int data : num){
//			System.out.print(data+" ");
//		}
		
		int[] temp = new int[num.length*2];
		//배열복사 
		System.arraycopy(num, 0, temp, 0, num.length); // 주소는 항상 object
		for (int data: temp){
			System.out.printf("%3d ",data);
		}
		
		System.out.println("\n========================================");
		
//		String[] name = {"홍길동", "박보검", "고길동"};
		String[] name = {};
		System.out.println("name length : " + name.length);
		for(String data : name){
			System.out.println(data.charAt(0)+"**");
		}
		
		int[] jumsu = null; // jumsu. 사용 불가
		jumsu = new int[0]; // jumsu. 사용 가능 
	}

}

