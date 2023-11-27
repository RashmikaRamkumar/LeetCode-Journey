class Solution {
    public int addDigits(int num) {
        int digit=0,ans;
        ans=num;
        String s=Integer.toString(ans);
        while(s.length()!=1)
        {
            ans=0;
            while(num!=0)
            {
                digit=num%10;
                ans+=digit;
                num/=10;
            }
            num=ans;
            s=Integer.toString(ans);
        }
        return ans;

    }
}
