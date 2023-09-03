

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
		int n = in.nextInt();
		int [][]arr1 = new int[n][n];
		int [][]arr2 = new int[n][n];

		for(int i=0; i<n;i++) {
		    for(int j=0; j<n; j++) arr1[i][j] = in.nextInt();
		}
		for(int i=0; i<n;i++) {
		    for(int j=0; j<n; j++) arr2[i][j] = in.nextInt();
		}
		// create function here for return the addition
		sum(arr1, arr2, n);
	}
	
	static void sum(int [][]arr1, int [][]arr2, int n) {
	    
	    int [][]ans = new int[n][n];
	    
	    for(int i=0; i<n;i++) {
		    for(int j=0; j<n; j++) {
		        ans[i][j] = arr1[i][j] + arr2[i][j];        
		    }
		}
		
	    for(int i=0; i<n;i++) {
		    for(int j=0; j<n; j++) System.out.print(ans[i][j] + " ");
		    
		    System.out.println();
		}
		
	}
}

