/*

Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string "aabcccccaaa" would become "a2b1c5a3".
If the "compressed" string would not become smaller than the original string,
your method should return the original string. You can assume the string has only uppercase
and lowercase letters (a-z).

*/


public class StringCompression {
  public static String compress(String inputStr) {
    if (inputStr.length() == 0) return inputStr;
    
    StringBuilder sb = new StringBuilder();

    char currentChar = inputStr.charAt(0);
    int currentCharCount = 1;
    for (int i = 1; i < inputStr.length(); i++) {
      if (inputStr.charAt(i) != currentChar) {
        sb.append(currentChar);
        sb.append(currentCharCount);

        currentChar = inputStr.charAt(i);
        currentCharCount = 1;
      } else {
        currentCharCount++;
      }
    }
    sb.append(currentChar);
    sb.append(currentCharCount);

    if (sb.toString().length() >= inputStr.length()) return inputStr;
    else return sb.toString();
  }
  
  public static void main(String[] args) {
    System.out.println(compress("aabcccccaaa"));
    System.out.println("a2b1c5a3");

    System.out.println();

    System.out.println(compress("aaa"));
    System.out.println("a3");
  }
}
