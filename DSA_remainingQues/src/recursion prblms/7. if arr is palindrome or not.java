// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []arr = new int[n];
        for(int i=0; i<arr.length; i++) arr[i] = in.nextInt();
        
        int i=0;
        int j = n-1;
        if(palindrome(arr, i, j) == 1) 
            System.out.println("palindrome");
        else System.out.println("not a palindrome string");
        
        
    }
     static int palindrome(int arr[], int i, int j) {
        // case : if your arr is single element corner case
        if(i >= j)  return 1;
         
        // case : check if element is same 
        if(arr[i] == arr[j]) 
        return palindrome(arr, i+1, j-1);

         // if element is not same then 
        else return 0;
                
    }
}
