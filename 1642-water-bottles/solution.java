class Solution {
    public int numWaterBottles(int numBottles, int numExchanges) {
        int result=numBottles;
        while(numBottles>=numExchanges)
        {
            result+=numBottles/numExchanges;
            numBottles=(numBottles%numExchanges)+(numBottles/numExchanges);
        }
        return result;
    }
}
