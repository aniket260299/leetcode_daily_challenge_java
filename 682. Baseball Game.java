/**
 * @author Aniket
 */

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        for (String s : ops) {
            if (s.equals("C")) {
                st.pop();
            } else if (s.equals("D")) {
                int data = 2 * st.peek();
                st.push(data);
            } else if (s.equals("+")) {
                int a = st.pop();
                int b = st.peek();
                int c = a + b;
                st.push(a);
                st.push(c);
            } else {
                st.push(Integer.valueOf(s));
            }
        }

        int sum = 0;
        while (!st.isEmpty()) sum += st.pop();

        return sum;
    }
}
