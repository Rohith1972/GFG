// User function Template for Java

class Sol {
    Boolean balancedNumber(String N) {
        // your code here
        int mid = N.length() / 2;

        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < mid; i++) {
            leftSum += N.charAt(i) - '0';
        }
        int startRight = (N.length() % 2 == 0) ? mid : mid + 1;
        for (int i = startRight; i < N.length(); i++) {
            rightSum += N.charAt(i) - '0';
        }

        return leftSum == rightSum;
    }
}