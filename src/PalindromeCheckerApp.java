/*
  *UC2 Print a Hardcoded Palindrome Result
  *@author Yash
  * Date:26/02/26
  *REG:RA2411026010263
 */
import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        String word="madam";
        boolean isPalindrome=true;

        int n=word.length()-1;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)!=word.charAt(n-i))
            {
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome)
        {
            System.out.println(word+" is a Palindrome");
        }
        else
        {
            System.out.println(word+"is not a Palindrome");
        }
    }
}
