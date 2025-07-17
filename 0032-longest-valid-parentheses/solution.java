class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> S=new Stack<>();
        S.push(-1);
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                S.push(i);
            else
            {
                S.pop();
                if(S.isEmpty())
                    S.push(i);
                else
                    max=Math.max(max,i-S.peek());
            }
        }
        return max;
    }
}
