class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int a:arr)
        {
            m.put(a,m.getOrDefault(a,0)+1);
        }
        List<Integer> freq=new ArrayList<>(m.values());
        Collections.sort(freq);
        int result=0;
        for(int i=0;i<freq.size();i++)
        {
            result+=freq.get(i);
            if(result>k)
                return freq.size()-i;
        }
    return 0;
    }
}
