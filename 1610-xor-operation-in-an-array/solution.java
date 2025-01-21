class Solution {
    public int xorOperation(int n, int start) {
        int[] arr=new int[n];
        int i,xor;
        for(i=0;i<n;i++)
        {
            arr[i]=start+2*i;
        }
        xor=arr[0];
        for(i=1;i<n;i++)
        {
            xor=xor^arr[i];
        }
        return xor;
    }
}
