// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public static boolean searchLinkedList(Node head, int x) {
        // Your code here
        Node t = head;
        while(t.next!=null){
            if(t.data == x)
                return true;
            t = t.next;
        }
        return false;
    }
}