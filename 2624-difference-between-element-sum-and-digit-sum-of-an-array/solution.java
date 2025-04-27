class Solution {
    public int differenceOfSum(int[] nums) {
        int esum=0;
        int dsum=0;
        for(int a:nums)
        {
            esum+=a;
            while(a>0)
            {
                int digit=a%10;
                dsum+=digit;
                a/=10;
            }
        }
        return Math.abs(esum-dsum);
    }
}
