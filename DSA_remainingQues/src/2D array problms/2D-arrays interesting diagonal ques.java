// Question : 
// hyat we have to find both diagonals in cross and we want that value != 0 
    // and then we check each element except diagonals and check it's value == 0
    // if this is true then just return 1 else return 0
    
//          1 3 
//          1 0 1
//          1 2 0 
//          2 0 3 
//          output : 0
            
            
//            1 3 
//            1 0 2 
//            0 2 0 
//            3 0 1 
//            output : 1


import java.util.*;
public class Main
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int matrix[][] = new int[n][n];
            
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
            matrix[i][j] = sc.nextInt();
        }
        
            Solution ob = new Solution();
            int ans = ob.special2 (matrix, n);
            System.out.println(ans);
        }
    
	}
}
        
        class Solution{
        static int special2(int matrix[][], int n){
            
            int count = 0;
            
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    
                    
                if (i == j) {
                    
                    if(matrix[i][j] == 0) {
                        count++; 
                        break;
                    }
                }
                else if ( i + j == n - 1 ) {
                    if(matrix[i][j] == 0) {
                        count++;
                        break;
                    }
                }
                else {
                    if(matrix[i][j] != 0) {
                        count++;
                    }
                }
                
            }
        }
            if(count!=0) return 0;
            else return 1;
        }
    }
