package Arrays;

public class dutchDFlagAlgorithm {
	public static void main(String[] args) {
	
			int num[] = {0,0,1,1,2,2,0,1,2,2,0,1,1,1,0};
			int lo = 0;
			int mid = 0;
			int hi = num.length - 1;
			int temp ;
			
			while ( mid<= hi) {
				
			switch(num[mid]){
			case 0 :{
				temp = num[mid];
				num[mid] = num[lo];
				num[lo] = temp;
				
				mid++;
				lo++;
				break;
			}
			
			case 1:
				mid++;
				break;
				
			case 2 :
				{
					temp = num[mid];
				num[mid]= num[hi];
				num[hi] = temp;
				
				hi-- ;
				break;
				}
				
			}
			
	}
			
			for(int i = 0 ; i < num.length ; i++) {
				System.out.print(num[i]+",");
			}
	}



}
