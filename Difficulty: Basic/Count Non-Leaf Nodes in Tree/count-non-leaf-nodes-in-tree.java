/*class Node
{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/

// function should return the count of total number of non leaf nodes in the tree.
class Solution {
    static int count;
    int countNonLeafNodes(Node root) {
        // Your code
        count = 0;
        inorder(root);
        return count;
    }
    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            if(root.left!=null || root.right!=null)
                count++;
            inorder(root.right);
        }
    }
}