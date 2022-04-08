/**
 * @author Aniket
 */

class KthLargest {
    int k;
    PriorityQueue<Integer> queue;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.queue = new PriorityQueue<>();
        for (int num : nums) queue.add(num);
    }

    public int add(int val) {
        queue.add(val);
        while (queue.size() > k) queue.remove();
        return queue.peek();
    }
}
