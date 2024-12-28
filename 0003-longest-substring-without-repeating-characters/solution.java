class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0;
        Map<Character,Integer> m = new HashMap<>();
        int ml=0;
        while(r<s.length())
        {
            if (m.containsKey(s.charAt(r)))
            {
                int k=m.get(s.charAt(r));
                l=Math.max(l,k+1);
                m.put(s.charAt(r),r);
                ml=Math.max(ml,r-l+1);
            }
            else
            {
                m.put(s.charAt(r),r);
                ml=Math.max(ml,r-l+1);
            }
            r++;
        }
        return ml;
    }
}
