import java.util.*;

class Main {
    public static void main (String[] args) throws java.lang.Exception
    {
         Scanner scanner = new Scanner(System.in);
         int row = scanner.nextInt();
         int col = scanner.nextInt(); 
         int[][] arr = new int[row][col];
            
         for(int i = 0; i < row; i++)
             for(int j = 0; j < col; j++)
                 arr[i][j] = scanner.nextInt();
                 
        
        int scol = 0, ecol = col - 1;
        int srow = 0, erow = row - 1;
        
        while(srow <= erow && scol <= ecol){
            
//          now if you don't understand like why we take only arr[srow][i] here  ? 
//          so let's see : this is arr[row][col] = we know this
//          now we put which one is vary and which is constant over here
            
            for(int i=scol; i<= ecol; i++) System.out.print( arr[srow][i] + " "); // col vary row is fixed => arr[row][col] => arr[srow][i]
            srow++;
            
            for(int i=srow; i<= erow; i++) System.out.print( arr[i][ecol] + " "); // here see col is fixed and row vary => arr[i][col]
            ecol--;
            
            if(srow <= erow) {
            for(int i=ecol; i>= scol; i--) System.out.print(arr[erow][i] + " ");
            erow--;
            }
            
            if(scol <= ecol) {
            for(int i=erow; i>= srow; i--) System.out.print(arr[i][scol] + " ");
            scol++;
            }
            
        }
    }

}
