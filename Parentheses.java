import java.util.Stack;

public class Parentheses {
  public boolean isValid(String s) {
      Stack<Character> stack = new Stack<>();

      for (int i = 0; i < s.length(); i++) {
        char currentChar = s.charAt(i);
        if (currentChar == '{' || currentChar == '[' || currentChar == '(') {
          stack.push(currentChar);
        } else {
          if (stack.empty()) return false;
          if (currentChar == '}' && stack.pop() != '{') return false;
          if (currentChar == ']' && stack.pop() != '[') return false;
          if (currentChar == ')' && stack.pop() != '(') return false;
        }
      }
      if (stack.empty()) return true;
      else return false;
  }
}