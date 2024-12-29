class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int n:nums)
            s.add(n);
        int m=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!s.contains(nums[i]-1))
            {
                int c=1;
                int k=nums[i]+1;
                while(s.contains(k))
                {
                    c++;
                    k++;
                }
                m=Math.max(m,c);
            }
        }
        return m;
    }
}
