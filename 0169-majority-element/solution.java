class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> occur=new HashMap<Integer,Integer>();
        for(int i: nums)
        {
            if(occur.containsKey(i))
                occur.put(i,occur.get(i)+1);
            else
                occur.put(i,1);
        }
        int n=nums.length;
        int r=0;
        for(int i:nums)
        {
            if(occur.get(i)>(n/2))
            {
                r=i;
                break;
            }

        }
        return r;
    }
}
