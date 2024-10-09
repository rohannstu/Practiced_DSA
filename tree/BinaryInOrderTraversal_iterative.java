class Solution {
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> arr = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        if(root == null) return arr;
        TreeNode node = root;
        while(true){
            if(node == null){
                if(stk.isEmpty()){
                    break;
                }
                node = stk.pop();
                arr.add(node.val);
                node = node.right;
            }
            else{
                stk.push(node);
                node = node.left;
            }
        }
        return arr;
    }
}