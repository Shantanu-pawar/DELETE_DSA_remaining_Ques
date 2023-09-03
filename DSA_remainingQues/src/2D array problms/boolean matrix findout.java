import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner in = new Scanner (System.in);

                int m = in.nextInt();
                int n = in.nextInt();


                int [][] arr = new int [m][n];
                
                for(int i=0; i< m; i++) {
                        for(int j=0; j < n ; j++) {
                            arr[i][j] = in.nextInt();
                        }
                }
 
           
            
            System.out.println(fun(arr));
                 
	}
	public static int fun(int [][] arr) {
	                  
	                  int m = arr.length; 
	                  int n = arr[0].length;

                int sum = 0;
                 for(int i=0; i< m; i++) { 
                     boolean check = false;

                        for(int j=0; j < n ; j++) {
 
                                if(arr[i][j] == 1) 
                                {
                                        check = true; 
                                        sum = sum+n;
                                        break;
                                }
                   }
                   if(check == true)
                   {
                       for(int j=0; j<n; j++)
                       {
                           //print 1
                           System.out.print("1");
                       }
                   }
                   else
                   {
                       for(int j=0; j<n; j++)
                       {
                           //print 0
                           System.out.print("0");
                       }
                   }
                   //print new line
                   System.out.println();
               }
                
                return sum;
	}
}
