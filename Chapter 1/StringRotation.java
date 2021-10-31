/*

Assume you have a method isSubstring which checks if one word is a substring
of another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using
only one call to isSubstring (e.g. "waterbottle" is a rotation of "erbottlewat").

*/

public class StringRotation {
  public static boolean isRotation(String originalString, String rotatedString) {
    if (originalString.length() != rotatedString.length()) return false;
    if (originalString.equals(rotatedString)) return true;
    if (originalString.length() == 0 && rotatedString.length() == 0) return true;

    for (int i = 1; i < originalString.length(); i++) {
      String newRotatedString = rotateAbout(rotatedString, i);
      if (newRotatedString.equals(originalString)) return true;
    }
    return false;
  }

  private static String rotateAbout(String str, int index) {
    StringBuilder sb = new StringBuilder();

    for (int i = index; i < str.length() + index; i++) {
      sb.append(str.charAt(i % str.length()));
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(isRotation("abc", "bca"));
  }
}
