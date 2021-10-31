/*

There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they
are one edit (or zero edits) away.

Example:
pale, ple == true
pales, pale == true
pale, bale == true
pale, bake == false

*/

public class OneAway {
  public static boolean isOneEditAway(String strA, String strB) {
    if (strA.equals(strB)) return false;
    if (strA.length() == strB.length()) return isOneReplaceAway(strA, strB);

    int diffOfChars = Math.abs(strA.length() - strB.length());
    if (diffOfChars > 1) return false;
    else return isRemoveOrAddOneCharAway(strA, strB);
  }

  public static boolean isOneReplaceAway(String strA, String strB) {
    int diffChars = 0;
    for (int i = 0; i < strA.length(); i++) {
      if (strA.charAt(i) != strB.charAt(i)) diffChars++;
    }
    return diffChars == 1;
  }

  // TODO see if this actually works
  public static boolean isRemoveOrAddOneCharAway(String strA, String strB) {
    int[] ascii = new int[128];
    for (int i = 0; i < strA.length(); i++) ascii[strA.charAt(i)]++;
    for (int i = 0; i < strB.length(); i++) ascii[strB.charAt(i)]--;
    
    int nonZero = 0;
    for (int i = 0; i < ascii.length; i++) {
      if (ascii[i] != 0) nonZero++;
    }
    if (nonZero != 1) return false;
    else return true;
  }

  public static void main(String[] args) {
    System.out.println(isOneEditAway("pale", "ple")); // true
    System.out.println(isOneEditAway("pales", "pale")); // true
    System.out.println(isOneEditAway("pale", "bale")); // true
    System.out.println(isOneEditAway("pale", "bake")); // false
  }
}