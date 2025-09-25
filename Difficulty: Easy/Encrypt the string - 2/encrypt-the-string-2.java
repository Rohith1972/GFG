class Solution {
    static String encryptString(String s) {
        if (s == null || s.length() == 0) 
            return "";
        java.util.List<String> parts = new java.util.ArrayList<>();
        char ch = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ch) {
                count++;
            } else {
                parts.add(Integer.toHexString(count) + ch);
                ch = c;
                count = 1;
            }
        }
        parts.add(Integer.toHexString(count) + ch);
        StringBuilder res = new StringBuilder();
        for (int i = parts.size() - 1; i >= 0; i--) {
            res.append(parts.get(i));
        }
        return res.toString();
    }
}
