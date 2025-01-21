class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphab=new int[26];
        if(s.length()!=t.length())
            return false;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            alphab[s.charAt(i)-'a']++;
            alphab[t.charAt(i)-'a']--;
        }
        int i;
        for(i=0;i<26;i++)
        {
            if(alphab[i]!=0)
                return false;
        }
        return true;
        
    }
}
