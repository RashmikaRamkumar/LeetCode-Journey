class Solution {
    private boolean isVowel(char c)
    {

        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
    public int maxVowels(String s, int k) {
        int count=0,max=0;
        for(int i=0;i<s.length();i++)
        {
            if(isVowel(s.charAt(i)))
                count++;
            if(i>=k && isVowel(s.charAt(i-k)))
                count--;
            max=Math.max(max,count);
        }
        return max;
        
    }
}
