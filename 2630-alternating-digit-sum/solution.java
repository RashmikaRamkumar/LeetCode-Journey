class Solution {
    public int alternateDigitSum(int n) {
        int temp=n;
        int digit=0;
        while(temp>0)
        {
            digit+=1;
            temp/=10;
        }
        boolean sign=(digit%2==0);
        int sum=0;
        while(n>0)
        {
            if(!sign)
                sum+=n%10;
            else
                sum-=n%10;
            sign=!sign;
            n/=10;
        }
        return sum;
    }
}
