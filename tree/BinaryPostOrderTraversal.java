class Solution {
    public void PostOrder(TreeNode root, List<Integer> arr) {
        if(root == null) {
            return;
        }
        else{
            PostOrder(root.left, arr);
            PostOrder(root.right, arr);
            arr.add(root.val);
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        PostOrder(root, arr);
        return arr;
    }
}