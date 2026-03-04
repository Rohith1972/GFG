/*node class of the binary ssearch tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}*/
class Solution {
    static int sum;
    public static int sumOfLeafNodes(Node root) {
        // code here
        sum = 0;
        inorder(root);
        return sum;
    }
    static void inorder(Node root){
    if(root!=null){
      inorder(root.left);
      if(root.left==null && root.right==null)
        sum += root.data;
      inorder(root.right);
    }
  }
}