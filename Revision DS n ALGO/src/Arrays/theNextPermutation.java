package Arrays;

public class theNextPermutation {

	public static void main(String[] args) {
		
		int arr[] = {1,2,4,5,3};
		int i = arr.length -2 ;
		
		while(i >= 0 && (arr[i] >= arr[i+1])) i-- ;
		if(i>=0) {
			int j = arr.length -1;
			while(arr[j] <=arr[i]) j-- ;
			swap(arr,i,j);
		}

		reverse(arr,i+1 , arr.length-1);
		
		for(int a : arr) {
		System.out.println(a);
		}
		
	}
	
	public static void swap(int[] arr,int i , int j ) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	
	public static void reverse(int[] arr, int i , int j) {
		while(i < j) swap(arr,i++,j--);
	}


}
