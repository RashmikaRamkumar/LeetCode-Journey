class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s=new HashSet<>();
        while(!(s.contains(n)))
        {
            s.add(n);
            n=square(n);
            if(n==1)
                return true;
        }
        return false;
    }
    public int square(int n)
    {
        int res=0;
        while(n>0)
        {
            int digit=n%10;
            res+=digit*digit;
            n/=10;
        }
        return res;
    }
}
