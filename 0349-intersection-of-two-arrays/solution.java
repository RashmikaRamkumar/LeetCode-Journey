class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        for(int a:nums1)
            s1.add(a);
        for(int a:nums2)
            s2.add(a);
        s1.retainAll(s2);
        int[] arr=new int[s1.size()];
        int j=0;
        for(int num:s1)
        {
            arr[j++]=num;
        }   
        return arr; 
        }
}
