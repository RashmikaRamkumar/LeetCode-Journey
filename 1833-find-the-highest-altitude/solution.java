class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int sum=0;
        int n=gain.length;
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++)
        {
            sum+=gain[i];
            max=Math.max(max,sum);
        }
        return max;
    }
}
