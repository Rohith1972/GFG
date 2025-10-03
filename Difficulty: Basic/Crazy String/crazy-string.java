// User function Template for Java

class Solution {
    static String getCrazy(String s) {
        char[] ch = s.toCharArray();
        boolean firstIsUpper = Character.isUpperCase(ch[0]);
        for (int i = 1; i < ch.length; i++) {
            if(i % 2 == 0) {
                if(firstIsUpper) 
                    ch[i] = Character.toUpperCase(ch[i]);
                else 
                    ch[i] = Character.toLowerCase(ch[i]);
            }else{
                if(firstIsUpper) 
                    ch[i] = Character.toLowerCase(ch[i]);
                else 
                    ch[i] = Character.toUpperCase(ch[i]);
            }
        }
        return String.valueOf(ch);
    }
}
