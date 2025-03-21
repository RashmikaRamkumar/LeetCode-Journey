class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> res=new ArrayList<>();
        String check="";
        for(int i=0;i<searchWord.length();i++)
        {
            check+=searchWord.charAt(i);
            List<String> l=new ArrayList<>();
            int count=0;
            for(String a:products)
            {
                if(a.startsWith(check))
                {
                    l.add(a);
                    count++;
                    if(count==3)
                        break;
                }
            }
            res.add(l);
        }
        return res;
    }
}
