/*
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public static int fractional_node(Node head, int k) {
        // Your code here
        int n = 1;
        Node p = head;
        while(p.next!=null){
            p = p.next;
            n++;
        }
        double c = Math.ceil(n/(double)k);
        int i = 1;
        Node t = head;
        while(i != c){
            i++;
            t = t.next;
        }
        return t.data;
    }
}