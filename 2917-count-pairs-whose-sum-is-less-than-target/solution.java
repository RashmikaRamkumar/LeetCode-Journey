class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int result=0;
        int l=0;
        int r=nums.size()-1;
        nums.sort((a,b)->a-b);
        while(l!=r)
        {
            if(nums.get(l)+nums.get(r)<target)
            {
                result+=r-l;
                l++;
            }
            else
            {
                r--;
            }
        }
        return result;
    }
}
