class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count=new int[150];
        for(int num : nums)
        {
            count[num]++;
        }
        int total=0;
        for(int c : count)
        {
            total+= ((c)*(c-1))/2;
        }
        return total;
    }
}
