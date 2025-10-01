// User function Template for Java
class Solution {
    static String reciprocalString(String S) {
        // code here
        char ch[] = S.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]!=' '){
                if(Character.isUpperCase(ch[i]))
                    ch[i] = (char)('Z'-(ch[i]-'A'));
                else
                    ch[i] = (char)('z'-(ch[i]-'a'));
            }
        }
        return String.valueOf(ch);
    }
}