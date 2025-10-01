// User function Template for Java
class Solution {
    long findDiff(long amount) {
        // code here
        String s = String.valueOf(amount);
        String res = s.replace('6','9');
        long num = Long.parseLong(res);
        return num-amount;
    }
}
