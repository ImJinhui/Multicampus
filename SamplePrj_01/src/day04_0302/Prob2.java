package day04_0302;

public class Prob2 {

	public static void main(String[] args) {
		
// 예제 1)문자열 참조변수  msg 가 "yes" 일때 true 인  조건식
		
		
	 String msg="yes";
	 
	 if(msg.equals("yes")){
		 
	 }





// 예제 2)arr 배열 에 담긴 모든 값을 더하는 프로그램을 완성하시오  .

	
		
			int[] arr = {10, 20, 30, 40, 50}; 
			
			int sum =0;
			
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
				sum += arr[i];
			}
			
			System.out.println("sum="+ sum);
		 
	






//	예제3) 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이  100  이상이 되는지 ?
			
			
			int i=0;
			int sum1 = 0;
			while(sum1 <= 100){
				i++;
				
				if(i%2!=0){
					sum1 = sum1+i;
				}else{
					sum1 = sum1-i;
				}
				
			}
			
			System.out.println(sum1);
			System.out.println(i);
			
			
			/*int sum = 0;
			int s = 1;
			int num = 0;
			
			for (int i = 1; true; i++, s=-s) {
				num = s*i;
				sum+=num;
				if(sum >= 100) break;
				
			}
			
			System.out.println(sum);
			System.out.println(num);
			*/
			
			
			
			
			
			
	 

	}

}
