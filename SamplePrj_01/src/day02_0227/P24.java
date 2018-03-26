package day02_0227;

public class P24 {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 77;
		System.out.println("num1= " + num1 + " num2= "+num2);//스트링클래스의 +연산은 성능저하의 원인
		
		//num1의 값과 num2의 값 바꾸기 
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		
		//p36
		System.out.printf("num1=%d, num2=%d \n", num1, num2);
		System.out.println(3.14*3*3);
		System.out.printf("%5.2f %n",3.14*3*3);
		System.out.printf("%f %n",3.14*3*3);
		
		String name = "홍길동";
		System.out.printf("%s 님 %n", name);
		System.out.printf("%10s 님 %n", name);
		
		byte b = (byte)200;
		
		System.out.println(Byte.MIN_VALUE+ " ~ " + Byte.MAX_VALUE);
		System.out.printf("Byte 범위 : %d ~ %d %n", Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.printf("Integer 범위 : %d ~ %d %n", Integer.MIN_VALUE , Integer.MAX_VALUE);
		System.out.printf("Long 범위: %d ~ %d %n", Long.MIN_VALUE , Long.MAX_VALUE);
		
		int sum = Integer.parseInt("100")+500;
		System.out.println(sum);
		
	}

}
