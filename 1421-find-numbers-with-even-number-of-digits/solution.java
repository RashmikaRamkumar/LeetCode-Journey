class Solution {
    public int findNumbers(int[] nums) {
        //10^5 means 100000
        int count=0;
        for(int i:nums)
        {
            if((i>9 && i<=99) || (i>999 && i<=9999) || (i==100000))
                count++;
        }
        return count;
    }
}
