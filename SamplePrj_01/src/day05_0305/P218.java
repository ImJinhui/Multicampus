package day05_0305;

public class P218 {

	public static void main(String[] args) {
		// 1. 정방형 배열
		
		
//		int[][] i = new int[4][3];

		/* step 3
		for (int j = 0; j < i.length; j++) {
			for (int k = 0; k < i[j].length; k++) {
				System.out.print(i[j][k] + " ");	
			}
			System.out.println();
		}
		*/
		

		/* step 2
		for (int j = 0; j < i.length; j++) {
			System.out.print(i[j][0] + " ");
			System.out.print(i[j][1] + " ");
			System.out.print(i[j][2] + " ");
			System.out.println();
		}
		*/
		
		/* step 1
		System.out.print(i[0][0] + " ");
		System.out.print(i[0][1] + " ");
		System.out.print(i[0][2] + " ");

		System.out.println();

		System.out.print(i[1][0] + " ");
		System.out.print(i[1][1] + " ");
		System.out.print(i[1][2] + " ");

		System.out.println();

		System.out.print(i[2][0] + " ");
		System.out.print(i[2][1] + " ");
		System.out.print(i[2][2] + " ");

		System.out.println();

		System.out.print(i[3][0] + " ");
		System.out.print(i[3][1] + " ");
		System.out.print(i[3][2] + " ");
		*/
		
		// 2. 가변배열
		
		/*
		int[][] i = new int[4][];
		i[0] = new int[3];
		i[1] = new int[1];
		i[2] = new int[7];
		i[3] = new int[4];
		
		for (int j = 0; j < i.length; j++) {
			for (int k = 0; k < i[j].length; k++) {
				System.out.print(i[j][k] + " ");	
			}
			System.out.println();
		}
		*/
		
		/*
		int[][] i = {{55,66,77}, {88,99,44},{45,34,66},{90}};
		
		for (int j = 0; j < i.length; j++) {
			for (int k = 0; k < i[j].length; k++) {
				System.out.print(i[j][k] + " ");	
			}
			System.out.println();
		}
		*/
		
		String[][] i = {
				{"홍길동", "90","83","100"},
				{"고길동", "92","98","65"},
				{"박길동", "93","23","76"},
				{"최길동", "96","18","43"}
		};
		
		// 학생별 총점구하기 
		
		System.out.println(" 이름   국어  수학  영어   총점");
		for (int j = 0; j < i.length; j++) {
			
			int sum = 0;
			
			for (int k = 0; k < i[j].length; k++) {
				
				if (k != 0) {
					sum += Integer.parseInt(i[j][k]);
				}
				
				System.out.printf("%4s", i[j][k]);
			}
			
			System.out.printf("  %3d  \n" ,sum);
			System.out.println();
		}
		
		
		
		
	}

}
