import java.util.*;

public class Main {
    static String removeX(String s) {
		// first we have to check if string is null?
		if(s.length() == 0) return s;


// this s.substring means we remove the 0th pos and return to 1 pos
		if(s.charAt(0) == 'x')
		return removeX(s.substring(1)); // इथे डायरेक्ट फर्स्ट इंडेक्स पासून स्ट्रिंग रिटर्न कर 

		// नैतर मग ह्या फंगक्शन च्या वैल्यू मधे स्टोर कर एण्ड रिटर्न to func again! 
		else return s.charAt(0) + removeX(s.substring(1));
		
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(removeX(s));
    }
}
