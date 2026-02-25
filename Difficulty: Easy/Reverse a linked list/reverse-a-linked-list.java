/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Stack<Integer> st = new Stack<>();
        Node p = head;
        while(p != null){
            st.push(p.data);
            p = p.next;
        }
        //System.out.println(st.size());
        Node t = head;
        while(t != null){
            t.data = st.pop();
            t = t.next;
        }
        return head;
    }
}