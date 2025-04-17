class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int r=purchaseAmount%10;
        if(r==0)
            return 100-purchaseAmount;
        else if(r<5)
        {
            int t=purchaseAmount-r;
            return 100-t;
        }
        int t=10-r;
        purchaseAmount+=t;
        return 100-purchaseAmount;

    }
}
