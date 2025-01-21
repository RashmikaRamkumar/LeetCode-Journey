class Solution {
    public long gridGame(int[][] grid) {
        long firstRow=0;
        for(int i:grid[0])
            firstRow+=i;
        long secondRow=0;
        long minvalue=Long.MAX_VALUE;
        for(int turn=0;turn<grid[0].length;turn++)
        {
            firstRow-=grid[0][turn];
            minvalue=Math.min(minvalue,Math.max(firstRow,secondRow));
            secondRow+=grid[1][turn];
        }
        return minvalue;
    }
}
