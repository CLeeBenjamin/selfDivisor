class selfDivisor{
/// A number is a self divisor if it is divisible by each of its digits

/*
Part A
*/
public static boolean isSelfDivisor(int number){
  int n = number;
  while(n > 0){
    int digit = n % 10; // Get the one places value digit 
    if(digit == 0 || number % digit != 0){ /// check if number in one place is 0 or not divisible to the entire number
      return false; 
    }
    n /= 10; // remove # in one place 
  }
  return true; //once you removed the last number, 
  /// the loop will end and return true if it hasnt 
  ///returned false 

}

/*
Part B
*/

  public static int[] firstNumSelfDivisors(int start, int num){
    int[] newArr = new int[num]; /// Array to store next selfDivisor
    int numbStored = 0;  /// Counter for array index and while loop break
    int nextNum = start; /// Each number after the start number
    while(numStored < num){ // while the array is less than the number for the selfDivisor after start
      if(isSelfDivisor(nextNum)) { /// Uses method to see if number is a SelfDivisor
        newArr[numbStored] = nextNum; /// if it stores that num in an array 
        numbStored++; /// increment counter to keep track of # items stored

      }
      nextNum++; /// goes to the next number 
    }
    return newArr; /// return items that are selfDivisor
}


