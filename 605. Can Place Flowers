/**
 * @author Aniket
 */
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int N = flowerbed.length;
        for (int i = 0; i < N; i++) {
            if (n == 0)
                break;
            if (flowerbed[i] == 0) {
                int prev = 0;
                int next = 0;
                if (i - 1 >= 0)
                    prev = flowerbed[i - 1];
                if (i + 1 < N)
                    next = flowerbed[i + 1];
                if (next == 0 && prev == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n == 0;
    }
}
