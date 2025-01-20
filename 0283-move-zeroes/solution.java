class Solution {
    public void moveZeroes(int[] nums) {
        int l=0,mid=0;
        while(mid<nums.length)
        {
            if(nums[mid]!=0)
            {
                int temp=nums[l];
                nums[l]=nums[mid];
                nums[mid]=temp;
                l++;
            }
            mid++;
        }
    }
}
