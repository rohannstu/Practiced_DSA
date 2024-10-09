class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder  = new ArrayList<Integer>();
        if (root == null) return preorder;

        Stack<TreeNode> stk = new Stack<TreeNode>();
        stk.push(root);

        while (!stk.isEmpty()) {
            root = stk.pop();
            preorder.add(root.val);

            if (root.right != null) {
                stk.push(root.right);
            }
            if (root.left != null) {
                stk.push(root.left);
            }
        }
        return preorder;
    }
}

