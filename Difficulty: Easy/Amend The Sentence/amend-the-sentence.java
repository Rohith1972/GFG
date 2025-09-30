// User function Template for Java

class Solution {
    public String amendSentence(String s) {
        // code here
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c))
                res.append(" ");
            res.append(Character.toLowerCase(c));
        }
        return new String(res);
    }
}
