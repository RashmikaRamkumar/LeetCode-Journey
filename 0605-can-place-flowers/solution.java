class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++)
        {
            boolean l=i==0 || flowerbed[i-1]==0; //first index or the prev ele = 0 --- true
            boolean r=i==flowerbed.length-1 || flowerbed[i+1]==0; 
            // last index or the next ele is equal to 0 --return true

            if(l && r && flowerbed[i]==0)
            {
                flowerbed[i]=1;
                n--;
            }
        }
        if(n<=0)
            return true;
        return false;
    }
}
