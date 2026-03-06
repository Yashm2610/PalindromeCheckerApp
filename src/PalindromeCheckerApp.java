import java.util.*;

public class PalindromeCheckerApp {

    // Method 1: Two-pointer method
    public static boolean checkPalindromeTwoPointer(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Method 2: Stack method
    public static boolean checkPalindromeStack(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Measure Two-Pointer Method
        long start1 = System.nanoTime();
        boolean result1 = checkPalindromeTwoPointer(input);
        long end1 = System.nanoTime();

        // Measure Stack Method
        long start2 = System.nanoTime();
        boolean result2 = checkPalindromeStack(input);
        long end2 = System.nanoTime();

        long time1 = end1 - start1;
        long time2 = end2 - start2;

        System.out.println("\nTwo Pointer Method: " + result1);
        System.out.println("Execution Time: " + time1 + " ns");

        System.out.println("\nStack Method: " + result2);
        System.out.println("Execution Time: " + time2 + " ns");

        sc.close();
    }
}