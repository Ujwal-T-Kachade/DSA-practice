package Arrays;

public class setMatrixZero {

	public static void main(String[] args) {
		
int matrix[][] = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		
		boolean isFirstZero = false;
		 if(matrix[0][0]==0 ){
			isFirstZero = true;
		}else {
			isFirstZero = true;
		}
		 
		 boolean firstColZero = false ;
		 
		 for(int i = 0 ; i < matrix.length ; i++) {
			 for ( int j = 0 ; j < matrix[0].length ; j++) {
				 if(j == 0 ) {
					 if(matrix[i][j] == 0) {
						 firstColZero = true;
						 continue;
						 
					 }
					 
				 }
				 
				 if(matrix[i][j] == 0) {
					 matrix[i][0] = 0;
					 matrix[0][j] = 0;
					 
				 }
				
				 
			 }
		 }
		 
		 for(int i =  matrix.length - 1 ;  i >=0 ; i-- ) {
			 for(int j = matrix[0].length - 1 ; j > 0 ; j -- ) {
				 
				 if(matrix[i][0] == 0 || matrix[0][j] == 0) {
					 matrix[i][j] = 0;
				 }
				 
			 }
			 if(firstColZero){
				 
				 
				 matrix[i][0] = 0;
				 
			 
		 }
		 }
		 
		 
		 
		 for(int i = 0 ; i < matrix.length ; i++) {
			 for(int j = 0 ; j < matrix[0].length ; j ++) {
				 System.out.print(matrix[i][j]+" ");
			 }
			 System.out.println();
		 }
		 
		

	}

}
