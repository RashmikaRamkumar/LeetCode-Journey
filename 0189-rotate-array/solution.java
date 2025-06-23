class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;

        arrRotate(nums,0,n-1);
        arrRotate(nums,0,k-1);
        arrRotate(nums,k,n-1);
    }
     public static void arrRotate(int[] arr,int start,int end)
            {
                while(start<end)
                    {
                        int temp=arr[start];
                        arr[start]=arr[end];
                        arr[end]=temp;
                        start++;
                        end--;
                    }
            }
}
