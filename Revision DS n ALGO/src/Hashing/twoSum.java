package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
	
	public static void main(String[] args) {
		int arr[] = {2,7,11,13};
		
		int target = 9;
		int res[] = twoSum(arr,target);
		
		for(int a : res) {
			System.out.print(a+" ");
		}
		

	}

	
	//******************* for sorted array	two pointer algorithm ************//

//	private static int[] twoSum(int[] arr, int target) {
//		int left= 0;
//		int right = arr.length-1;
//		
//		while(left <= right) {
//			if(arr[left]+arr[right] == target) { 
//			int	res[] =  {left,right};
//			return res;
//			}
//			if(arr[left]+arr[right] > target) {
//				right--;
//			}else {
//				left++;
//			}
//			
//			
//		}
//		System.out.println("does not exist");
//		
//		return null;
//	}

	
	
	
	
	
	//********** without sorting ***** using hashmap*******//
	
	// O(n) , O(n)   worst case O(nlogn) on multiple collision
	
	private static int[] twoSum(int[] arr, int target) {
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			int a = arr[i];
			
			if(map.containsKey(target - a)) {
				int[] res = {i , map.get(target-a)};
				return res;
				
			}else{
				
				map.put(a, i);
			
			}
			
			
		}
		
		return null;
	}
	
	
}
