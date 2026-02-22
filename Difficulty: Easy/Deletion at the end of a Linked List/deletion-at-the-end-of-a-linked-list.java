/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Solution {
    public Node removeLastNode(Node head) {
        // code here
        if(head.next == null)
            return null;
        Node t = head.next;
        Node p = head;
        while(t.next!=null){
            t = t.next;
            p = p.next;
        }
        p.next = null;
        System.gc();
        return head;
    }
}