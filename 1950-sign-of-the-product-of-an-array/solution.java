class Solution {
    public int arraySign(int[] nums) {
        int sign=0;
        for(int a : nums)
        {
            if(a==0)
                return 0;
            if(a<0)
                sign++;
        }
        return (sign%2==0) ? 1 : -1;
    }
}
