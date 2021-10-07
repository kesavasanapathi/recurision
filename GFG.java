import java.io.*;

class GFG {
	public static void main (String[] args) {
		int n=10;
		System.out.println(isodd(n));
	}
	static boolean isodd(int n){
	    return (n & 1)==0;
	}
}
