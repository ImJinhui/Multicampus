package day07_0307;

/**
 * 
 * @author student
 * @since 2018/03/07
 * @version 1.0
 *
 */

public class Car {
	public String color;
	String gearType;
	int door;
	
//	public Car(){
//		System.out.println("Car() ");
//	}
	public Car(String color, String gearType, int door ){
		
		this.color= color;
		this.gearType = gearType;
		this.door = door;
	}
	
	
	
	public Car() {
		// TODO Auto-generated constructor stub
	}



	/**
	 * Car 정보 출력 메소드
	 */
	
	
	
	
	
	public void print(){
		System.out.println(color + " " + gearType + " " + door);
		
	}
	
	
}
