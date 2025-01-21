class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int i=0;
        for(i=0;i<n;i++)
        {
            nums[i]+=(nums[nums[i]]%n)*n;
        }
        for(i=0;i<n;i++)
        {
            nums[i]/=n;
        }
        return nums;
    }
}
