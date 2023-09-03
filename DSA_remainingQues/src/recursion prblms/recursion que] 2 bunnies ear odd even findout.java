// Recursion-1 > bunnyEars2


// We have bunnies standing in a line, numbered 1, 2, ...
// The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..)
// we'll say have 3 ears, because they each have a raised foot. Recursively return 
// the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).


// bunnyEars2(0) → 0
// bunnyEars2(1) → 2
// bunnyEars2(2) → 5


public class Main
{
	public static void main(String[] args) {
	}
	
public int bunnyEars2(int bunnies) {
  
//   this is baseCase conditions for problem
  if(bunnies == 0) return 0; 
  if(bunnies == 1) return 2; 
  if(bunnies == 2) return 5;
  
  
  int ans; 

// case1 : just check if our bunnies is odd then they have two ears right according to ques
// so just add 2 + ears(n-1)  Recursively


  if(bunnies %2 != 0) {
     ans = 2 + bunnyEars2(bunnies-1);
  }
  
//   case2 : just check if our bunnies is even so they have three ears 
// so that's why we added 3 + ears(n-1)  Recursively

  else{
     ans = 3 + bunnyEars2(bunnies-1);
  }

  
  return ans;
}

}
