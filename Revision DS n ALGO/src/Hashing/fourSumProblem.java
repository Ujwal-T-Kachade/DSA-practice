package Hashing;

import java.util.*;

public class fourSumProblem {

	public static void main(String[] args) {
		
		int[] arr = {4,3,3,4,4,2,1,2,1,1};
		int target = 10;
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		
		Arrays.sort(arr);	//sorting

		res = fourSum(arr,target);
		if(res !=null)
		System.out.println(res.toString());
		else System.out.println("no 4 nimbers sums up to "+target);

	}

	private static ArrayList<ArrayList<Integer>> fourSum(int[] arr,int target) {
		
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			for(int j = i ; j < arr.length ; j++) {
				
				ArrayList<Integer> quad = new ArrayList<>();
				
			int left = j+1;
			int right = arr.length-1;
			int two_sum = target - arr[i] - arr[j];
			while(left<right) {
				
				if(arr[left] + arr[right] > two_sum) right--;
				
				else if(arr[left] + arr[right] < two_sum) left++;
				
				else {
					
					quad.add(arr[i]);
					quad.add(arr[j]);
					quad.add(arr[left]);
					quad.add(arr[right]);
					
					res.add(quad);
					
					int left_num = arr[left];
					int right_num = arr[right];
					
					while(left<right && arr[left] != left_num) left++;
					
					while(left<right && arr[left] != right_num) right++;
		
				}
			}
			
			while(j+1 < arr.length && arr[j] == arr[j+1]) j++;   //we are checking for j+1 cover j loop is also going to increment the j

			}
			
			while(i+1 < arr.length && arr[i] == arr[i+1]) i++;

		}
		
		return res;
	}

}
