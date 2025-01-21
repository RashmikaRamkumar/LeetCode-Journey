class Solution {
    public int prefixCount(String[] words, String pref) {
        int  count=0;
        // int pref_size=pref.length();
        // for(String w : words)
        // {
        //     int c=0;
        //     if(w.length()< pref_size)
        //         continue;
        //     for(int i=0;i<pref_size;i++)
        //     {
        //     if(w.charAt(i)!=pref.charAt(i))
        //         c++;
        //     }
        //     if(c==0)
        //         count++;
        // }
        // return count;

        for(String w : words)
            if(w.startsWith(pref))
                count++;
        return count;
    }
}
