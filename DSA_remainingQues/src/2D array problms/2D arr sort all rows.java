
/*
matrix : 3 3 

3 2 1 
6 5 4 
9 8 7 

output-

1 2 3 
4 5 6 
7 8 9 

*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    int n = in.nextInt();
	    int m = in.nextInt();
	    
	    int arr[][] = new int[n][m];
	    
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    arr[i][j] = in.nextInt();            
                }
            }
        
        
        // SORT    
           for(int i=0; i<n; i++) {
              Arrays.sort(arr[i]);
           }
           
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    System.out.print(arr[i][j] + " ");    
                }
                System.out.println();
            }
        }
}

