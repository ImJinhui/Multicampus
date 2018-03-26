package day04_0302;

public class P163 {

	public static void main(String[] args) {
		int num = 0;
		if(args.length!=0){
			
			num = Integer.parseInt(args[0]);
		}
		
		System.out.println("****  구구단  ****");
	OUT:for(int i=1; i<=9; i++){
			
			for (int j = 1; j <=9 ; j++) {
				if(j==num) break; // j for loop 을 빠져나감
//				if(j==5) break OUT; // OUT for loop를 빠져나감
//				if(j==5) continue; // 5단만 건너뜀
				System.out.printf("%2d*%d=%2d ", j, i, j*i);
			}
			
			System.out.println();
		}
	}

}
