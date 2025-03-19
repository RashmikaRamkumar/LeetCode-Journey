class Solution {
    public int longestNiceSubarray(int[] nums) {
        int i=0;
        int j=0;
        int window=0;
        int result=0;
        for(j=0;j<nums.length;++j)
        {
            while((window & nums[j])!=0)
            {
                window^= nums[i];
                i++;
            }
            window|=nums[j];
            result=Math.max(result,j-i+1);
        }
        return result;
    }
}
