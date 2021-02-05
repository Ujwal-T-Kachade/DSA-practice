package Hashing;

import java.util.HashSet;

public class longet_Consecutive_Sequence_Lenght_In_O_of_N {

	public static void main(String[] args) {
		
		int arr[] = {102,4,100,1,101,2,3};	
		
		int ans = maxlength(arr);
		
		System.out.println(ans);

	}

	private static int maxlength(int[] arr) {
		int maxcount =0;
		int count;
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int a :arr) {
			set.add(a);
		}
		int n = arr.length;
		
		for(int i = 0 ; i < n ; i++) {
			count =0;
			int temp = arr[i];
			if(set.contains(temp-1)) continue;
			else{
				while(set.contains(temp++)) {
					count++;
				}
			}
			
			if(count>maxcount) maxcount = count ;
			
			
		}
		
		return maxcount;
	}

}
