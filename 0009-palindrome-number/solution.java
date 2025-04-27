class Solution {
    public boolean isPalindrome(int x) {
       int temp=x,res=0;;
       while (x>0)
       {
        int digit=x%10;
        res=res*10+digit;
        x/=10;
       }
       return res==temp;
    }
}
