package Arrays;

import java.util.Arrays;

public class sortArrayGapMethod {

	public static void main(String[] args) {
		 int num1[] = {2,4,4,6,7};
		 int num2[] = {1,5,9,10,3,9};
		 
		 int l1 = num1.length;
		 int l2 = num2.length;
		 
		 int gap = (l1+l2)/2 + (l1+l2)%2;
		 
		 
		 while(gap>= 1) {
			 for(int i = 0 ; i<(l1+l2) ; i++) {
				 
				 int j = i+gap;
				 if(j>=l1+l2) {
					 break;
				 }
			
				if(i<l1 && j<l1) {
					if(num1[j] < num1[i] ) {
						int temp = num1[j];
						num1[j] = num1[i];
						num1[i] = temp;
					}
					
				}
				
				
				if(i<l1 && j>=l1) {
					
					if(num2[j-l1] < num1[i]) {
						int temp = num1[i];
						num1[i] = num2[j-l1];
						num2[j-l1] = temp;
					}
					
				}
				
				if(i>=l1 && j>=l1) {
					if(num2[j-l1] < num2[i-l1]) {
						int temp = num2[i-l1];
						num2[i-l1] = num2[j-l1];
						num2[j-l1] = temp;
					}
					
					
				}
				
				
				 
			 }
			 
			 if(gap == 1) {
				 break;
				 //we want gap =1 onlu once
			 }
			 
			 gap = gap/2 + gap%2;
			 
		 }
		 
		 System.out.println(Arrays.toString(num1));
		 System.out.println(Arrays.toString(num2));
		 
		 
		 
		 
	}

}
