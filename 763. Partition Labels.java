/**
 * @author Aniket
 */

class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int idx = s.charAt(i) - 'a';
            last[idx] = i;
        }

        List<Integer> partition = new ArrayList(26);
        int start = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int idx = s.charAt(i) - 'a';
            int lIdx = last[idx];
            max = Math.max(lIdx, max);

            if (max == i) {
                partition.add(max - start + 1);
                start = i + 1;
            }
        }

        return partition;

    }
}
