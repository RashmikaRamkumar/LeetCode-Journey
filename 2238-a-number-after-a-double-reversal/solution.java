class Solution {
    public boolean isSameAfterReversals(int num) {
        // int n=0;
        // while(num>0)
        // {
        //     int digit=num%10;
        //     num/=10;
        //     n+=(n*10)+digit;
        // }
        if(num==0)
            return true;
        if(num%10==0)
            return false;
        else
            return true;

    }
}
