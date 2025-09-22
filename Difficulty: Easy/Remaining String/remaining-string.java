class Solution {
    public String printString(String s, char ch, int count) {
        int occurrence = 0;
        int pos = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                occurrence++;
                if (occurrence == count) {
                    pos = i;
                    break;
                }
            }
        }
        if (pos == -1) {
            return "";  
        }
        return s.substring(pos + 1);
    }
}
