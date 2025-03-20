class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0)
            return 1;
        else if(n==1)
            return 10;
        int  res=0;
        int temp=9;
        for(int i=2;i<=n;i++)
        {
            temp=temp*(11-i);
            res+=temp;
        }
        return res+10;
    }
}
