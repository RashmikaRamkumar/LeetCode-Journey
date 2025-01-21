class Solution {
    public boolean canConstruct(String s, int k) {
        if(k>s.length())
            return false;
        Map<Character,Integer> m=new HashMap<>();

        for(char c : s.toCharArray())
        {
            m.put(c,m.getOrDefault(c,0)+1);
        }
        int odd=0;
        for(int count : m.values())
            if(count%2!=0)
                odd++;
        return odd<=k;
    }
}
