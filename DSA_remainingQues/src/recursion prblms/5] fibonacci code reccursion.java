/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int n = 9;
		System.out.println(fibonacci(n));
	}
	public static int fibonacci(int n) {
	    
	    if(n == 1) {
	        return 0; 
	    }
	    if(n == 2) {
	        return 1;
	    }
	    
	    int ans = fibonacci(n-1) + fibonacci(n-2);
	   // we doing this because 
	   //we know a + b = c that fibo counts and add the previous two nos
	   
	   return ans;
	}
}
