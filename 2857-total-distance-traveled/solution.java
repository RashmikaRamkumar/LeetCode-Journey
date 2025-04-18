class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        // int leftOver= mainTank<5 ? mainTank : (mainTank/5)+mainTank;
        // return leftOver*10;
        int res=0;
        for(int i=1;i<=mainTank;i++)
        {
            if(additionalTank!=0 && i%5==0)
            {
                additionalTank-=1;
                mainTank+=1;
            }
            res+=10;
        }
        return res;

        // int distance = 0;
        // while (mainTank >= 5 && additionalTank >= 1) {
        //     distance += 5 * 10;
        //     mainTank -= 4;
        //     additionalTank -= 1;
        // }
        // return distance + (mainTank * 10);
    }
}
