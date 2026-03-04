class Solution {
    // Function to return the level order traversal of a BST.
    static ArrayList<Integer> levelOrder(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root == null)
            return res;
        q.add(root);
        while(!q.isEmpty()){
			int size = q.size();
            for(int i=0;i<size;i++){
                Node curr = q.poll();
                res.add(curr.data);
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
        return res;
    }
}