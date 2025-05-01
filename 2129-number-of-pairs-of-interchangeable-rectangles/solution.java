class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double,Integer> m=new HashMap<>();
        long count=0;
        for(int a[] : rectangles)
        {
            double res=Double.valueOf(a[0]) / Double.valueOf(a[1]);
            count+=m.getOrDefault(res,0);
            m.put(res,m.getOrDefault(res,0)+1);
        }
        return count;
    }
}
