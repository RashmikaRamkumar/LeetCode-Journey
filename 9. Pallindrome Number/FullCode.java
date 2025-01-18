import java.util.Scanner;

public class FullCode {
    
    // Solution class with the palindrome checking logic
    public static class Solution {
        public boolean isPalindrome(int x) {
            // If the number is negative or ends with zero but is not zero itself, it's not a palindrome
            if (x < 0 || (x != 0 && x % 10 == 0)) {
                return false;
            }

            int rev = 0;

            // Reverse the second half of the number
            while (x > rev) {
                rev = rev * 10 + x % 10;
                x /= 10;
            }

            // Compare the first half and the reversed second half
            return (x == rev) || (x == rev / 10);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        // Create a scanner object for taking user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        
        // Call the isPalindrome method from the Solution class to check if the number is a palindrome
        boolean result = solution.isPalindrome(x);
        
        // Output the result
        if (result) {
            System.out.println(x + " is a palindrome.");
        } else {
            System.out.println(x + " is not a palindrome.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
