/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        Node fp = head;
        Node sp = head;
        while(fp != null && fp.next != null){
            fp = (fp.next).next;
            sp = sp.next;
        }
        return sp.data;
    }
}