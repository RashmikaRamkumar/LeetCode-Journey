class Solution {
    public void reverse(int[] nums)
    {
        int l=0;
        int r=nums.length-1;
        while(l<r)
        {
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        reverse(nums);
        long prefix=0;
        int positive=0;
        for(int num:nums)
        {
            prefix+=num;
            if(prefix>0)
                positive++;
            else
                break;
        }
        return positive;

    }
}
