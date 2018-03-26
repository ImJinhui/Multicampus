package day02_0227;

public class Test01 {
	public static void main(String[] args) {
		
		char c = 'a';
		boolean flag = true;
		
		System.out.println(c + " " + flag);
		flag = c=='B';
		System.out.println(flag);
		
		System.out.println(c);
		System.out.println((int)c);
		System.out.println((int)'ㄱ');
		
		int cc = c;
		System.out.println(cc);
		
		String name1 = new String("홍길동");
		System.out.println(name1.charAt(0)+"씨");
		
		
		String name2 = "홍길동"; // 유일하게 string 만 new없이 가능 
		String name3 = null;
		System.out.println(name3);
	
		name3 = name1;
		System.out.println(name3);
		name1=null;
		System.out.println(name1 + name3);
		name3 = null;
		System.out.println(name3);
		
	}
}
