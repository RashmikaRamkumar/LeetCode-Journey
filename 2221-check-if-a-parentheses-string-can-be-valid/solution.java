class Solution {
    public boolean canBeValid(String s, String locked) {

        int l=s.length();
        if(l%2!=0)
            return false;
        Stack<Integer> open=new Stack<>();
        Stack<Integer> unlock=new Stack<>();

        for(int i=0;i<l;i++)
        {
            if(locked.charAt(i)=='0')
                unlock.push(i);
            else if(s.charAt(i)=='(')
                open.push(i);
            else if(s.charAt(i)==')')
            {
                if(!open.empty())
                    open.pop();
                else if(!unlock.empty())
                    unlock.pop();
                else 
                    return false;
            }
        }

        while(!open.empty() && !unlock.empty() && open.peek() < unlock.peek())
        {
            open.pop();
            unlock.pop();
        }
        if(!open.empty())
            return false;
        return true;
    }
}
