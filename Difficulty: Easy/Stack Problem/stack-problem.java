// User function Template for Java

class Solution{
    static Stack<Integer> deleteMid(int n, Stack<Integer> st)
    {
        // code here
        Stack<Integer> temp = new Stack<>();
        n = n/2;
        int i=0;
        while(i<n){
            temp.push(st.pop());
            i++;
        }
        st.pop();
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        return st;
    }
}