class Solution {
    public boolean check(int[] nums) {
        int c=0;
        int n=nums.length;
        for(int i=1;i<2*n;i++)
        {
            if(nums[(i-1)%n]<=nums[i%n])
                c++;
            else
                c=0;
            if(c==n-1)
                return true;
        }
        return n==1;
    }
}
