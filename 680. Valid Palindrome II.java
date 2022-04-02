/**
 * @author Aniket
 */

class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        if (n <= 2) return true;

        int i = 0, j = n - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                break;
            i++;
            j--;
        }

        return validPalindrome(s, i + 1, j)
                || validPalindrome(s, i, j - 1);
    }

    public boolean validPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
