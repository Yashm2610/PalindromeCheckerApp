/*
  *UC4:Character Array Based Palindrome Check
 *@author Yash
  * Date:26/02/26
  *REG:RA2411026010263
 */
import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "radar";

        // Convert to lowercase (optional safety)
        input = input.toLowerCase();

        // Convert String to char array
        char[] characters = input.toCharArray();

        // Two-pointer variables
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Output result
        System.out.println("Input String: " + input);

        if (isPalindrome) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }
    }
}
