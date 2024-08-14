class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,j,temp;
        for(j=0;j<nums.length;j++)
        {
            if(nums[j]!=val)
            {
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            }
        }
        return i;
    }
}
