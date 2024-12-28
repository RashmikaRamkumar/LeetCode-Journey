class Solution {
    public void moveZeroes(int[] nums) {
        int low=0,mid=0;
        while(mid<nums.length)
        {
            if(nums[mid]!=0)
            {
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
            }
            mid ++;
        }
        
    }
}
