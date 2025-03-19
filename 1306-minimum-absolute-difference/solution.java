class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(arr);
        // int min=Math.abs(arr[0]-arr[1]);
        //System.out.println(min);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            int diff=Math.abs(arr[i]-arr[i+1]);
            min=Math.min(min,diff);
        }
        for(int i=0,j=i+1;j<arr.length;i++,j++)
        {
            //System.out.printf("i: %d, j: %d%n", i, j);
            int temp=Math.abs(arr[i]-arr[j]);
            //System.out.println(temp);
            if(temp==min)
            {
                res.add(Arrays.asList(arr[i],arr[j]));
            }
        }
        return res;
    }
}
