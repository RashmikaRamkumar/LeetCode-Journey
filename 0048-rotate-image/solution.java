class Solution {
    public int[][] transpose(int[][] matrix)
    {

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i+1;j<matrix.length;j++)
            {
                int temp;
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        return matrix;        
    }
    public void row_rev(int[][] matrix)
    {
        int n=matrix.length;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length/2;j++)
            {
                int temp;
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }
    }
    public void rotate(int[][] matrix) {
        
        row_rev(transpose(matrix));
    }
}
