// Write a method to replace all spaces in a string with '%20'. You may assume that the string (cont.)
// has sufficient space at the end to hold the additional characters, and that you are given the (cont.)
// "true" length of the string. (Note: If implementing in Java, please use a character array (cont.)
// so that you can perform this operation in place.)

// example:
// input: "Mr John Smith    ", 13 (13 is the length of the string including the spaces between words but not the ones at the end)
// output: "Mr%20John%20Smith"

public class URLify {
  
  public static char[] URLifyStringBuilder(char[] charArr, int lenOfStr) {
    StringBuilder sb = new StringBuilder();
    
    for (int i = 0; i < lenOfStr; i++) {
      if (charArr[i] != ' ') sb.append(charArr[i]);
      else sb.append("%20");
    }
    
    return sb.toString().toCharArray();

    /*
    time complexity: O(n), where n is lenOfStr
    space complexity: O(n), where n is lenOfStr
    */
  }

  public static char[] URLifyInPlace(char[] charArr, int lenOfStr) {
    int arrLen = charArr.length;
    for (int i = lenOfStr - 1; i >= 0; i--) {
      if (charArr[i] != ' ') {
        charArr[arrLen-1] = charArr[i];
        arrLen--;
      } else {
        charArr[arrLen - 1] = '0';
        charArr[arrLen - 2] = '2';
        charArr[arrLen - 3] = '%';
        arrLen -= 3;
      }
    }
    return charArr;

    /*
    time complexity: O(n), where n is lenOfStr
    space complexity: we use no extra space, i.e. we perform the operation in place, so I guess it's O(1)?
    */
  }

  public static void main(String[] args) {
    String str = "Mr John Smith    ";
    char[] charArr = str.toCharArray();
    
    System.out.println(URLifyStringBuilder(charArr, 13));
    System.out.println(URLifyInPlace(charArr, 13));
  }
}