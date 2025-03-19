class Solution {
    public List<String> removeAnagrams(String[] words) {
        // Map<String,String> m1=new LinkedHashMap<>();
        // for(int i=0;i<words.length;i++)
        // {
        //     char[] arr=words[i].toCharArray();
        //     Arrays.sort(arr);
        //     if(!m1.containsKey(new String(arr)))
        //     m1.put(new String(arr),words[i]);
        // }
        // List<String> res=new ArrayList<>();
        // for(String s:m1.values())
        //     res.add(s);
        // return res;

        List<String> res=new ArrayList<>();
        String prev="";
        for(String word:words)
        {
            char[] arr=word.toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);

            if(!prev.equals(sorted))
            {
                res.add(word);
                prev=sorted;
            }
        }
        return res;
    }
}
