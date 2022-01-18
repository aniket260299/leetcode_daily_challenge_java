/**
 * @author Aniket
 */
class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length() - 1;

        //removing white space
        while (i <= n && (s.charAt(i) == ' '))
            i++;

        //checking sign
        int sign = 1;
        if (i <= n && s.charAt(i) == '+') {
            sign = 1;
            i++;
        } else if (i <= n && s.charAt(i) == '-') {
            i++;
            sign = -1;
        }

        //converting to num
        int val = 0;
        int mt = Integer.MAX_VALUE / 10;
        int mod = Integer.MAX_VALUE % 10;
        for (int j = i; j <= n && Character.isDigit(s.charAt(j)); j++) {
            int d = s.charAt(j) - '0';
            if (mt < val || mt == val && mod < d)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            val = val * 10 + d;
        }
        return sign * val;
    }
}