class Solution {
    public boolean isValid(String s) {
        Stack<Character> c=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
            {
                c.push(s.charAt(i));
            }
            else
            {
                if (c.isEmpty())
                    return false;
                if(s.charAt(i)==')')
                {
                    if(c.peek()=='(')
                        c.pop();
                    else
                        return false;
                }
                if(s.charAt(i)==']')
                {
                    if(c.peek()=='[')
                        c.pop();
                    else
                        return false;
                }
                if(s.charAt(i)=='}')
                {
                    if(c.peek()=='{')
                        c.pop();
                    else
                        return false;
                }
            }
        }
        if(c.isEmpty())
            return true;
        return false;

    }
}
