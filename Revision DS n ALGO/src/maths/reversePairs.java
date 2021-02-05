package maths;

import java.util.ArrayList;

public class reversePairs {
	

public static void main(String[] args) {
		
		int arr[] = {40,25,19,12,9,6,2};
		int n = arr.length;
		int temp[] = new int[n];
		
		int ans = reversePair(arr);
		System.out.println(ans);
		
	}

private static int reversePair(int[] arr) {
	
	return mergSort(arr,0,arr.length-1);
}

private static int mergSort(int[] arr ,int left, int right) {
//	int	inv_count =0;
	if(left>=right) return 0;
	
	
		int mid = (left + right)/2;
		int inv_count = mergSort(arr,left,mid);
		inv_count += mergSort(arr,mid+1,right);
		
		inv_count += finalMerg(arr,left,mid,right);
	
	return (inv_count);
}

private static int finalMerg(int[] arr, int lo, int mid, int hi) {
	int cnt =0;
	int j = mid+1;
	
	for(int i = lo; i<= mid ;i++) {
		// either right array exhausted or the required condition is not met	
		while(j<=hi && arr[i] > (2*arr[j])) {
			j++;
	
		}
		
		cnt += (j -(mid+1));       // all to the right of j will form pairs
		
	}
	
	
	ArrayList<Integer> temp = new ArrayList<>();
	int ptr1 = lo ; int ptr2 = mid+1;
	while(ptr1<=mid && ptr2<=hi) {
		if(arr[ptr1]<= arr[ptr2]) {
			temp.add(arr[ptr1]);
			ptr1++;
		}else {
			temp.add(arr[ptr2]);
			ptr2++;
		}
	}
		
		while(ptr1<=mid) {
			temp.add(arr[ptr1]);
			ptr1++;
		}
		while(ptr2<=hi) {
			temp.add(arr[ptr2]);
			ptr2++;
		}
		
		for(int i =lo ; i <=hi ; i++) {
			arr[i] = temp.get(i-lo);  // i-lo as in arraylist index will start from 0
		}	
		return cnt;
	}	
}
