class Solution {
    public static String removePair(String s) {
        // code here
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
            int len = res.length();
            if(len>0 && res.charAt(len-1)==c)
                res.deleteCharAt(len-1);
            else
                res.append(c);
        }
        return res.toString();
    }
}