class Solution {
    public int singleNumber(int[] nums) {
        int unique=0;
        for(int num:nums)
        {
            unique^=num;
        }
        return unique;
        
    }
}
/*a⊕a=0 (Any number XORed with itself is 0)
\U0001d44e⊕0=\U0001d44e(Any number XORed with 0 is the number itself)*/
