package Arrays;

public class buyAndSellStock {

	public static void main(String[] args) {
		int arr[] = {7,1,5,3,6,4};
		
		int profit = 0;
		int min = arr[0];
		int buyDay = 0;
		int sellDay = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(arr[i] < min) {
				min = arr[i];
				buyDay = i;
			}else {
				if(profit < (arr[i] - min)){
					profit = (arr[i] - min);
					sellDay = i;
				}
			}
			
			
		}
		System.out.println(profit+" "+buyDay+" "+sellDay);

	}

}
