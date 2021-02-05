package Arrays;

public class rotateMatrix {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int[] a: arr) {
			for(int b : a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
		//transpose of matrix
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = i ; j < arr[0].length ; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
				
			}
		}
		
		// mirror of transpose
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0; j<arr.length/2 ; j++) {
				
				int temp = arr[i][j];
				arr[i][j] = arr[i][arr.length-1-j];
				arr[i][arr.length-1-j] = temp;
				
			}
		}
		
		for(int[] a: arr) {
			for(int b : a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}

}
