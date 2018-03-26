package day06_0306;

public class TV {
	
	// 속성(데이터) + 기능(함수, 메소드)
	int channel;
	String color;
	private boolean power;
	
	public boolean isPower(){ //get
		return this.power;
	}
	
	public void setPower(boolean power){
		this.power = power;
	}
	
	public void channelUp(){
		channel++;
		return;
	}
	
	public void channelDown(){
		channel--;
		return;
	}
	
	public void power(){
		power = !power;
		return;
	}
	
	public void print(){
		System.out.printf("[색상:%s 채널:%d 전원:%b]  \n", this.color, this.channel, this.power);
	}
}
