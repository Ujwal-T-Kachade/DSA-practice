package Arrays;

public class kadanesAlgorithm {

	public static void main(String[] args) {
		int[] arr = {2, -3, 4,5,-2,3};
		
		int max = 0;
		int start =0;
		int end =0;
		for(int i = 0 ; i < arr.length ; i++) {
			
			int sum = arr[i];
			
			for ( int j = i+1 ; j < arr.length ; j++) {
		
				sum = sum + arr[j];
				if(sum > max) {
					start = i;
					end = j;
					max = sum;
					System.out.println(max);
				}
				if(sum < 0) {
					break;
				}
			}
		}
		System.out.println(arr[start]+" - "+arr[end]+" max "+max);
		
		

	}

}
