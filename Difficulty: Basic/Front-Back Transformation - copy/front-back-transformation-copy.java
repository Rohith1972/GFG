class Solution {
    public String convert(String S) {
        char[] ch = S.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLowerCase(ch[i])) {
                ch[i] = (char) ('a' + ('z' - ch[i]));
            } else if (Character.isUpperCase(ch[i])) {
                ch[i] = (char) ('A' + ('Z' - ch[i]));
            }
        }
        return new String(ch);
    }
}
