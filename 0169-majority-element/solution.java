class Solution {
    public int majorityElement(int[] nums) {
        int a = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                a = nums[i];
                count = 1;
            } else if (a == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        int m = 0;
        for (int num : nums) {
            if (num == a) {
                m++;
            }
        }

        return (m>nums.length/2)? a : -1;
    }
}

