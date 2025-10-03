// User function Template for Java

class Solution {
    public boolean decode(String S) {
        // code here
        int j = 0;
        String s = "hello";
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)==s.charAt(j))
                j++;
            if(j == s.length()){
                return true;
            }
        }
        return false;
    }
}