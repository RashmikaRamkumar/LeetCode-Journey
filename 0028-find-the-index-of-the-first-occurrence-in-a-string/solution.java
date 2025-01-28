class Solution {
    public int strStr(String haystack, String needle) {
        int h=haystack.length();
        int n=needle.length();
        int i=0,j=0;
        for(i=0;i<=h-n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(haystack.charAt(i+j)!=needle.charAt(j))
                    break;
            }
            if(j==n)
                return i;
        }
        return -1;
    }
}
