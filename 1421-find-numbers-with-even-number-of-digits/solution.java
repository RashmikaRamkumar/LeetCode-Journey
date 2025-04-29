class Solution {
    public int digits(int i)
    {
        int digit=0;
        while(i>0)
        {
            digit++;
            i/=10;
        }
        return digit;
    }
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i : nums)
        {
            int d=digits(i);
            if(d%2==0)
                count++;
        }
        return count;
    }
}
