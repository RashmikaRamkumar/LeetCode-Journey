class Solution {
    // public long fact(int n)
    // {
    //     if(n==1 || n==0)
    //         return 1;
    //     return n*fact(n-1);
    // }
    public int trailingZeroes(int n) {
    //     long factorial=fact(n);
    //     int res=0;
    //     while(factorial>0)
    //     {
    //         long rem=factorial%10;
    //         if(rem==0)
    //         {
    //             res+=1;
    //             factorial/=10;
    //         }
    //         else{
    //             break;
    //         }
    //     }
    //     return res;
    int res=0;
    while(n>0)
    {
        n/=5;
        res+=n;
    }
    return res;
    }
}
