class Solution {
    public long modify(long N) {
        String s = String.valueOf(N);
        StringBuilder res = new StringBuilder();
        res.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                res.append(s.charAt(i));
            }
        }
        return Long.parseLong(res.toString());
    }
}
