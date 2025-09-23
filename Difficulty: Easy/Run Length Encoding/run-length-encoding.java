class Solution {
    public static String encode(String s) {
        // code here
        StringBuilder res = new StringBuilder();
        char ch = s.charAt(0);
        res.append(ch);
        int count = 1;
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
        return res.toString();
    }
}