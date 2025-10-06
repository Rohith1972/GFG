class Sol {
    public static int maxOnes(int Mat[][], int N, int M) {
        int maxRow = -1, row = 0, col = M - 1;
        while (row < N && col >= 0) {
            if (Mat[row][col] == 1) {
                maxRow = row;
                col--;
            } else {
                row++;
            }
        }
        return (maxRow == -1) ? 0 : maxRow;
    }
}
