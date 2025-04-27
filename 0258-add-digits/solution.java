class Solution {
    public int addDigits(int num) {
        // if(num<10)
        //     return num;
        // int sum=0;
        // int n=num;
        // while(num<10)
        // {
        //     while(n)
        // }

        // return (num==0) ? 0 : (num%9==0)?  9 : (num%9);
        return 1+(num-1)%9;
    }
}
