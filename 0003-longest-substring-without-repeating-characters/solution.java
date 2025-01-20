class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> m=new HashMap<>();
        int n=s.length();
        int l=0,r=0;
        int ml=0;
        while(r<n)
        {
            if(m.containsKey(s.charAt(r)))
            {
                int k;
                k=m.get(s.charAt(r));
                l=Math.max(l,k+1);
            }
                m.put(s.charAt(r),r);
                ml=Math.max(ml,r-l+1);
            r++;
        }
        return ml;
        
    }
}
