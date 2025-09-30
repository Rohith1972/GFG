// User function Template for Java

class Solution {
    static String triDownwards(String s) {
        // code here
        String res = "";
        for(int i=0;i<s.length();i++){
            for(int k=0;k<i;k++){
                res+=".";
            }
            for(int j=i;j<s.length();j++){
                res+=s.charAt(j);
            }
        }
        return res;
    }
};