// User function Template for Java
class Solution {
    static String magicalString(String S) {
        // code here
        char[] ch = S.toCharArray();
        for(int i=0;i<ch.length;i++){
            ch[i]  = (char)('z' - (ch[i] - 'a'));
        }
        return String.valueOf(ch);
    }
}