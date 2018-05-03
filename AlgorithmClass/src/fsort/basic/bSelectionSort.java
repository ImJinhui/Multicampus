package fsort.basic;

class bSelectionSort{
	public static void main(String args[]){
		int a[] = {69, 10, 30, 2, 16, 8, 31, 22};
		
		System.out.printf("\n선택정렬 : ");
		for( int i=0; i < a.length; i++)
			System.out.printf("%3d",a[i]);
		selectionSort(a);
	}
	
	public static void selectionSort(int a[]){		
		
		int minIndex = 0; 
				
		for (int i = 0; i < a.length; i++) {
			// 1) 최소값을 찾는다 
			for (int j = i+1; j < a.length; j++) {
				if(a[minIndex] > a[j]){
					minIndex = j;
				}
			}
			// 2) 최소값을 맨 앞과 바꾼다 
			swap(a, i, minIndex);
			System.out.printf("\n선택정렬 : ");
			for( int k=0; k < a.length; k++){
				System.out.printf("%3d",a[k]);
			}
		}
		
		
	

	}
	
	 public static void swap(int a[], int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	 

}	