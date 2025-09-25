// User function Template for Java

class Solution {
    public int countSub(String str) {
        int n = str.length();
        int totalClose = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ')') totalClose++;
        }
        int openCount = 0, closeCount = 0;
        if (openCount == totalClose - closeCount)
            return 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '(') openCount++;
            else closeCount++;
            if (openCount == totalClose - closeCount) {
                return i + 1; 
            }
        }
        return 0; 
    }
}