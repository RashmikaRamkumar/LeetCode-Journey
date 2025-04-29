class Solution {
    public long countSubarrays(int[] nums, int k) {
       int max=Integer.MIN_VALUE;
       for(int i:nums)
       {
        if(i>max)
            max=i;
       }
       ArrayList<Integer> arr=new ArrayList<>();
       long ans=0;
       for(int i =0;i<nums.length;i++)
       {
            if(nums[i]==max)
                arr.add(i);
        
        int freq=arr.size();
        
        if(freq>=k)
        {
            ans+=arr.get(freq-k)+1;
        }
       }

       return ans;
    }
}
