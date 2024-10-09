class Solution {
    void PreOrder(TreeNode root, List<Integer> arr){
        if(root != null){
            arr.add(root.val);
            PreOrder(root.left, arr);
            PreOrder(root.right, arr);
        }
        else {
            return;
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        PreOrder(root, arr);
        return arr;
    }
}