import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Throwable {

        String str = "abcabb";
        int n = str.length();
        // case 1: first we have to convert the string into arr for return in last
        char [] ans = new char[n];
        ans = str.toCharArray();
        
        char []arr = new char[n];
        for(int i=0; i<n; i++) {
            
/*            it just return the value of character's 
              ex : 'a'-'a' = 0;
                   'b'-'a' = 1;    
here we're mapping every character to it's index and then store it's value in the arr
and then it will store the frequencies of repeatating element's in perticular indexes   */

            char ch = str.charAt(i);
            arr[ch -'a']++;
        }
        
        // case 2 : now we have an arr whose store all repeatative indexes;
        // let's try to print the arr in this example 
            // [2 3 1 0 0 0]  this is the result after convert and store repeatative elements
            
        for(int a : arr) System.out.print(a + " ");
        
        
        // case 3 :now just find max and return that element from String
        int max = 0;
        
        for(int i=0; i<n ;i++) {
            if(max < arr[i])  max = i;
        }

        System.out.println("\n the repeated element is : " + ans[max]);
    }
}



