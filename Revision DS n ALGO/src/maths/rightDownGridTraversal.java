package maths;

import java.util.Arrays;

public class rightDownGridTraversal {

	public static void main(String[] args) {
	
		int a = 0;
		int b =0;
		int n = 7;
		int m =3;
	//	int dp[][] = new int[n][m];
		
	
		
//		for(int i = 0 ; i < n ; i++) {
//			Arrays.fill(dp[i], -1);
//		}
		
		System.out.println(path(a,b,n,m));
		

	}
	
	// ***************** recursive method ****************
	
//	static int path(int i  , int j , int  n , int  m ) {
//		if(i == n-1 && j == m-1  ) return 1;
//		if(i>=n || j>= m) {
//			return 0;
//		}else {
//			return path(i+1,j,n,m ) + path(i,j+1,n,m);
//		}
//		
//	}
	
	
	
	
	
	// ******************** recursion with hashtable *************
	
//	static int path(int i  , int j , int  n , int  m, int[][] dp ) {
//		
//		if( i == n-1 && j == m-1) {
//			return 1;
//		}
//		if( i >=n || j >= m) {
//			return 0;
//		}else {
//			if(dp[i][j] != -1) return dp[i][j];
//			else return path(i+1,j,n,m,dp) + path(i,j+1,n,m,dp);
//			
//		}
//
//	}
	
	
	
	// ******************  PERMUTATION COMBINATION 	********************//
	
//	RRD
//	RDR   this r three paths which r nothing but combinations of R, D, R
//	DRR
	static int path(int i  , int j , int  n , int  m ) {
		
		// (n+m-2) C (m-1) = (n+m-2) C (n-1)
		
		int N = n+m-2;
		int r = m-1;
		int res =1;
		for(int x = 1 ; x<= r ; x++) {
			
			res = res * (N - r + x)/x;
		}
		
		
		return res;
	}
	
	

}
