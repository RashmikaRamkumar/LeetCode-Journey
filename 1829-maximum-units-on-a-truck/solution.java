class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b) -> b[1]-a[1]);
        int maxUnits=0;
        for(int box[] : boxTypes)
        {
            int take=Math.min(box[0],truckSize);
            maxUnits+=take*box[1];
            truckSize-=take;
            if(truckSize==0)
                break;
        }
        return maxUnits;

    }
}
