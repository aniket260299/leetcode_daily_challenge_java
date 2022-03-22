/**
 * @author Aniket
 */

class Solution {
    public String getSmallestString(int n, int k) {
        char[] ans = new char[n];
        char ch = 'a' - 1;

        int i = 0;
        while (n > 0) {
            int remaining = (n - 1) * 26;
            char add = 0;

            if (k - 1 < remaining) add++;
            else add = (char) (k - remaining);
            k -= add;

            add += ch;
            ans[i++] = add;

            n--;
        }

        return new String(ans);
    }
}
