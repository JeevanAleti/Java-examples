package HSBCTest;

import java.util.Scanner;
import java.util.Stack;
 
public class StringValidation {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
    	
    	System.out.println("Please enter the string: ");
        Scanner sc = new Scanner(System.in);
        String brackets = sc.nextLine();
        
        //CREATING THE stack FOR THE BRACKETS
        Stack<Character> stack = new Stack<>();
        boolean isBalanced = true;
        
        for (int i = 0; i < brackets.length(); i++) 
        {
            char bracket = brackets.charAt(i);
            if (bracket == '{' || bracket == '[' || bracket == '(') {
                stack.push(bracket);
            } else {
                if (bracket == '}') {
                    bracket = '{';
                } else if (bracket == ')') {
                    bracket = '(';
                } else if (bracket == ']') {
                    bracket = '[';
                }
 
                if (stack.empty()) {
                    isBalanced = false;
                    break;
                }
 
                if (bracket == stack.peek()) {
                    stack.pop();
                } else {
                    isBalanced = false;
                    break;
                }
            }
        }
 
        if (isBalanced) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}