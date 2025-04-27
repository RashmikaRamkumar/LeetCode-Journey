class Solution {
    public boolean possible(int[] arr,int mid,int m,int k)
    {
        int single=0;
        int total=0;
        for(int a:arr)
        {
            if(a<=mid)
            {
                single++;
                if(single==k)
                {
                    total++;
                    single=0;
                }
            }
            else
                single=0;
        }
        return total>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(n<((long)m*k))
            return -1;
        int left=Integer.MAX_VALUE;
        int right=Integer.MIN_VALUE;
        for(int b:bloomDay)
        {
            if(b<left)
                left=b;
            if(b>right)
                right=b;
        }
        int ans=right;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(possible(bloomDay,mid,m,k))
            {
                ans=mid;
                right=mid-1;
            }
            else
                left=mid+1;
        }
        return ans;
    }
}
