/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Tree {
    public ArrayList<Integer> reverseLevelOrder(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        Queue<Node> q = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            stack.push(curr.data);
            if(curr.right != null)
                q.add(curr.right);
            if(curr.left != null)
                q.add(curr.left);
        }
        while(!stack.isEmpty()){
            res.add(stack.pop());
        }
        return res;
    }
}