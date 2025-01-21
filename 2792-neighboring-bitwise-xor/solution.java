class Solution {
    public boolean isValid(int start,int[] derived)
    {
        int n=derived.length;
        // int[] arr=new int[n];
        // arr[0]=start;
        // for(int i=0;i<n-1;i++)
        // {
        //     arr[i+1]=arr[i]^derived[i];
        // }
        // return (arr[n-1] ^ arr[0])==derived[n-1];

        int curr=start;
        for(int i=0;i<n-1;i++)
        {
            curr=curr^derived[i];
        }
        return (curr ^ start)==derived[n-1];
    }
    public boolean doesValidArrayExist(int[] derived) {
        int n=derived.length;
     
        return isValid(0,derived) || isValid(1,derived);
    }
}
