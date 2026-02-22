/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node p = new Node(x);
        if(head == null)
            return p;
        Node t = head;
        while(t.next!=null){
            t=t.next;
        }
        t.next = p;
        return head;
    }
}