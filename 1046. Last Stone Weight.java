/**
 * @author Aniket
 */

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) q.add(stone);
        while (q.size() > 1) {
            int a = q.remove();
            int b = q.remove();
            if (a == b) continue;
            q.add(a - b);
        }

        if (q.isEmpty()) return 0;
        else return q.peek();
    }
}
