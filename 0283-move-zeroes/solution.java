class Solution {
    public void moveZeroes(int[] nums) {
        int l=0,m=0;
        while(m<nums.length)
            {
                if(nums[m]!=0)
                {
                    int temp=nums[l];
                    nums[l]=nums[m];
                    nums[m]=temp;
                    l++;
                }
                m++;
            }
    }
}
