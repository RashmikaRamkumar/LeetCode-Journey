class Solution {
    public String mergeAlternately(String s1, String s2) {
        StringBuilder s=new StringBuilder();
        int i=0;
        while(i<s1.length() || i<s2.length())
        {
            if(i<s1.length())
                s.append(s1.charAt(i));
            if(i<s2.length())
                s.append(s2.charAt(i));
            i++;
        }
        return(s.toString());

    }
}
