class Solution {
    public int countEven(int num) {
        int i=0,count=0;
        for(i=1;i<=num;i++)
        {
            int n=i;
            int sum=0;
            while(n!=0)
            {
                int digit=n%10;
                sum+=digit;
                n/=10;
            }
            if(sum%2==0)
                count++;
        }
        return count;
    }
}
