class Solution {
    public int solve(int n,int[] dp)
    {
        if(n==1 || n==2)
             return n;
        // if(dp[n]!=-1)
        //     return dp[n];
        // else
        //     return dp[n]=solve(n-1,dp)+solve(n-2,dp);
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public int climbStairs(int n) {
       int [] dp=new int[n+1];
       Arrays.fill(dp,-1);
       return solve(n,dp) ;
    }
}
