class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int test=target-nums[i];
            if(m.containsKey(test))
                return new int[]{m.get(test),i};    
            m.put(nums[i],i);
        }
        return null;
    }
}
