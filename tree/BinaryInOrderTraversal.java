class Solution {
    public void InOrder(TreeNode root, List<Integer> arr) {
        if(root == null) {
            return;
        }
        else{
            InOrder(root.left, arr);
            arr.add(root.val);
            InOrder(root.right, arr);
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        InOrder(root, arr);
        return arr;
    }
}