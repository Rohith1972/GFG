// User function Template for Java

class Solution {
    static long sumMatrix(long n, long q) {
        // code here
        if (q < 2 || q > 2 * n)
            return 0;
        return Math.max(0, Math.min(n, q - 1) - Math.max(1, q - n) + 1);
    }
}