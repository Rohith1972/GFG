import java.util.*;

class Solution {
    public String remove3ConsecutiveDuplicates(String S) {
        Stack<Pair> st = new Stack<>();
        for (char c : S.toCharArray()) {
            if (!st.isEmpty() && st.peek().ch == c) {
                st.peek().count++;
                if (st.peek().count == 3) {
                    st.pop(); 
                }
            } else {
                st.push(new Pair(c, 1));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Pair p : st) {
            for (int i = 0; i < p.count; i++) {
                sb.append(p.ch);
            }
        }
        
        return sb.length() == 0 ? "-1" : sb.toString();
    }
}
class Pair {
    char ch;
    int count;
    Pair(char ch, int count) {
        this.ch = ch;
        this.count = count;
    }
}
