class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int even=0;
        for(int a : nums)
        {
            if(a%2==0)
                even++;
            if(even>1) return true;
        }
        return false;
    }
}
