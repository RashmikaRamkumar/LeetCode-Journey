class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        int i,j,k,l;
        int n=nums.length;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n-1;j++)
            {
                k=j+1;
                l=n-1;
                while(k<l){
                long sum=(long) nums[i]+nums[j]+nums[k]+nums[l];
                if(sum==target)
                {
                    result.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                    k++;
                    l--;
                }
                else if(sum<target)
                    k++;
                else if(sum>target)
                    l--;
                }
            }
        }
        ans.addAll(result);
        return ans;

        
    }
}
