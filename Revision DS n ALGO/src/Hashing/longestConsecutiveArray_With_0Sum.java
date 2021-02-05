package Hashing;

import java.util.*;


public class longestConsecutiveArray_With_0Sum {

	public static void main(String[] args) {
		int arr[] = {1,-1,3,2,-2,-8,1,7,10,23};

		int ans = maxLength(arr);
		System.out.println(ans);
	}

	private static int maxLength(int[] arr) {
		int maxStreak= 0;
		int sum =0;
		int n = arr.length;
		
		HashMap<Integer,Integer> set = new HashMap<>();
		
		for(int i = 0 ; i < n ; i++) {
			sum += arr[i];
			
			if(set.containsKey(sum)) {
				int index = set.get(sum);
				if((i-index) > maxStreak) maxStreak =(i-index);
			}else {
				set.put(sum, i);
			}
			
		}
		return maxStreak;
	}

}
