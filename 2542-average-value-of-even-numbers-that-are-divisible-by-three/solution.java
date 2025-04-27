class Solution {
    public int averageValue(int[] nums) {
        int count=0;
        int sum=0;
        for(int a:nums)
        {
            if(a%6==0)
            {
                count++;
                sum+=a;
            }
        }
        
        return count==0 ? 0 : sum/count;
    }
}
