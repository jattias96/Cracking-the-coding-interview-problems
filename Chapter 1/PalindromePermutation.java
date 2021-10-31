/*

Given a string, write a function to check if it is a permutation of a palindrome.
A palindrome is a word of phrase that is the same forwards and backwards.  A permutation is a rearrangement of letters.
The palindrome does not need to be limited to just dictionary words.
You can ignore casing and non-letter characters.

*/

public class PalindromePermutation {
  public static boolean isPalindromePermutation(String input) {
    // since case does not matter, we will convert the string to all
    // lowercase so that "A" and "a" will be recognized as equal.
    input = input.toLowerCase();

    input = removeNonLetters(input); // we remove non-letter chars because they don't count for this problem.

    // we traverse the string and increment the counter for each char in a
    // parallel array of size 128 corresponding to the ascii table
    int[] letterArr = new int[128];
    for (int i = 0; i < input.length(); i++) letterArr[input.charAt(i)]++;

    // if the string is even, every char count must be even. if it is odd, will have exactly one odd char count.
    int oddCtr = 0;
    for (int i = 0; i < letterArr.length; i++) { // traversing the entire letterArray we declared earlier
      if (letterArr[i] % 2 != 0) oddCtr++; // if letterArr[i] is odd, increment oddCtr. else ignore
    }
    if (oddCtr > 1) return false;
    else return true;
  }
  
  public static String removeNonLetters(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) { // for the entire length of the string...
      if (str.charAt(i) >= 97 && str.charAt(i) <= 122) // ...if str.charAt(i) is a lowercase letter...
        sb.append(str.charAt(i)); // ...append it to the StringBuilder. Otherwise ignore it and move on.
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    String test1 = "%";
    System.out.println("Expected: true. Actual: " + isPalindromePermutation(test1));
  }
}
