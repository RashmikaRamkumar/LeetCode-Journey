class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones)
            pq.offer(i);

        while(true)
        {
            if(pq.isEmpty())
                return 0;
            int t1=pq.poll();
            if(pq.isEmpty())
                return t1;
            int t2=pq.poll();
            if(t1==t2)
                continue;
            else
                pq.offer(t1-t2);
        }
    }
}
