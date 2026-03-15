class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        int n = s.size();
        Stack<Integer> temp = new Stack<>();
        n = n/2;
        int i=0;
        while(i<n){
            temp.push(s.pop());
            i++;
        }
        s.pop();
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }
    }
}