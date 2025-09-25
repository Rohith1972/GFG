class Solution {
    static String revStr(String ch) {
        char[] s = ch.toCharArray();
        // code here
        int i =0;
        int j = s.length-1;
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(s);
    }
}