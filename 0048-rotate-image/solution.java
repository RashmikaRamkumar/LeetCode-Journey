class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse_row(matrix);
        
    }
    public static void transpose(int[][] matrix)
        {
            int i,j,n=matrix.length;
            for(i=0;i<n;i++)
            {
                for(j=i+1;j<n;j++)
                {
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
        public static void reverse_row(int[][] matrix)
        {
            int i,j,n=matrix.length;
            for(i=0;i<n;i++)
            {
                for(j=0;j<n/2;j++)
                {
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[i][n-j-1];
                    matrix[i][n-j-1]=temp;
                }
            }
        }
}
