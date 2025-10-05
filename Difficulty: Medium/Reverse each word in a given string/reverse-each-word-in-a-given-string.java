class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] res = s.split("\\s+");
        for(int i = 0; i < res.length; i++){
            StringBuilder temp = new StringBuilder(res[i]);
            res[i] = temp.reverse().toString();
        }
        return String.join(" ", res);
    }
}
