// User function Template for Java

class Solution {
    String removeCharacters(String s) {
        // code here
        char ch[] = s.toCharArray();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<ch.length;i++){
            if(Character.isDigit(ch[i]))
                res.append(ch[i]);
        }
        return res.toString();
    }
}