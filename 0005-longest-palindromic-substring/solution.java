class Solution {
    public boolean isPalindrome(String s,int start,int end)
        {
            while(start<end)
            {
                if(s.charAt(start)!=s.charAt(end))
                    return false;
                start++;
                end--;
            }
            return true;
        }
    public String longestPalindrome(String s) {
        int sl=s.length();
        int longg=0;
        String res=new String();
        if(s.length()==1)
            return s;
        for(int i=0;i<sl;i++)
        {
            for(int j=i;j<sl;j++)
            {
                
                if(isPalindrome(s,i,j))
                {
                    if(longg<(j-i+1))
                    {
                    longg=j-i+1;;
                    res=s.substring(i,j+1);
                    }
                }
            }
        }
        return res;

    }
}
