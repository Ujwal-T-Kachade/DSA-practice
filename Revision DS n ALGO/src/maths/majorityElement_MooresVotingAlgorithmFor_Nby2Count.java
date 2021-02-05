package maths;

public class majorityElement_MooresVotingAlgorithmFor_Nby2Count {
	
	// **************** MOORES VOTING ALGORITHM ************************//

	
	public static void main(String[] args) {
		
		int arr[] = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
		
		int element = 0 ;
		int count = 0 ;
		
		for( int i = 0 ; i < arr.length ; i++) {
			
			if(count == 0) {
				element = arr[i];
			}else if(element == arr[i]){
				
				count ++;
				
			}else {
				count --;
			}
			
		}
		System.out.println(element);

	}

}
