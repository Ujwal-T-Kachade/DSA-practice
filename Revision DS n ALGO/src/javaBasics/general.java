package javaBasics;

public class general {
	public static void main(String args[]) {
		int x = 400;
		 int y = 445 ;
		 swap(x,y);
		 System.out.println(x+" "+y);
		
	}
	public static void  swap(int x , int y) {
		int temp = x ;
		x = y;
		y = temp;
		
	}

}
