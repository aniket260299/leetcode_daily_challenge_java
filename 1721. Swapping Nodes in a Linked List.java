/**
 * @author Aniket
 */

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        int p = 1;
        ListNode curr = head;
        while (p != k) {
            curr = curr.next;
            p++;
        }

        ListNode p1, p2;
        p1 = head;
        p2 = curr;

        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        int temp = curr.val;
        curr.val = p1.val;
        p1.val = temp;

        return head;
    }
}
