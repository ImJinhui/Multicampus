package fsort.basic;

class cInsertionSort{
	public static void main(String args[]){
		int a[] = {69, 10, 30, 2, 16, 8, 31, 22};
		int size = a.length;
		System.out.printf("\n삽입정렬 : ");
		for( int i=0; i < a.length; i++)
			System.out.printf("%3d",a[i]);
		insertionSort(a, size);
	}
	
	public static void insertionSort(int a[], int size){

		System.out.println();
	}
}