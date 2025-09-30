// User function Template for Java

class Solution {
    static String snakeCase(String S, int n) {
        // code here
        String s = S.toLowerCase();
        char[] ch = s.toCharArray();
        for(int i=0;i<n;i++){
            if(ch[i]==' ')
                ch[i]='_';
        }
        return String.valueOf(ch);
    }
};