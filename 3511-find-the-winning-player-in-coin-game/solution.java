class Solution {
    public String winningPlayer(int x, int y) {
        int max=0;
        while(x>=1 && y>=4)
        {
            max++;
            x--;
            y-=4;
        }
        if(max%2==0)
            return "Bob";
        return "Alice";
    }
}
