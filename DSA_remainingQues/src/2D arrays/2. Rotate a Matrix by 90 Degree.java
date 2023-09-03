import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args) throws java.lang.Exception{
		
		Scanner in = new Scanner (System.in);
	    int n   = in.nextInt();
		int m = in.nextInt();
 
        int [][] arr  = new int [n][n];
                
		for(int i=0; i<n ;i++) 
			for(int j=0; j<n ; j++) 
				arr[i][j] = in.nextInt();
			
                
		for(int i=0; i<n ;i++) {
		// case 1: here just switch element's after diagonal
			for(int j= i + 1 ; j<n ; j++) {
				int temp =arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i]  = temp;
			}
		}

		// case 2 : now just print the arr into reverse 
		for(int i=0; i<n ;i++) {
			for(int j=n-1 ; j>=0 ; j--) {
					System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		
	}
}
