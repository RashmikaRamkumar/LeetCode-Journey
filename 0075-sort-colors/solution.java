class Solution {
    public void swap(int[] nums,int a,int b)
    {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void sortColors(int[] nums) {
        int l=0,r=nums.length-1;
        int mid=0;
        while(mid<=r)
        {
            if(nums[mid]==0)
            {
                swap(nums,l,mid);
                l++;
                mid++;
            }
            else if(nums[mid]==1)
                mid++;
            else
            {
                swap(nums,r,mid);
                r--;
            }
        }
    }
}
