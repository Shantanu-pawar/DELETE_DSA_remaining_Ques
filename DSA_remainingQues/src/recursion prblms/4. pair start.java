import java.util.*;

public class Main {
	public static String pairStar(String s) {

		// base case : if only 1 string length
		if (s.length() <= 1) return s;

		//case1  : if my char is mathing then just store char plus (*)
	    else if (s.charAt(0) == s.charAt(1)) {
	        System.out.println(s.charAt(0) + " " + s.substring(1));
	        return s.charAt(0) + "*" + pairStar(s.substring(1));     
	    }
	    
		// case 2: otherwise just print as it is using substring
	    else {
	        System.out.println(s.charAt(0) + " " + s.substring(1));
	         return s.charAt(0) + pairStar(s.substring(1));
	    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(pairStar(s));
    }
}
