package Arrays;

import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle {

public static void main(String[] args) {
		
	List<List<Integer>> arr = new ArrayList<>();
		
		int n = 5; 
		
		for( int i = 0 ; i < n ; i++) {
			
			ArrayList<Integer> num = new ArrayList<>();
			
			for(int j = 0 ; j <= i ; j ++) {
				
				if(j == 0 || j == i) {
					
					num.add(1);
				}else {
					int temp = arr.get(i-1).get(j) + arr.get(i-1).get(j-1);
					num.add(temp);
				}
				
			}
			
			arr.add(num);
			
		}
		System.out.println(arr.toString());
		
		
//		for(int i = 0 ; i < n ; i ++) {
//			ArrayList<Integer> num = arr.get(i);
//			
//			for ( int j = 0 ; j < i ; j ++) {
//				int temp = num.get(j);
//				System.out.print(temp+" ");
//			}
//			System.out.println();
//		}

	}

}
