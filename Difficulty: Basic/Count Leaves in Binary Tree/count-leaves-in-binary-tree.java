/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Solution {
    static int count;
    int countLeaves(Node root) {
        // Your code
        count = 0;
        inorder(root);
        return count;
    }
    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            if(root.left==null && root.right==null)
                count++;
            inorder(root.right);
        }
    }
}