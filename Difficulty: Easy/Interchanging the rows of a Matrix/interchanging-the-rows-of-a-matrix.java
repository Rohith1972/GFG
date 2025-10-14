class Solution {
    // Function to interchange the rows of a matrix.
    static void interchangeRows(int matrix[][]) {
        // code here
        int n = matrix.length;
        for(int i=0,k=n-1;i<k;i++,k--){
            int temp[] = matrix[i];
            matrix[i] = matrix[k];
            matrix[k] = temp;
        }
    }
}
