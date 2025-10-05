class Solution {
    public static int checkCompressed(String S, String T) {
        int i = 0, j = 0;
        int n = S.length(), m = T.length();
        while (i < n && j < m) {
            char c = T.charAt(j);
            if (Character.isDigit(c)) {
                int num = 0;
                while (j < m && Character.isDigit(T.charAt(j))) {
                    num = num * 10 + (T.charAt(j) - '0');
                    j++;
                }
                i += num; 
            } else {
                if (i >= n || S.charAt(i) != c) return 0;
                i++;
                j++;
            }
        }
        return (i == n && j == m) ? 1 : 0;
    }
}
