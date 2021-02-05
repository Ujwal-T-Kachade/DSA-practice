package Arrays;

public class countInversion {
	public static void main(String[] args) {
		
		int arr[] = {5,3,2,4,1};
		int n = arr.length;
		int temp[] = new int[n];
		
		int ans = mergSort(arr,temp,0,arr.length-1);
		System.out.println(ans);
		
	}

	private static int mergSort(int[] arr, int[] temp, int left, int right) {
		
		int mid , inv_count  = 0;
		
		// if arr is not a single element we go on spliting
		
		if(right > left) {
			mid = (right + left)/2 ;
			
			inv_count = inv_count + mergSort(arr,temp,left,mid);
			
			inv_count = inv_count + mergSort(arr,temp , mid+1 , right);
		
			
			// after reaching single element we want
			// to merge the array back in temp array
			int x = finalMerg(arr ,temp ,left ,mid+1 ,right);
		
			inv_count = inv_count + x;
		
			
			
		}
		return inv_count;
	}
															//passing m+1
	private static int finalMerg(int[] arr, int[] temp, int left, int mid, int right) {
		
		int i ,j ,k ;
		int inv_count = 0;
		
		i = left ; 	// start index of left Sub array
		j = mid ; // start index of right Sub array
		k = left; 	// start index of the resultant merged array
		
		while((i <= mid-1)  && (j<=right)) {
			
			if(arr[i] <= arr[j]) {
				temp[k++] = arr[i++];	// if element in left sub array is smaller simply copy elements in temp array
			}else {
				
				temp[k++] = arr[j++] ; // if element in right sub array is smaller copy elements in temp array
				
				// as this element in right array is smaller than the current element in left array 
				// this means it is smaller than all the elements to the right  of the current position (including current) of i in left array
				
				// so they all will make pairs
				// hence
				
				inv_count = inv_count + (mid - i);

			}

		}
		
		
		// copy remaining array if one of them exceeds
		while(i<= mid-1) {
			temp[k++] = arr[i++];
			
		}
		
		while(j<= right) {
			temp[k++] = arr[j++];
		}
		
		// updating the original array
		
		for(i = left ; i <= right ; i++) {
			arr[i] = temp[i];	// updating the original array
		}
		
		return inv_count;
		
	}

}


