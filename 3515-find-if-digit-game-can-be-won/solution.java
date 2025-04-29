class Solution {
    public boolean canAliceWin(int[] nums) {
        int s_sum=0;
        int d_sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<10)
                s_sum+=nums[i];
            else
                d_sum+=nums[i];
        }
        return s_sum!=d_sum;
    }
}
