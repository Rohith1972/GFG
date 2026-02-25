/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/
class Solution {
    public boolean areIdentical(Node head1, Node head2) {
        Node t = head1;
        Node p = head2;
        while (t != null && p != null) {
            if (t.data != p.data)
                return false;
            t = t.next;
            p = p.next;
        }
        return (t == null && p == null);
    }
}