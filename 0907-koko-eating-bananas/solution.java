// class Solution {
//     public int canEat(int[] piles,int mid)
//     {
//         int total=0;

//     }
//     public int minEatingSpeed(int[] piles, int h) {
//         int n=piles.length;
//         int total=0;
//         int speed=1;
//         int max=piles[0];
//         for(int i=1;i<=n;i++)
//         {
//             max=Math.max(max,piles[i]);
//         }
//         int left=1;
//         int right=max;

//         while(left<right)
//         {
//             int mid=(left+right)/2;
//             total=canEat(piles,mid);
//             if(total>h)
//                 break;
//             if(total<=h)
//                 right=mid-1;
//             else
//                 left=mid=1;
//         }
//         return mid;
    
//     }
// }

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canEat(piles, h, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    
    private boolean canEat(int[] piles, int h, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k; // Equivalent to ceil(pile / k)
        }
        return hours <= h;
    }
}
