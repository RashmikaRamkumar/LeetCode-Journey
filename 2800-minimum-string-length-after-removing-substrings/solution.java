class Solution {
    public int minLength(String s) {
        // while(s.contains("AB") || s.contains("CD"))
        // {
        //     s=s.replace("AB","").replace("CD","");
        // }
        // return s.length();

        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(!st.isEmpty() && ((st.peek()=='A' && c=='B') || (st.peek()=='C' && c=='D')))
                st.pop();
            else
                st.push(c);
        }
        return st.size();
    }
}
