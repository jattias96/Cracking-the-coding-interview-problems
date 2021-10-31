// /*

// Implement an algorithm to determine if a string has all unique characters.
// What if you cannot use additional data structures?

// */

// import java.util.Arrays;

// public class IsUnique {
//   public static boolean uniqueCharactersSort(String input) {
//     // check for empty string or string with only one character
//     if (input.length() == 0 || input.length() == 1) return true;
//     // otherwise...

    
//     String sortedString = sortString(input); // sort string
    
//     // traverse entire string looking for adjacent duplicate characters
//     for (int i = 1; i < sortedString.length(); i++) {
//       if (sortedString.charAt(i) == sortedString.charAt(i-1)) // if duplicates found...
//         return false;
//     }
//     // if no duplicates were found...
//     return true;
//   }

//   public static String sortString(String input) {
//     char[] temp = input.toCharArray(); // convert string to char array
//     Arrays.sort(temp); // sort char array
//     return new String(temp); // return sorted array as string
//   }
  
//   public static void main(String[] args) {
//     String test1 = "hi there";
//     System.out.println("Expected: false. Actual: " + uniqueCharactersArray(test1));
    
//     String test2 = "Judith";
//     System.out.println("Expected: true. Actual: " + uniqueCharactersArray(test2));

//     String test3 = "";
//     System.out.println("Expected: true. Actual: " + uniqueCharactersArray(test3));

//     String test4 = "aaaaab";
//     System.out.println("Expected: false. Actual: " + uniqueCharactersArray(test4));

//     String test5 = "i";
//     System.out.println("Expected: true. Actual: " + uniqueCharactersArray(test5));
//   }
// }

// /*
// time complexity:

// sort: O(nlogn) where n is length of input string
// */

// /*
// space complexity:

// sort: O(n) where n is length of input string
// */