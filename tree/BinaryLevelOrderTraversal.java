class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> superList = new LinkedList<>();
        if (root == null) return superList;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> subList = new LinkedList<>();
            int Qsize = queue.size();

            for (int i = 0; i < Qsize; i++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);

                subList.add(queue.poll().val);
            }

            superList.add(subList);
        }
        return superList;
    }
}
