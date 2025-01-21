class Solution {
    public int minimizeXor(int num1, int num2) {
        int x=0;
        int num2Count=Integer.bitCount(num2);
        int xCount=0;
        int bit=31;

        while(xCount < num2Count)
        {
            if(isSet(num1,bit) || (num2Count - xCount > bit))
            {
                x=setBit(x,bit);
                xCount++;
            }
            bit--;
        }
        return x;
    }
    private boolean isSet(int x,int bit)
    {
        return (x &(1<<bit)) != 0;
    }
    private int setBit(int x,int bit)
    {
        return x | (1 << bit);
    }
}
