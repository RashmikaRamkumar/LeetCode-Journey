class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int n,ans=0;
        n=seats.length;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0;i<n;i++)
        {
            ans+=Math.abs(seats[i]-students[i]);
        }
        return ans;
    }
}
