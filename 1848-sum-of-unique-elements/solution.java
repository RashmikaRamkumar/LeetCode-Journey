class Solution {
    public int sumOfUnique(int[] nums) {
        int[] count=new int[101];
        for(int i : nums)
            count[i]++;
        int res=0;
        for(int i=0;i<count.length;i++)
        {
            if(count[i]==1)
                res+=i;
        }
        return res;
    }
}
