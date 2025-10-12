// User function Template for Java

class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i=0;i<s.length();i++){
            if(st.peek()!=s.charAt(i))
                st.push(s.charAt(i));
        }
        StringBuilder res = new StringBuilder();
        while(!st.empty()){
            res.append(st.pop());
        }
        return res.reverse().toString();
    }
}