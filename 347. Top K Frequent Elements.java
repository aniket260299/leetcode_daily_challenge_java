/**
 * @author Aniket
 */

class Solution {
    class Pair {
        int data, freq;

        public Pair(int data, int freq) {
            this.data = data;
            this.freq = freq;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int key : nums) {
            int value = map.getOrDefault(key, 0) + 1;
            map.put(key, value);
        }

        PriorityQueue<Pair> q = new PriorityQueue<>((a, b) -> b.freq - a.freq);
        map.forEach((K, V) -> q.add(new Pair(K, V)));

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) ans[i] = q.remove().data;

        return ans;
    }
}
