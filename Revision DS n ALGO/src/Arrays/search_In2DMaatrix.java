package Arrays;

public class search_In2DMaatrix {

	public static void main(String[] args) {
		// ************ question type 1 *************//
		
		// Integers in each row are sorted from left to right.
		// The first integer of each row is greater than the last integer of the previous row.
		
		int mat[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60} };
		int toFind = 15;
		
		int rows_count = mat.length;
		int cols_count = mat[0].length;
		
		int nums = rows_count*cols_count -1;
		
		int start = 0;
		int last = nums;
		boolean isPresent = false;
		
		while(last>=start) {
			int mid = (start + last)/2;
			
			if(mat[mid/rows_count][mid%rows_count]== toFind) {
			System.out.println(toFind+" is at ("+mid/rows_count+","+mid%rows_count+")");
			isPresent = true;
			break;
			}else if(mat[mid/rows_count][mid%rows_count] < toFind){
				start = mid+1;
			}else {
				last = mid-1;
			}
		}
		
		if(!isPresent)
		{
			System.out.println(toFind+" is not present in given matrix.");
		}
		
		
		
		
		// ******************** question 2 ********************//
		
		// Integers in each row are sorted from left to right.
		// Integers in each column are sorted from top to bottom.
		
		
		int i = 0;
		int j = cols_count-1;
		isPresent = false;
		while(i<cols_count && j >=0){
		
		if(mat[i][j]==toFind) {
			System.out.println(toFind+" is at ("+i+","+j+")");
			isPresent = true;
			break;
		}else if(mat[i][j]>toFind) {
			j--;
		}else {
			i++;
		}
		
		}
		if(!isPresent)
			{
				System.out.println(toFind+" is not present in given matrix.");
			}
	}

}
