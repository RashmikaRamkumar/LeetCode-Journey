class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
    public static void reverse(int[] nums,int strt,int end)
        {
            int temp;
            while(strt<end)
            {
                temp=nums[strt];
                nums[strt]=nums[end];
                nums[end]=temp;
                strt++;
                end--;
            }
        }
}
