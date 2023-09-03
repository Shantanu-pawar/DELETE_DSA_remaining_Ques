

import java.util.*;

public class Main{
	public static void main(String[] args) {
		
        String str = "house";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        
        // base Case
        if (str.isEmpty())  return str;
        
        
        // here we cut first character and then add it into our function.
        else {
            
            // case1 : here it just cut the char firstly and store it last
            System.out.println(str.substring(1) + " " + str.charAt(0));
            return reverseString(str.substring(1)) + str.charAt(0);
          
          // case2 : if we do this then we obiously store our string as it is just DRY run
//             return str.charAt(0) + reverseString(str.substring(1));
          
        }
    }
}

