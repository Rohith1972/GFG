class Solution {
    /* Returns level of given data value */
    int getLevel(Node node, int data) {
        // Write your code here
        Node curr = node;
        int level = 1;
        while(curr != null){
            if(curr.data == data)
                return level;
            else if(data < curr.data)
                curr = curr.left;
            else
                curr = curr.right;
            level++;
        }
        return 0;
    }
}