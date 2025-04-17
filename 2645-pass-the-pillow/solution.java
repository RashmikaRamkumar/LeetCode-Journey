class Solution {
    public int passThePillow(int n, int t) {
        int pos=t%(2*(n-1));
        return pos<n ? pos+1 : 2*n-pos-1;
    }
}
