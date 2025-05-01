class Solution {
    public int distanceTraveled(int mt, int at) {
        if(mt<5)
            return mt*10;
        int totalDist=0;
        while(mt>=5)
        {
            totalDist+=5;
            if(at!=0)
            {
                mt-=4;
                at--;
            }
            else
                mt-=5;
        }
        totalDist+=mt;
        return totalDist*10;
    }
}
