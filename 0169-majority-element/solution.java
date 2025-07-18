class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        int curr=0;
        for(int i=0;i<n;i++)
        {
            if(count==0)
                curr=nums[i];
            if(curr==nums[i])
                count+=1;
            else
                count--;
        }
        return curr;
    }
}
