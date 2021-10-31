// Given two strings, write a method to decide if one is a permutation of the other.

import java.util.Arrays;

public class CheckPermutation {
  
  public static boolean isPermutationSort(String strA, String strB) {
    // one approach: sort both and compare - they should be identical.
    
    // if they're diff. lengths that means they're not permutations of each other.
    if (strA.length() != strB.length()) return false;

    // sort both Strings
    String strASorted = sortString(strA);
    String strBSorted = sortString(strB);

    if (strASorted.equals(strBSorted)) return true;
    else return false;

    // time complexity: O(nlogn) (because of the sorting)
    // space complexity: O(n) because the sorting requires a char array the size of the string.
  }

  public static String sortString(String input) {
    char[] temp = input.toCharArray(); // convert string to char array
    Arrays.sort(temp); // sort char array
    return new String(temp); // return sorted array as string
  }

  public static boolean isPermutationCharArray(String strA, String strB) {
    // another appraoch: traverse strA, keeping track of its characters using a char array, (cont.)
    // and then run through the second string and see if they have the same characters
    
    // if they're diff. lengths that means they're not permutations of each other.
    if (strA.length() != strB.length()) return false;

    // create char array with enough spaces for all ascii values
    int ASCIIChars = 128;
    char[] charArr = new char[ASCIIChars];

    // store character count of strA in charArrs
    for (int i = 0; i < strA.length(); i++) {
      charArr[strA.charAt(i)]++;
    }

    // compare character counts of strA and strB
    for (int i = 0; i < strB.length(); i++) {
      charArr[strB.charAt(i)]--;
      if (charArr[strB.charAt(i)] < 0) // if there is a diff. num. of chars in strB than in strA...
        return false;
    }
    // otherwise...
    return true;

    // time complexity: O(n) (n == input string length) since we need to traverse at least the entire first string
    // space complexity: O(1) (we need an array the size of our character set, which in any case will be constant.)
  }

  public static void main(String[] args) {
    String expectTrue = "Expected: true. Actual: ";
    String expectFalse = "Expected: false. Actual: ";

    
  }
}
