class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m= new HashMap<>();
        for(String s : strs)
        {
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String str= new String(arr);
            //System.out.println(str);
            if(!m.containsKey(str))
            {
                m.put(str,new ArrayList<>());
            }
            m.get(str).add(s);
            
        }

        List<List<String>> ans=new ArrayList<>(m.values());
        return ans;

    }
}
