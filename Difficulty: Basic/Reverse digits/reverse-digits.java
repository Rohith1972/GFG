// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int num = 0;
        int x = n;
        while(n!=0){
            int r = n%10;
            num = num * 10 + r;
            n = n / 10;
        }
        return num;
    }
}