/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public void deleteAlt(Node head) {
        Node p = head;
        while(p!=null && p.next!=null){
            p.next = p.next.next;
            p = p.next;
        }
    }
}