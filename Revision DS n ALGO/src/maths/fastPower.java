package maths;

public class fastPower {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 5;
		
		// a^ b = ?
		
		int c = fpwr(a,b);
		System.out.println(c);

	}
	public static int fpwr(int a ,int b) {
		System.out.println(a+" "+b);
		if(b == 1) {
			return a;
		}
		if((b & 1) == 1){ 					//light weight check for odd even
			return (a*fpwr(a,b-1));
		}else {
			return fpwr(a*a,b/2);
		}
	}

}
