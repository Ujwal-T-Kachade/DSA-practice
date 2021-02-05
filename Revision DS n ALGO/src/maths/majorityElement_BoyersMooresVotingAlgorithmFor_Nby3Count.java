package maths;

public class majorityElement_BoyersMooresVotingAlgorithmFor_Nby3Count {

	public static void main(String[] args) {

		int arr[] = {1,1,1,3,3,2,3,2};

		int count1 = 0;
		int count2 = 0;
		int el1 = 0;
		int el2 = 0;

		for(int a : arr) {
			
			if(a == el1) count1++;
			else if(a == el2) count2++ ;
			else if(count1 == 0 ) {
				el1 =a;
				count1 =1 ;
			}else if(count2 == 0 ) {
				el2 = a;
				count2 = 1;
			}else {
				count1--;
				count2--;
			}
			
			
		}
		System.out.println(el1+" "+el2);

				
			}

	}


