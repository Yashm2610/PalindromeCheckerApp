/*
  *UC6: Queue + Stack Based Palindrome Check
 *@author Yash
  * Date:26/02/26
  *REG:RA2411026010263
 */
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "civic";
        input = input.toLowerCase();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);
            stack.push(ch);
        }

        boolean isPalindrome = true;


        while (!queue.isEmpty()) {

            char fromQueue = queue.remove();
            char fromStack = stack.pop();

            if (fromQueue != fromStack) {
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
