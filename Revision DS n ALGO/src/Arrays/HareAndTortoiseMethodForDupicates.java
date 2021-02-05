package Arrays;

public class HareAndTortoiseMethodForDupicates {

	public static void main(String[] args) {
		
		int num[] = {1,2,3,4,5,2};	
		int slo = num[0];
		int fast = num[0];
		
		do {
			slo = num[slo];
			fast = num[num[fast]];
			
		}while(slo != fast);
		
		fast = num[0];
		while(slo != fast) {
			slo =num[slo];
			fast = num[fast];
			
		}
		
		System.out.println(slo);
		
		
		
		
	}

}
