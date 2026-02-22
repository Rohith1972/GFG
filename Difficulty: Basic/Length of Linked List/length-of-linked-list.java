/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    public int getCount(Node head) {
        // code here
        Node p = head;
        int count = 1;
        while(p.next!=null){
            count++;
            p=p.next;
        }
        return count;
    }
}