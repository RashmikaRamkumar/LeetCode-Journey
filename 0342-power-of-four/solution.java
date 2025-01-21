class Solution {
    public boolean isPowerOfFour(int n) {
         if (n <= 0) {
            return false;
         }
        if ((n & (n - 1)) == 0) {
            int count = 0;
            while ((n & 1) == 0) {
                n >>= 1;
                count++;
            }
            return count % 2 == 0;
        }

        return false;
    }
}

