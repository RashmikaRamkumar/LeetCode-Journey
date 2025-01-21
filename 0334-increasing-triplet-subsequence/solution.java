class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i=Integer.MAX_VALUE,j=Integer.MAX_VALUE;
        for(int num : nums)
        {
            if(num<=i)
                i=num; // if so found the first small number
            else if(num<=j)
                j=num; 
                // if so found the second smallest num i.e which u\is greater than our current first small
            else
                return true; // if its greater than first and second it seem to be the expected triplet sequence
        }
        return false; // if such sequence is not met in running the whole loop then we should return false;
    }
}
