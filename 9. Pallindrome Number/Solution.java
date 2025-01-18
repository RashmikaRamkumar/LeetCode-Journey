public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            // Negative numbers and numbers ending with zero (except for 0 itself) cannot be palindromes
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
