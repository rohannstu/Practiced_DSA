/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Tree
{
    ArrayList<Integer> leftView(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            //The size of the queue q.size() is dynamic,
            //meaning it changes as you poll() elements from it.
            //So, using q.size() directly in the for loop may cause
            //unintended behavior because the size changes with each iteration.
            for (int i = 0; i < size; i++) {
                Node curr_node = q.poll();
                if (i == 0) {
                    list.add(curr_node.data);
                }
                if (curr_node.left != null) {
                    q.add(curr_node.left);
                }
                if (curr_node.right != null) {
                    q.add(curr_node.right);
                }
            }
        }
        return list;
    }
}