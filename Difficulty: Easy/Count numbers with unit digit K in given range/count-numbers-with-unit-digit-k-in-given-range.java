class Solution {
    static long countLastDigitK(long low, long high, long K) {
        return countUpTo(high, K) - countUpTo(low - 1, K);
    }
    static long countUpTo(long n, long k){
        if (n<k) return 0;
        return ((n-k)/10)+1;
    }
}
