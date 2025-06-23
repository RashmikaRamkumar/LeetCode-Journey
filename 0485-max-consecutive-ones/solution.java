class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int one=0;
        int m_one=0;
        for(int i:nums)
            {
                if(i==1)
                    one++;
                else
                    one=0;

                m_one=Math.max(one,m_one);
            }
        return m_one;
    }
}
