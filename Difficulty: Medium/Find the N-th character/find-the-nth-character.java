class Solution {
    public char nthCharacter(String s, int r, int n) {
        if (r == 0) return s.charAt(n);
        int parentIndex = n / 2;
        char parentChar = nthCharacter(s, r - 1, parentIndex);
        if (parentChar == '0') {
            return (n % 2 == 0) ? '0' : '1';
        } else {
            return (n % 2 == 0) ? '1' : '0';
        }
    }
}
