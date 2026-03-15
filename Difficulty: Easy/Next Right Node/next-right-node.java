class Solution {
    Node nextRight(Node root, int key) {
        // Write your code here
        if(root.right==null && root.left==null){
            return new Node(-1);
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node curr = q.poll();
                if(curr != null && curr.data == key){
                    if(i == size - 1){
                        return new Node(-1);
                    }
                    return q.peek();
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        return new Node(-1);
    }
}