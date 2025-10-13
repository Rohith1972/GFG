// User function Template for Java
class Solution {
    String transform(String S) {
        // code here
        String s = S.toLowerCase();
        StringBuilder res = new StringBuilder();
        char ch = s.charAt(0);
        int count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==ch)
                count++;
            else{
                res.append(count);
                res.append(ch);
                ch = s.charAt(i);
                count=1;
            }
        }
        res.append(count);
        res.append(ch);
        return res.toString();
    }
}