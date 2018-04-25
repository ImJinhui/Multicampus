package collection;

import java.util.*;

public class MapEx {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("javassem", "1111");
		map.put("kimjava", "1111");
		map.put("javababo", "9999"); // key가 중복되어서 없어짐 
		map.put("javababo", "1234");
		System.out.println(map);
		
		Scanner input =  new Scanner(System.in);
		boolean stop = false;
		while(!stop){
			System.out.println("아이디 입력 : ");
			String id = input.nextLine();
//			System.out.println("비밀번호 입력 : ");
//			String pw = input.nextLine();
			
			// 1-1. 입력받은 아이디가 있다면
			if(map.containsKey(id)){
				if(map.containsKey(id)){ //2-1. id값의 value를 얻어와서 비밀번호와 일치하면 로그인 성공 출력하고 종료
					System.out.println("비밀번호 입력 : ");
					String pw = input.nextLine();
					if(pw.equals(map.get(id))){
						System.out.println("로그인 성공");
					}else{
						System.out.println("비밀번호가 일치하지 않습니다");
					}

				}else{ //2-2. 틀리면 다시 입력받음
				
					continue;
				}
			}else{ // 1-2. 입력받은 아이디가 없다면 
				System.out.println("존재하지 않는 아이디입니다");
				continue; // 다시 반복문 돌림
//				break; // 멈춤
			}
		}
		
		
	}

}
