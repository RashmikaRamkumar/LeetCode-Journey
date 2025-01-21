class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int t=0,b=matrix.length-1;
        int l=0,r=matrix[0].length-1;
        List<Integer> list1=new ArrayList<>();
        while(t<=b && l<=r)
        {
            for(int i=l;i<=r;i++)
                list1.add(matrix[t][i]);
            t++;
            for(int i=t;i<=b;i++)
                list1.add(matrix[i][r]);
            r--;
            if(t<=b)
            {
                for(int i=r;i>=l;i--)
                    list1.add(matrix[b][i]);
                b--;
            }
            if(l<=r)
            {
                for(int i=b;i>=t;i--)
                    list1.add(matrix[i][l]);
                l++;
            }

        }
        return list1;
    }
}
