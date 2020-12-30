package HSBCTest;
//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
import java.util.Stack;

class Solution {

    public boolean validParen(String input) {

        if (input.isEmpty()) {
            return true;
        } else {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                char current = input.charAt(i);
                if (current == '(' || current == '[' || current == '{') {
                    stack.push(current);
                } else {
                    if(stack.isEmpty()) {
                          return false;
                    }
                    char peekChar = stack.peek();
                    if ((current == ')' && peekChar != '(')
                            || (current == '}' && peekChar != '{')
                            || (current == ']' && peekChar != '[')) {
                        return false;  
                    } else {
                        stack.pop();
                    }
                }
            }
            return true; 
        }
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.validParen(""));
        System.out.println(sol.validParen("()"));
        System.out.println(sol.validParen("()[]{}"));
        System.out.println(sol.validParen("(]"));
        System.out.println(sol.validParen("([)]"));
        System.out.println(sol.validParen("{[]}"));
    }

}