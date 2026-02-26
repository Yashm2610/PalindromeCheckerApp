/*
  *UC5: Stack-Based Palindrome Checker
 *@author Yash
  * Date:26/02/26
  *REG:RA2411026010263
 */
import java.util.Stack;
import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "noon";

        input = input.toLowerCase();

        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        for (int i = 0; i < input.length(); i++) {
            char poppedChar = stack.pop();
            if (input.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }


        System.out.println("Input String: " + input);

        if (isPalindrome) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }
    }
}
