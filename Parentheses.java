/*
 * Author : Anicia Dcosta
 * Balancing Parathenses
 * 
 */

import java.util.*;

public class Parentheses {
    private static final char leftParen    = '(';
    private static final char rightParen    = ')';
    /*private static final char L_BRACE    = '{';
    private static final char R_BRACE    = '}';
    private static final char L_BRACKET  = '[';
    private static final char R_BRACKET  = ']';*/

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {

            if      (s.charAt(i) == leftParen)  
            	stack.push(leftParen);

            else if (s.charAt(i) == rightParen) {
                if (stack.isEmpty())        return false;
                if (stack.pop() != leftParen) return false;
            }

        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        String s ="({dfsdfsdfsdf}sdssdfsd)";
        System.out.println(isBalanced(s));
    }

}
