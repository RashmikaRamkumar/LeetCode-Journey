class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0;
        // 2 segregation - 2 pointer 
        //j is the controller 
        while(i<nums.length)
        {
            if (nums[i]==nums[j])
                i++;
            else
            {
                j++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                //j++;
                i++;
            }
        }
        return j+1;

    }
}
