class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 ||(x!=0 && x%10==0 ))
         // negative num and if num last digit it zero only if num itself is not zerp
            return false;
        //int temp=x;
        int rev=0;
        
        while(x>rev)
        {
            //reversing a number logic applied only for the second half of the number
            rev=rev*10 + x % 10;
            x/=10;
        }
        //x has the first half and rev has the seconf half(reversed)
        //if the number is odd-length (in which case we can safely ignore the middle digit 
        // if 121 both half has 2 we simply ignore 2 and compare others in case of oddDigit num

        return (x==rev) || (x==rev/10);
    }
}
