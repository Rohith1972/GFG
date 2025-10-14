class Solution {
    public void rotateMatrix(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Reverse each row (mirror horizontally)
        for (int i = 0; i < n; i++) {
            for (int j = 0, k = n - 1; j < k; j++, k--) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }

        // Step 2: Reverse the order of rows (flip vertically)
        for (int i = 0, k = n - 1; i < k; i++, k--) {
            int[] temp = matrix[i];
            matrix[i] = matrix[k];
            matrix[k] = temp;
        }
    }
}
