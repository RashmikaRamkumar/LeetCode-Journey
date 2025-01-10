class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
    
        int[] bmax=counter("");
        
        for(String b:  words2)
        {
            int[] bcount=counter(b);
            for(int i=0;i<26;i++)
            {
                bmax[i] = Math.max(bmax[i],bcount[i]);
            }

        }

        List<String> ans = new ArrayList<>();
        search : for(String a : words1)
        {
            int[] acount=counter(a);
            for(int i=0;i<26;i++)
                if(acount[i]<bmax[i])
                    continue search;
            ans.add(a);
        }
        return ans;
    }
    public int[] counter(String s)
        {
            int[] ans=new int[26];
            for(char c : s.toCharArray())
                ans[c-'a']++;
            return ans;
        }
}
