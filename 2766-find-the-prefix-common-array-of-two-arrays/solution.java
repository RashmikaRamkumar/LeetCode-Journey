class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=B.length;
        int[] res=new int[n];
        Set<Integer> commonA=new HashSet<>();
        Set<Integer> commonB=new HashSet<>();
       
        for(int i=0;i<n;i++)
        {
            commonA.add(A[i]);
            commonB.add(B[i]);
            int count=0;
            for(int ele : commonA)
            {   
                if(commonB.contains(ele))
                    count++;
            }
            res[i]=count;
        }
        return res;
    }
}
