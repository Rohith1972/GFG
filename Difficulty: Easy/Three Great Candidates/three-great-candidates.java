// User function Template for Java

class Solution {
    int maxProduct(int[] A) {
        // code here
        Arrays.sort(A);
        int n = A.length;
        int p1 = A[0]*A[1]*A[n-1];
        int p2 = A[n-1]*A[n-2]*A[n-3];
        return (p1>p2)?p1:p2;
    }
}
