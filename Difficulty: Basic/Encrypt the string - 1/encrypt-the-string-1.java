// User function Template for Java
class Solution {
    String encryptString(String s) {
        // code here
        char ch = s.charAt(0);
        int count=1;
        StringBuilder res = new StringBuilder(String.valueOf(ch));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==ch)
                count++;
            else{
                res.append(count);
                ch = s.charAt(i);
                res.append(ch);
                count=1;
            }
        }
        res.append(count);
        return res.reverse().toString();
    }
}