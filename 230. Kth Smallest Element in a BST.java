class Solution {
    public int kthSmallest(TreeNode root, int k) {
        kth = 0;
        val = -1;
        preOrder(root, k);
        return val;
    }
    
    int kth;
    int val;
    public void preOrder(TreeNode root, int k) {
        if(root == null) return;
        preOrder(root.left, k);
        kth++;
        if(kth == k){
            val = root.val;
            return;
        }
        preOrder(root.right, k);
    }
}
