class Solution {
    public void backtrack(int start,List<Integer> curr,List<List<Integer>> res,int k,int target,int[] nums )
    {
        if(curr.size()==k && target<0)
            return;
        if(curr.size()==k && target==0)
        {
            res.add(new ArrayList<>(curr));
            return;
        }   

        for(int i=start;i<nums.length;i++)
        {
   
            curr.add(nums[i]);
            backtrack(i+1,curr,res,k,target-nums[i],nums);
            curr.remove(curr.size()-1);

        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        int[] nums = { 1, 2, 3, 4, 5,6,7,8,9 };
        backtrack(0,curr,res,k,n,nums);
        return res;
    }
}
