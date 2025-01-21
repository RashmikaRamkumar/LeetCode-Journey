class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s=new Stack<>();
        int n=heights.length;
        int[] min_l=new int[n];
        int[] min_r=new int[n];
        
        s.push(0);

        for(int i=0;i<n;i++)
        {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) 
            {
                s.pop();
            }
            if(s.isEmpty())
                min_l[i]=0;
            else{
                min_l[i]=s.peek()+1;
            }
            s.push(i);

        }
        while(!s.isEmpty())
        {
            s.pop();
        }
        s.push(n-1);
        for(int i=n-1;i>=0;i--)
        {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) 
                s.pop();

            if(s.isEmpty())
                min_r[i]=n-1;
            else
            {
                min_r[i]=s.peek()-1;
                
            }
            s.push(i);
        }
        
        int max=0;
        for(int i=0;i<n;i++)
            max=Math.max(max,heights[i]*(min_r[i]-min_l[i]+1));
        return max;
    }
    
}
