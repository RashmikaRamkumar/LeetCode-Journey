class Solution {
    public int pivotIndex(int[] nums) {
        int[] prev=new int[nums.length];
        int[] suff=new int[nums.length];

        int n=nums.length;
        prev[0]=0;
        suff[n-1]=0;

        for(int i=1;i<n;i++)
            prev[i]=prev[i-1]+nums[i-1];
        
        for(int i=n-2;i>=0;i--)
            suff[i]=suff[i+1]+nums[i+1];

        for(int i=0;i<n;i++)
        {
            if(prev[i]==suff[i])
                return i;
        }
        return -1;
        
    }
}
